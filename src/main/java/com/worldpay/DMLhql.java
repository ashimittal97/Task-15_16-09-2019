package com.worldpay;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DMLhql {
	static SessionFactory sessionFactory = SessionUtil.getSF();
	static Session session = sessionFactory.openSession();

	public static void main(String args[]) {
		// update

		String hql = "UPDATE  Student set studentName=:stud_name where studentRollno=:stud_roll ";
		Transaction tr = session.beginTransaction();
		Query query1 = session.createQuery(hql);
		query1.setParameter("stud_name", "ADITYA");
		query1.setParameter("stud_roll", "0832CS151001");
		int no = query1.executeUpdate();
		tr.commit();
		System.out.println("Total rows updated" + "=" + no);
		System.out.println("---------------------------------------------------------------------------------------");
		// delete

		Transaction tr1 = session.beginTransaction();

		String hql1 = "DELETE from Student where studentRollno=:stud_roll ";
		Query query2 = session.createQuery(hql1);
		query2.setParameter("stud_roll", "0832CS151004");
		int no1 = query2.executeUpdate();
		tr1.commit();
		System.out.println("Total rows deleted" + "=" + no1);

		System.out.println("---------------------------------------------------------------------------------------");

		
	}
}
