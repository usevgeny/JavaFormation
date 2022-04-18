package functions;


public class LambdaAndMethodReferenceDemo {

		public static void main(String[] args) {
			
			// ========== Lambda function demo ==========
			OrderManagement orderManagement = 
					new OrderManagement(new DefaultDistanceCalculator());
			
			orderManagement.setDistanceCalculator(new DistanceCalculator() { // anonimous class  to override DistanceClaculator methods only once  
				@Override
				public double calculateDistance(City city1, City city2) {
					// take into account interstate distance calculation
					return city1.getLogitude() - city2.getLogitude(); // some dummy calculations
				}
			});
			//but htis is toooo much code, this is why weuse lambda functions, annonimous functions without anyu name 
			DistanceCalculator dCalculator = (city1, city2) -> city1.getLogitude() - city2.getLogitude();
										//we pass arguments/or method invocation // we are skipping return here 
			
			
			DistanceCalculator dCalculator2 = (city1, city2) -> {
				System.out.println("Text inside lambda function");
				return city1.getLogitude() - city2.getLogitude();
			};
			
			dCalculator2.calculateDistance(new City(), new City());
			
			orderManagement.setDistanceCalculator((city1, city2) -> city1.getLogitude() - city2.getLogitude());
			
			
			// ========== Method reference demo ==========
			
			orderManagement
				.setDistanceCalculator(GoogleDistanceCalculator::getDistanceBetweenCitiesStatic); // here we use a static method so no need to instanciate Google .. class
			
			GoogleDistanceCalculator gdc = new GoogleDistanceCalculator(); // if use non static method, we need to instanciate a class (that contains that method) first
			orderManagement
				.setDistanceCalculator(gdc::getDistanceBetweenCities);
		
		}
	
}



class OrderManagement {
	
	private DistanceCalculator distanceCalculator; // we can not create objects on the basis of an interface, thats why
						// we create a concrete class (line 61) DefaultDIstanceCalculator
	
	public OrderManagement(DistanceCalculator distanceCalculator) {
		this.distanceCalculator = distanceCalculator;
	}
	
	public void setDistanceCalculator(DistanceCalculator distanceCalculator) {
		this.distanceCalculator = distanceCalculator;
	}
}


class DefaultDistanceCalculator implements DistanceCalculator {

	@Override
	public double calculateDistance(City city1, City city2) {
		return 0;
	}
	
}

class GoogleDistanceCalculator {
	
	public double getDistanceBetweenCities(City city1, City city2) {
		return 1;
	}
	
	public static double getDistanceBetweenCitiesStatic(City city1, City city2) {
		return 1;
	}
}