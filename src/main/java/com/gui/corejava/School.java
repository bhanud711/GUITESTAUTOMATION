package com.gui.corejava;

public class School implements Fruits{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sch=new School();
		sch.apple();
		sch.grapes();
		sch.secondClass();
	}

	public void firstClass()
	{
	System.out.println("First class students");	
	}
	
	public void secondClass()
	{
	System.out.println("secondClass students");	
	}
	public void thirdClass()
	{
		System.out.println("thirdclass students");
	}

	
	public void manago() {
		// TODO Auto-generated method stub
	System.out.println("Mango fruit");	
	}

	
	public void grapes() {
		// TODO Auto-generated method stub
		System.out.println("Grapes fruit");
	}

	
	public void apple() {
		// TODO Auto-generated method stub
		System.out.println("Apple Fruit");
	}
}
