package com.ArrayListCrudOpertions.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ArrayListCrudOpertions.Student;
import com.ArrayListCrudOpertions.dao.StudentDao;
import com.ArrayListCrudOpertions.daoimpl.StudentDaoImple;

public class StudentDaoImple implements StudentDao
{
	//list of student
    List<Student> sList=new ArrayList<Student>();
	static //creating Scanner object
	Scanner sc= new Scanner(System.in);
	//creating student object
	Student ss=new Student();

	public  void addStudent()
	{

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

	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateStudent(int id, Student s) {
		// TODO Auto-generated method stub
		return false;
	}
	 
}
