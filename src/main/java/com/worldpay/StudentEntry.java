package com.worldpay;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.internal.Util;

public class StudentEntry {

	public static void main(String[] args) {
		SessionFactory sf = SessionUtil.getSF();
		Session session = sf.openSession();

		Student student1 = new Student("0832CS151001", "AKANSHA", 19, 982756898);
		Student student2 = new Student("0832CS151002", "Akshita", 20, 982756898);
		Student student3 = new Student("0832CS151003", "Aditi", 21, 982756898);
		Student student4 = new Student("0832CS151004", "Akhil", 17, 982756898);

		Transaction tr = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");

	}

}
