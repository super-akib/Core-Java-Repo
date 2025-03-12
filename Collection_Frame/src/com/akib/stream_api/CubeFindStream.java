package com.akib.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeFindStream
{
     
	public static void main(String[] args)
	{
		 List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		 
		List<Integer> collect = list.stream().filter(num -> num*num*num>50).collect(Collectors.toList());
	    System.out.println(collect);
	}
}
