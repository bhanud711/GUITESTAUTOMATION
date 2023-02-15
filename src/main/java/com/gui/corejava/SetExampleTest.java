package com.gui.corejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> se=new HashSet<String>();
se.add("rama");
se.add("krishna");
se.add("murali");
se.add("gopi");
System.out.println(se);
se.add("krishna");
se.add("gopi");
System.out.println(se);
Iterator<String> it = se.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
