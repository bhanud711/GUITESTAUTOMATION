package com.gui.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> li=new ArrayList<String>();
li.add("rama");
li.add("krishna");
li.add("murali");
li.add("gopi");
System.out.println(li);
li.add("krishna");
li.add("gopi");
System.out.println(li);
System.out.println(li.get(2));
Iterator<String> it = li.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
