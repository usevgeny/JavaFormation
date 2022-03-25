package testHashManLuxuryCar;

public class TestHash {

	
	
	
	 public static void main(String[] args) {

	       LuxuryAuto ferrariGTO = new LuxuryAuto("Ferrari 250 GTO", 1963, 70000000);
	       LuxuryAuto ferrariSpider = new LuxuryAuto("Ferrari 335 S Spider Scaglietti", 1963, 70000000);
	       
	       System.out.println("Эти два объекта равны друг другу?");
	       System.out.println(ferrariGTO.equals(ferrariSpider));

	       System.out.println("Какие у них хэш-коды?");
	       System.out.println(ferrariGTO.hashCode());
	       System.out.println(ferrariSpider.hashCode());
	       
	       // same items:
	       
	       System.out.println("\n\n same objects:\n");
	       
	       LuxuryAuto ferrariGTO2 = new LuxuryAuto("Ferrari 250 GTO", 1963, 70000000);
	       LuxuryAuto ferrariGTO3 = new LuxuryAuto("Ferrari 250 GTO", 1963, 70000000);
	       LuxuryAuto ferrariGTO4 = new LuxuryAuto("Ferrari 250 GTO", 1962, 70000000);
	       System.out.println(ferrariGTO2.hashCode());
	       System.out.println(ferrariGTO3.hashCode());
	       
	       System.out.println("ferrariGTO equality to ferrariGTO2"+(ferrariGTO2.equals(ferrariGTO)?" Same Model":"Different Models"));
	       
	       System.out.println("ferrariGTO equality to ferrariGTO3"+(ferrariGTO.equals(ferrariGTO4)?" Same Model":"  Different Models"));
	
}

}