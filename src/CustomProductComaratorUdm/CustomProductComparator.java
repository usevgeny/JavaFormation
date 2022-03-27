package CustomProductComaratorUdm;

import java.util.Comparator;

public class CustomProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		
		if (product1.getCategoryName().equals(product2.getCategoryName())){
			if((product1.getPrice()-product2.getPrice()==0)){
				return product1.getProductName().compareTo(product2.getProductName());
			}
			
			return (int) (product1.getPrice()-product2.getPrice());
		}
		
		
		//<write your code here>
		//return (int) (product1.getPrice()-product2.getPrice());
		//return (int) (product1.getId()-product2.getId());
		//return product1.getProductName().compareTo(product2.getProductName());
		return product1.getCategoryName().compareTo(product2.getCategoryName());
	}

}