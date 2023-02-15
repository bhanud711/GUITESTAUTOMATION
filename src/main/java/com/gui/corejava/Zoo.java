package com.gui.corejava;

public class Zoo  extends Festival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zPark=new Zoo();
		zPark.rama();
		zPark.krishna();
		zPark.animals();
		zPark.hills();
	}

	@Override
	public void rama() {
		// TODO Auto-generated method stub
	System.out.println("Lord Rama");	
	}

	@Override
	public void krishna() {
		// TODO Auto-generated method stub
		System.out.println("Lord Krishna");
	}

}
