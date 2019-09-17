package com.worldpay;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;


public class DataRetrivalQBC {
	public static void main(String[] args) {

		Criteria cr=SessionUtil.getSF().openSession().createCriteria(Student.class);
		//ordering on the basics of age
		Order order1=Order.desc("age");
		cr.addOrder(order1);
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
