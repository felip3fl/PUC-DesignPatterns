package behavioral.interpreter;
import java.util.ArrayList;
import java.util.ListIterator;


public class BookInterpreterContext {
	private ArrayList titles = new ArrayList();
	private ArrayList authors = new ArrayList();
	private ArrayList titlesAndAuthors = new ArrayList();
	
	public void addTitle(String title) {
		titles.add(title);
	}
	
	public void addAuthor(String author) {
		authors.add(author);
	}
	
	public void addTitleAndAuthor(TitleAndAuthor titleAndAuthor) {
		titlesAndAuthors.add(titleAndAuthor);
	}
	
	public ArrayList getAllTitles() {
		return titles;
	}
	
	public ArrayList getAllAuthors() {
		return authors;
	}
	
	public ArrayList getAuthorsForTitle(String titleIn) {
	    ArrayList authorsForTitle = new ArrayList();
	    TitleAndAuthor tempTitleAndAuthor;
	    ListIterator titlesAndAuthorsIterator = titlesAndAuthors.listIterator();
	    while (titlesAndAuthorsIterator.hasNext()) {
	      tempTitleAndAuthor = (TitleAndAuthor)titlesAndAuthorsIterator.next();
	      if (titleIn.equals(tempTitleAndAuthor.getTitle())) {
	        authorsForTitle.add(tempTitleAndAuthor.getAuthor());
	      }
	    }
	    return authorsForTitle;
	  }
	  
	public ArrayList getTitlesForAuthor(String authorIn) {
	    ArrayList titlesForAuthor = new ArrayList();
	    TitleAndAuthor tempTitleAndAuthor;
	    ListIterator authorsAndTitlesIterator = titlesAndAuthors.listIterator();
	    while (authorsAndTitlesIterator.hasNext()) {
	      tempTitleAndAuthor = (TitleAndAuthor)authorsAndTitlesIterator.next();
	      if (authorIn.equals(tempTitleAndAuthor.getAuthor())) {
	        titlesForAuthor.add(tempTitleAndAuthor.getTitle());
	      }
	    }
	    return titlesForAuthor;
	  }
}
