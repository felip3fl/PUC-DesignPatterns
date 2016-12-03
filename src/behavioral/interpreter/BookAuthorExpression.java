package behavioral.interpreter;
import java.util.ArrayList;
import java.util.ListIterator;

public class BookAuthorExpression extends BookAbstractExpression{
	public String interpret(BookInterpreterContext parm) {
	    ArrayList authors = parm.getAllAuthors();
	    ListIterator authorsIterator = authors.listIterator();
	    StringBuffer titleBuffer = new StringBuffer("");
	    boolean first = true;
	    while (authorsIterator.hasNext()) {
	      if (!first) {titleBuffer.append(", ");}
	      else {first = false;}
	      titleBuffer.append((String)authorsIterator.next());
	    }
	    return titleBuffer.toString();
	  }
}
