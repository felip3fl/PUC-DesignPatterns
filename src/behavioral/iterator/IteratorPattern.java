package behavioral.iterator;

public class IteratorPattern {
	public static void main(String[] args) {
	    System.out.println("Iterator Pattern Demonstration.");
	    System.out.println("-------------------------------");
	    System.out.println("Paises.");
	    String[] books = new String[8];
	    books[0] = "Historia do Brasil";
	    books[1] = "Historia da Argentina";
	    books[2] = "Historia do Canada";
	    books[3] = "Historia dos EUA";
	    books[4] = "Historia da Australia";
	    books[5] = "Historia da Inglaterra";
	    books[6] = "Historia da Russia e URSS";
	    books[7] = "Historia do Marrocos";
	    // Turn the string array into a collection.
	    System.out.println("Turning string array into a collection.");
	    CollectionIF collection = new ConcreteCollection(books);
	    // Get an iterator for the collection.
	    System.out.println("Getting an iterator for the collection..");
	    IteratorIF iterator = collection.iterator();
	    // Iterate thorugh and print each object in the list.
	    System.out.println("Iterate thorugh the list.");
	    int i = 0;
	    while (iterator.hasNext()) {
	      System.out.println((++i)+" "+iterator.next());
	    }
	    System.out.println();
	  }
}
