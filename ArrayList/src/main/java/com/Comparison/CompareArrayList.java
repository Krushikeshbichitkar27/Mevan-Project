package com.Comparison;

import java.util.ArrayList;
import java.util.List;


public class CompareArrayList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//First array list
		List<String> fruits1=new ArrayList<String>();
		fruits1.add("Mango");
		fruits1.add("Kiwi");
		fruits1.add("Apple");
		fruits1.add("Orenge");
		
		System.out.println(fruits1);
		
		//Second array list
		List<String> fruits2=new ArrayList<String>();
		fruits2.add("Mango");
		fruits2.add("Kiwi");
		fruits2.add("Apple");
		fruits2.add("Orenge");
		fruits2.add("Melon");
		
		System.out.println(fruits2);
		
		//remove all duplicate element
		//fruits2.removeAll(fruits1);
		//System.out.println(fruits2);
		
		//to have common element
		fruits2.retainAll(fruits1);
		System.out.println(fruits2);
		
		
		
		

	}

}
