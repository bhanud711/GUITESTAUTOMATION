package com.gui;

public class Travel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travel tr=new Travel();
		tr.vehical();
		tr.vehical("petrol");
		tr.vehical("petrol", 7);
	}
	public void vehical()
	{
		System.out.println("Bike");
	}
	
	public void vehical(String typeOfFuel)
	{
		System.out.println("Car is running by :"+typeOfFuel);
	}
	
	public void vehical(String typeOfFuel,int noOfPeople)
	{
		System.out.println("Car is running by :"+typeOfFuel);
		System.out.println("People can travel "+noOfPeople);
	}

}
