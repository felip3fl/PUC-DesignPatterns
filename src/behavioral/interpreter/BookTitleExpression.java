package behavioral.interpreter;
import java.util.ArrayList;
import java.util.ListIterator;


public class BookTitleExpression extends BookAbstractExpression{
	public String interpret(BookInterpreterContext parm) {
	    ArrayList titles = parm.getAllTitles();
	    ListIterator titlesIterator = titles.listIterator();
	    StringBuffer titleBuffer = new StringBuffer("");
	    boolean first = true;
	    while (titlesIterator.hasNext()) {
	      if (!first) {titleBuffer.append(", ");}
	      else {first = false;}
	      titleBuffer.append((String)titlesIterator.next());
	    }
	    return titleBuffer.toString();
	  }
}
