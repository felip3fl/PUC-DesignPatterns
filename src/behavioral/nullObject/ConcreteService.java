package behavioral.nullObject;

public class ConcreteService extends Service{
		public ConcreteService(String serviceName) {
	      this.serviceName = serviceName;		
	   }
	   
	   @Override
	   public String getService() {
	      return serviceName;
	   }
	   
	   @Override
	   public boolean isNull() {
	      return false;
	   }
}
