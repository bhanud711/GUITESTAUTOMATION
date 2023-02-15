package com.gui.corejava;

public class JavaTopic10Calc {
	public static int a=30;
	public static int b=10;
	public static int c;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTopic10Calc calc=new JavaTopic10Calc();
		calc.add();
		System.out.println(calc.add());

	}
	public int add()
	{
		c=a+b;
		return c;
		
	}
	

}
