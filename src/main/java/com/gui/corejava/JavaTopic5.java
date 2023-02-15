package com.gui.corejava;

public class JavaTopic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=7;
		int c=15;
		int d=10;
		int e=56;
		int f=16;
		System.out.println((a>b)&&(a<f));  //true&&true
		System.out.println((a>d)&&(e>f));   //false&&true---false
		
		
		
		System.out.println((a>b)||(a<f));  //true&&true--true
		System.out.println((a>d)||(e>f));  //true
		System.out.println((a>f)||(e<d)); //false
	}

}
