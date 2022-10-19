package com.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] grocery= {"Besan","Toor Dal","Suger","Tea"};
		
		List<String> groceryList= new ArrayList<String>();
		groceryList=Arrays.asList(grocery);
		
		System.out.println(groceryList);
	    
		groceryList.add("Chana Dal");
		System.out.println(groceryList);

	}

}
