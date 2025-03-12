package com.akib.lab_02_03_24;

import java.util.Set;
import java.util.TreeSet;

public class CollectionExample
{
	public static void main(String[] args) {
		Set<String> tree = new TreeSet<>();
		tree.add("google");
		tree.add("Naresh");
		tree.add("Information");
		tree.add("Technology");
		for(int i=2;i<tree.size()-1;i++) 
		{
			System.out.print(tree.remove(i));
		}
	
	}
}
