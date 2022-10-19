package com.ArrayListCrudOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ArrayListCrudOpertions.Student;
import com.ArrayListCrudOpertions.dao.StudentDao;
import com.ArrayListCrudOpertions.daoimpl.StudentDaoImple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//creating Scanner object
    	Scanner sc= new Scanner(System.in);
    	
    	//creating student object
    	Student ss=new Student();
    	
    	//creating object of imple
    	StudentDaoImple contract =new StudentDaoImple();
    	
    	
    	//list of student
        List<Student> sList=new ArrayList<Student>();
        
        //input the details of student
        System.out.println("Enter the id :");
        ss.setId(sc.nextInt());
        
        System.out.println("Enter the Name :");
        ss.setName(sc.next());
        
        System.out.println("Enter the Marks :");
        ss.setMarks(sc.nextFloat());
        
        sList.add(ss);
        System.out.println(sList);
        
    }
}
