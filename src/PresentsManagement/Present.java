package PresentsManagement;

import java.util.Arrays;

import eshop.StandardAccountOperations;
import eshop.Account.Transaction;

/**
 * 
 * @author evgeny
 *
 */
public class Present {
	
	private final int CUSTOMSWEETSAMOUNT=1;
	private Sweet[] sweets;
	private int sweetIndex;
	
	{
		sweets = new Sweet[CUSTOMSWEETSAMOUNT];
		
	}
	//private double totalWeight;
	//private double sugarWeight
	
    public void addSweet(Sweet sweet) {
    	
		if (sweet==null)
			return;
		Sweet lastSweet = sweets[sweets.length-1];
		if(lastSweet!=null) {
			
			sweets=Arrays.copyOf(sweets, sweets.length<<1);
			
		}
			
		sweets[sweetIndex++]=sweet;
		
	} 

	public double calculateTotalWeight() {
		double totalWeight =0 ;
		for(Sweet s:sweets) {
			if(s!=null)
			totalWeight+=s.getWeight();
		}
		
		return totalWeight;
	}

	public Sweet[] filterSweetsBySugarRange(double minSugarWeight,
			double maxSugarWeight) {
		
		
		int filteredIndex = 0;
	    for(Sweet s:sweets) {
	    	
	    if(s!=null && s.getSugarWeight()>=minSugarWeight && s.getSugarWeight()<=maxSugarWeight) {
	    	filteredIndex+=1;
	    	
	    }
	    	
	    }
		
	    Sweet[] filteredSweets= new Sweet[filteredIndex];
	    
	    int index=0;
	    for (Sweet s:sweets) {
	    	 if(s!=null&& s.getSugarWeight()>=minSugarWeight && s.getSugarWeight()<=maxSugarWeight) {
	    		 filteredSweets[index++]=s;
	    		 
	 	    }
	    }
	    
		return filteredSweets;
	}

	public Sweet[] getSweets() {
	
		int nonNullSweetsAmount = 0;
		for (Sweet sweet : sweets) {
			if (sweet != null) {
				nonNullSweetsAmount++;
			}
		}

		Sweet[] nonNullSweets = new Sweet[nonNullSweetsAmount];
		int index = 0;
		for (Sweet sweet : this.sweets) {
			if (sweet != null) {
				nonNullSweets[index++] = sweet;
			}
		}

		return nonNullSweets;
	

		
	}

}