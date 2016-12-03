package behavioral.interpreter;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class BookInterpreterClient {
	BookInterpreterContext bookInterpreterContext;
	  public BookInterpreterClient(BookInterpreterContext parm) {
	    bookInterpreterContext = parm;
	  }
	  // language syntax:
	  // show title
	  // show author
	  // show title for author <author-name>
	  // show author for title <title-name>
	  public String interpret(String expression) {
	    StringTokenizer expressionTokens = new StringTokenizer(expression);
	    String currentToken;
	    char mainQuery = ' ';
	    char subQuery = ' ';
	    String searchString = null;
	    boolean forUsed = false;
	    boolean searchStarted = false;
	    boolean searchEnded = false;
	    StringBuffer result = new StringBuffer();
	    while (expressionTokens.hasMoreTokens()) {
	      currentToken = expressionTokens.nextToken();
	      if (currentToken.equals("show")) {
	        continue;//show in all queries, not really used
	      } else if (currentToken.equals("title")) {
	        if (mainQuery == ' ') {
	          mainQuery = 'T';
	        } else  {
	          if ((subQuery == ' ') && (forUsed)) {
	            subQuery = 'T';
	          }
	        }
	      } else if (currentToken.equals("author")) {
	        if (mainQuery == ' ') {
	          mainQuery = 'A';
	        }  else {
	          if ((subQuery == ' ') && (forUsed)) {
	            subQuery = 'A';
	          }
	        }
	      } else if (currentToken.equals("for")) {
	        forUsed = true;
	      } else if ((searchString == null) && (subQuery != ' ') && (currentToken.startsWith("<"))) {
	        searchString = currentToken;
	        searchStarted = true;
	        if (currentToken.endsWith(">")) {
	          searchEnded = true;
	        }
	      } else if ((searchStarted) && (!searchEnded)) {
	        searchString = searchString + " " + currentToken;
	        if (currentToken.endsWith(">")) {
	          searchEnded = true;
	        }
	      }
	    }
	    if (searchString != null) {
	      searchString = searchString.substring(1,(searchString.length() - 1));//remove <>
	    }
	    BookAbstractExpression abstractExpression;
	    switch (mainQuery) {
	      case 'A' : {
	       switch (subQuery) {
	         case 'T' : {
	           abstractExpression = new BookAuthorTitleExpression(searchString);
	           break;
	         } default : {
	           abstractExpression = new BookAuthorExpression();
	           break;
	         }
	       }
	       break;
	      } case 'T' : {
	       switch (subQuery) {
	         case 'A' : {
	           abstractExpression = new BookTitleAuthorExpression(searchString);
	           break;
	         } default : {
	           abstractExpression = new BookTitleExpression();
	           break;
	         }
	       }
	       break;
	      } default : return result.toString();
	    }
	    result.append(abstractExpression.interpret(bookInterpreterContext));
	    return result.toString();
	  }
}
