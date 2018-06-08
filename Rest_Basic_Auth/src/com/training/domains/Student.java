package com.training.domains;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

	
	@XmlElement
	private long studentCode;
	
	@XmlElement
	private String studentName;
	
	@XmlElement
	private double mark;
	
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param studentCode
	 * @param studentName
	 * @param mark
	 */
	public Student(long studentCode, String studentName, double mark) {
		super();
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.mark = mark;
	}
	public long getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(long studentCode) {
		this.studentCode = studentCode;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
   

     
     
}
