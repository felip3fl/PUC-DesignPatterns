package behavioral.nullObject;

public class NullService extends Service {
	  @Override
	   public String getService() {
	      return "Service not available!";
	   }

	   @Override
	   public boolean isNull() {
	      return true;
	   }
}
