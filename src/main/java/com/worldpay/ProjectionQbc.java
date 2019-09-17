package com.worldpay;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;


public class ProjectionQbc {

	public static void main(String[] args) {
		
		Criteria cr=SessionUtil.getSF().openSession().createCriteria(Student.class);
		List<Student> student=cr.list();
		ProjectionList plist=Projections.projectionList();
		Projection p1=Projections.property("studentName");
		Projection p2=Projections.property("age");
		plist.add(p1);
		plist.add(p2);
		cr.setProjection(plist);
		List<Object[]> stud=cr.list();
		for(Object s[]:stud){
			for(Object st:s){
				 System.out.println(st);
				
			}
		}
		
	}

}
