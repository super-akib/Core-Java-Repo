package com.akib.lab_18_03_24;

import java.util.Comparator;
import java.util.TreeSet;
/*
public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(114);
		List<Integer> list2 = list.stream().distinct().toList();
		System.out.println(list2);
	}
}

Ans: [12, 13, 114]
====================================================================

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(13);
		list.add(16);
		list.add(18);
		List<Integer> list2 = list.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(list2);
	}
}

Ans:[13]
		


public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(16);
		list.add(14);
		Optional<Integer> max = list.stream().max((x, y) -> x.compareTo(y));
		System.out.println(max);
	}
}

Ans: Optional[16]


public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		arrayList.add(21);
		arrayList.add(22);
		arrayList.add(23);
		List<Integer> collect = arrayList.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		System.out.println(collect);
	}
}

Ans: [23, 22, 21, 20]
		

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("BC");
		al.add("CDE");
		al.add("DEFG");
		List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList();
		System.out.println(list);
	}
}

Ans: [BC, CDE, DEFG]
	
	
public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		List<Integer> list = al.stream().dropWhile(x->x<=10).toList();
		System.out.println(list);
		
	}
}

Ans: [11, 12]


public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		List<Integer> list = al.stream().takeWhile(x->x<=10).toList();
		System.out.println(list);
	}
}

Ans: [9, 10]


public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(-1);
		al.add(-2);
		al.add(-5);
		al.add(0);
		al.add(1);
		al.add(2);
		List<Integer> list = al.stream().skip(1).filter(y->y<=0).peek(x->{}).toList();
		System.out.println(list);
	}
}

Ans: [-2, -5, 0]
*/
public class Test {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet=new TreeSet<Integer>((x,y)->y.compareTo(x));
		treeSet.add(10); 
		treeSet.add(14);
		treeSet.add(13);
		System.out.println(treeSet);
		treeSet.stream().sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 + o2;
			}
		}).forEach(System.out::println);
	}
}

