package com.akib.array_list_examples;
import java.util.Arrays;
import java.util.List;

public class ArrayToList
{
	public static List<String> convertToList(String[] inputArray)
	{
		List<String>  list = Arrays.asList(inputArray); 
		return list;
	}
}
