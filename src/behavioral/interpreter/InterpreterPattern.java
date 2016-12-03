package behavioral.interpreter;

public class InterpreterPattern {
	public static void main(String[] args) {
	    System.out.println("Interpreter Pattern Demonstration.");
	    System.out.println("----------------------------------");
	    BookInterpreterContext bookInterpreterContext = new BookInterpreterContext();
	    bookInterpreterContext.addTitle("Pickwick Papers");
	    bookInterpreterContext.addTitle("Great Expectations");
	    bookInterpreterContext.addTitle("Wuthering Heights");
	    bookInterpreterContext.addTitle("Crossfile");
	    bookInterpreterContext.addAuthor("William Shakespeare");
	    bookInterpreterContext.addAuthor("Emily Bronte");
	    bookInterpreterContext.addAuthor("James Marathon");
	    bookInterpreterContext.addTitleAndAuthor(new TitleAndAuthor("Pickwick Papers", "William Shakespeare"));
	    bookInterpreterContext.addTitleAndAuthor(new TitleAndAuthor("Great Expectations", "William Shakespeare"));
	    bookInterpreterContext.addTitleAndAuthor(new TitleAndAuthor("Wuthering Heights", "Emily Bronte"));
	    bookInterpreterContext.addTitleAndAuthor(new TitleAndAuthor("Crossfire", "James Marathon"));
	    BookInterpreterClient bookInterpreterClient = new BookInterpreterClient(bookInterpreterContext);
	    System.out.println("show author ->" + bookInterpreterClient.interpret("show author"));
	    System.out.println("show title ->" + bookInterpreterClient.interpret("show title"));
	    System.out.println("show author for title <Crossfire> ->" + bookInterpreterClient.interpret("show author for title <Crossfire>"));
	    System.out.println("show title for author <William Shakespeare> ->" + bookInterpreterClient.interpret("show title for author <William Shakespeare>"));
	    System.out.println();
	  }
}
