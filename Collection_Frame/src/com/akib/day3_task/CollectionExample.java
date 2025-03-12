package com.akib.day3_task;

import java.util.*;

public class CollectionExample {
	public static void main(String[] args) {
		List<Number> list = new ArrayList<Number>();
        System.out.format("%b %b %b %d",
            list.add(7),
            list.add(null),
            list.add(7),
            list.size());
        }
}