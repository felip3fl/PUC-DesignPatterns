package behavioral.nullObject;

public class NullObjectPattern {
	public static void main(String[] args) {

	      Service serv1 = Services.getService("List of Customers");
	      Service serv2 = Services.getService("List of Phones");
	      Service serv3 = Services.getService("List of Address");
	      Service serv4 = Services.getService("List of Vendors");
	    
	      System.out.println("Services Called:");
	      System.out.println(serv1.getService());
	      System.out.println(serv2.getService());
	      System.out.println(serv3.getService());
	      System.out.println(serv4.getService());
	   }
}
