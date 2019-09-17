/**
 * 
 */
package com.worldpay;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author asus
 *
 */
@Entity
@Table(name="StudentInfo")
public class Student {
@Id
private String studentRollno;
private String studentName;
private int age;
private long mobileNo;
public String getStudentRollno() {
	return studentRollno;
}
public void setStudentRollno(String studentRollno) {
	this.studentRollno = studentRollno;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
@Override
public String toString() {
	return "Student [studentRollno=" + studentRollno + ", studentName=" + studentName + ", age=" + age + ", mobileNo="
			+ mobileNo + "]";
}
public Student() {
	super();
}
public Student(String studentRollno, String studentName, int age, long mobileNo) {
	super();
	this.studentRollno = studentRollno;
	this.studentName = studentName;
	this.age = age;
	this.mobileNo = mobileNo;
}

	

}
