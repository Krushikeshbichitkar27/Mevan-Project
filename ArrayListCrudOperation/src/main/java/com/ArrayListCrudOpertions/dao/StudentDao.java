package com.ArrayListCrudOpertions.dao;


import com.ArrayListCrudOpertions.Student;
import com.ArrayListCrudOpertions.dao.StudentDao;

public interface StudentDao
{
	void addStudent(Student s);
	
	
    boolean deleteStudent(int id);
		
	
	
	boolean updateStudent(int id, Student s);
		
	
	

	
	
}
