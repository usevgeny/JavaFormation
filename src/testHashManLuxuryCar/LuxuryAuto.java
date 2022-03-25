package testHashManLuxuryCar;

public class LuxuryAuto {

	   private String model;
	   private int manufactureYear;
	   private int dollarPrice;

	   public LuxuryAuto(String model, int manufactureYear, int dollarPrice) {
	       this.model = model;
	       this.manufactureYear = manufactureYear;
	       this.dollarPrice = dollarPrice;
	   }

	public String getModel() {
		return model;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public int getDollarPrice() {
		return dollarPrice;
	}
	
	@Override
	public boolean equals(Object o) {
	   if (this == o) return true; // checking if the instance is the same to be compared to
	   if (o == null || getClass() != o.getClass()) return false; // if not the same instance, check if the same class

	   LuxuryAuto that = (LuxuryAuto) o; 

	   if (manufactureYear != that.manufactureYear) return false;
	   if (dollarPrice != that.dollarPrice) return false;
	   return model.equals(that.model);
	}

	@Override
	public int hashCode() {
	   int result = model == null ? 0 : model.hashCode();
	   result = 31 * result + manufactureYear;
	   result = 31 * result + dollarPrice;
	   return result;
	}
	   
	   
	   
	   
	   
	}