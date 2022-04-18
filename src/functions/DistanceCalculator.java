package functions;

@FunctionalInterface // to say that originally it is created to be a target type for lambda functions and method references 
// the second reason is that in case if smbd wants to add some adittionnal interfaces -- there will bea a compilation error 
public interface DistanceCalculator {
	double calculateDistance(City city1, City city2);
	
	default void SomeDefaultMethod() {};
	
	static void someStaticMethod() {};
	

}

//@FunctionalInterface annottionis useful to prevent that somebody added some aditionnal methods to the 
//type that we have already used in tohter parts of the program as a type for lambda function 

// declaration of an additionnal method is notpossible for example we cannot add double calculateDDeliveryTime();
// but functionnalinterface can containas much default  methods and as much static methods as possible 

// so important to remember : ONLY ONE ABSTRACT METHOD, otherwise when using lambda expressions
// it is not clear which method we should use in annonimous function 