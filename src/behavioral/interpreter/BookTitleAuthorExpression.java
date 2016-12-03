package behavioral.interpreter;
import java.util.ArrayList;
import java.util.ListIterator;

public class BookTitleAuthorExpression extends BookAbstractExpression{
	String title;
	  public BookTitleAuthorExpression(String parm) {title = parm;}
	  public String interpret(BookInterpreterContext parm) {
	    ArrayList titlesAndAuthors = parm.getTitlesForAuthor(title);
	    ListIterator titlesAndAuthorsIterator = titlesAndAuthors.listIterator();
	    StringBuffer titleBuffer = new StringBuffer("");
	    boolean first = true;
	    while (titlesAndAuthorsIterator.hasNext()) {
	      if (!first) {titleBuffer.append(", ");}
	      else {first = false;}
	      titleBuffer.append((String)titlesAndAuthorsIterator.next());
	    }
	    return titleBuffer.toString();
	  }
}
