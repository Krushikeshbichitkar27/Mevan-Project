package com.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListContains 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> company =new ArrayList<String>(Arrays.asList("Java","C++","Python"));
		boolean present;
		present =company.contains("Java");
		System.out.println(present);
		
		present =company.contains("AWP");
		System.out.println(present);
		
		company.remove("C++");
		System.out.println(present);
		
		//company over
		//company.clear();
		//System.out.println(present);
		

	}

}
