package WriteReadCompareYT;
import java.util.Comparator;

public class PriceComparator implements Comparator<Toy>{

		public static void main(String[] args) {
			
			
			
		}

		@Override
		public int compare(Toy toy1, Toy toy2) {
			// TODO Auto-generated method stub
			
		/*	if(toy1.getPrice() < toy2.getPrice()){
				return -1;}
			else {
				return 1;
				}
		*/
			// toy1: 20eur toy2:25eur   20-25=-5; -- une valeure negative
			
			if( toy1.getPrice() == toy2.getPrice()) {
				
				//return toy1.getName().compareTo(toy2.getName());
				
				return toy1.compareTo(toy2); //comparaison par rapport à la promo
			}
			return toy1.getPrice() - toy2.getPrice();
			
		}
}
