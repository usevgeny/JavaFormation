package PresentsManagement;
/**
 * All Sweets should have next properties: name, weight and sugarWeight. Weight is a weight of the specific sweet in kilograms. sugarWeight is a weight of sugar in this sweet in kilograms. 
 * @author evgeny
 *
 */

import javax.management.loading.PrivateClassLoader;

public abstract class Sweet {
	private String name;
	private double weight;
	private double sugarWeight;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSugarWeight() {
		return sugarWeight;
	}
	public void setSugarWeight(double sugarWeight) {
		this.sugarWeight = sugarWeight;
	}
	@Override
	public String toString() {
		return "Sweet [name=" + name + ", weight=" + weight + ", sugarWeight=" + sugarWeight + "]";
	}
	
	

}
