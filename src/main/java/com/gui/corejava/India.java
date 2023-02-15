package com.gui.corejava;

public class India extends USA {
	//India is a child class and USA is a prent class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India ind=new India();
		ind.ap();
		ind.ts();
		ind.delhi();
		
	}
	
	public void ap()
	{
		System.out.println("I am AP");
	}

	public void ts()
	{
		System.out.println("I am TS");
	}
	
	public void delhi()
	{
		System.out.println("I am delhi");
	}
}
