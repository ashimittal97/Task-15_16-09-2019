package com.worldpay;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HQLStudent {

	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionUtil.getSF();
		Session session = sessionFactory.openSession();
		// reteriving all the informations
		String hql = "from Student";
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(hql);
		List<Student> studList = query.list();
		for (Student stud : studList) {
			System.out.println("List of Employees::" + stud.getStudentRollno() + "," + stud.getStudentName() + ","
					+ stud.getMobileNo() + "," + stud.getAge() + "");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------");
		}

		// reteriving particular coloumns (Projection)
		String hql1 = "SELECT studentRollno,studentName from Student";
		Query query1 = session.createQuery(hql1);
		List<Object[]> st = query1.list();
		for (Object ar[] : st) {
			for (Object s : ar) {
				System.out.println(s);
				System.out.println(
						"_____________________________________________________________________________________________________________");
			}
		}

		 //ordering according to age and filteration using hql named based
		String hql2 = "from Student where age>=:s_age order by age desc";
		Query query2 = session.createQuery(hql2);
		query2.setParameter("s_age", 18);
		List<Student> s = query2.list();
		for (Student stud : s) {
			System.out.println("List of Employees::" + stud.getStudentRollno() + "," + stud.getStudentName() + ","
					+ stud.getMobileNo() + "," + stud.getAge() + "");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------");
		}
		String hql3 = "update Student set  age=? where studentRollno=?";
		Query query3 = session.createQuery(hql2);
		query3.setParameter(0, 16);
		query3.setParameter(1, "082CS151001");
		List<Student> s1 = query3.list();
		for (Student stud : s1) {
			System.out.println("List of Employees::" + stud.getStudentRollno() + "," + stud.getStudentName() + ","
					+ stud.getMobileNo() + "," + stud.getAge() + "");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------");
		}
		
	}

}
