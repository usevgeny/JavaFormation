package WriteReadCompareYT;

public class Toy implements Comparable<Toy>{
	
	private String name;
	private int price;
	private String description;
	private int promo;
	
	

	public Toy(String name, int price, String description, int promo) {
		
		this.name = name;
		this.price = price;
		this.description = description;
		this.promo = promo;
	}



	public String getName() {
		return name;
	}



	public int getPrice() {
		return price;
	}



	public String getDescription() {
		return description;
	}



	public int getPromo() {
		return promo;
	}



	@Override
	public int compareTo(Toy toy2) {
		// TODO Auto-generated method stub
		
		if (this.promo>toy2.getPromo()) {
			
			return -1;
		}
		else {
			return 1;
			
		}
		
	
	}
	
	
	
	
}
