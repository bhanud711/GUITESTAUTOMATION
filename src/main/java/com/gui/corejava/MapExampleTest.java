package com.gui.corejava;

import java.util.HashMap;
import java.util.Map;

public class MapExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> months=new HashMap<Integer, String>();
		months.put(1, "Jan");
		months.put(2, "Feb");
		months.put(3, "Mar");
		months.put(4, "Apr");
		months.put(5, "May");
		months.put(6, "June");
		months.put(7, "July");
		months.put(8, "Aug");
		months.put(9, "Sep");
		months.put(10, "Oct");
		months.put(11, "Nov");
		months.put(12, "Dec");
		System.out.println(months);
		for(Integer keys:months.keySet())
		{
			System.out.println(keys);
		}
		
		//months.forEach((key, value)->System.out.println(key+"    "+value));

	}

}
