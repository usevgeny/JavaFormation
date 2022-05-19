package Certif;

import java.util.Date;

public class Horloge extends AppareilMesure{

	
	
	
	private Date heurecourante;
	public Horloge() {
		super();
		this.heurecourante = new Date();
		this.demarre();
	}
	
	
	protected void start() 
	
	
	{
		
		System.out.println("L'horloge est demarré");
	}
}
