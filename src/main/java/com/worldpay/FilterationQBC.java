package com.worldpay;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


public class FilterationQBC {
	public static void main(String[] args) {
		Criteria cr=SessionUtil.getSF().openSession().createCriteria(Student.class);
		Criteria cr1;
		cr.add(Restrictions.like("studentName", "%a"));
		List<Student> student=cr.list();
		for(Student stud:student){
			System.out.println(stud.getStudentRollno());
			System.out.println(stud.getStudentName());
			System.out.println(stud.getAge());
			System.out.println(stud.getMobileNo());
			
			System.out.println("___________________________________");
		}
		

	}

}
