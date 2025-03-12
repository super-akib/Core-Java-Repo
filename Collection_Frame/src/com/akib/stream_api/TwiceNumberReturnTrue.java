package com.akib.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwiceNumberReturnTrue {

	
	public static void main(String[] args) {

//		List<Integer> l = Arrays.asList(1, 2, 3, 5);
//		List<Integer> l1 = new ArrayList<Integer>();
//		
//		
//		l.stream().map(e -> !l1.add(e));
//		
//		if(l.size() == l1.size()) {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
//
////		System.out.println(collect2);
		
		
//		List<Integer> l1 = new ArrayList<Integer>();
//		List<Boolean> collect = l.stream().map(e -> !l1.add(e)).collect(Collectors.toList());
//		System.out.println(collect);
		int num[] = {1,2,3,1};
		boolean  b = Arrays.stream(num).distinct().count()!= num.length;
		System.out.println(b);
		

	}
}
