package behavioral.nullObject;
//Static Factory
public class Services {
	private static final String[] services = {"List of Customers", "List of Address", "List of Vendors"};

	   public static Service getService(String serviceName){
	      for (int i = 0; i < services.length; i++) {
	         if (services[i].equalsIgnoreCase(serviceName)){
	            return new ConcreteService(serviceName);
	         }
	      }
	      return new NullService();
	   }
}
