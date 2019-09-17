package com.worldpay;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DataNativeSQL {

	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionUtil.getSF();
		Session session = sessionFactory.openSession();
		String sql="SELECT * from studentinfo";
		Transaction tx = session.beginTransaction();
		SQLQuery query = session.createSQLQuery(sql);
		List<Object[]> list=query.list();
		query.addEntity(Student.class);
		for (Object ar[] : list) {
			for (Object s : ar) {
				System.out.println(s);
				
			}
			System.out.println(
					"_____________________________________________________________________________________________________________");
		}
		
	}

}
