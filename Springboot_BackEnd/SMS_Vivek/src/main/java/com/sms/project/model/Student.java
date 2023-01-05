package com.sms.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="st_Name")
	private String stName;
	@Column(name="st_FatherName")
	private String stFatherName;
	@Column(name="st_Age")
	private String stAge;
	@Column(name="st_Mobile")
	private int stMobile;
	@Column(name="st_Pin")
	private int stPin;
	@Column(name="st_Mothet")
	private String stMothet;
	@Column(name="st_Address")
	private String stAddress;
	@Column(name="st_Standard")
	private String stStandard;
	@Column(name="st_Section")
	private String stSection;
	@Column(name="st_DateOfJoin")
	private String stDateOfJoin;
	@Column(name="st_PreviousSchool")
	private String stPreviousSchool;
	@Column(name="st_Dob")
	private String stDob;

	
	public Student() {}
	
	public Student(String stName, String stFatherName, String stAge, int stMobile, int stPin, String stMothet,
			String stAddress, String stStandard, String stSection, String stDateOfJoin, String stPreviousSchool,
			String stDob) {
		super();
		this.stName = stName;
		this.stFatherName = stFatherName;
		this.stAge = stAge;
		this.stMobile = stMobile;
		this.stPin = stPin;
		this.stMothet = stMothet;
		this.stAddress = stAddress;
		this.stStandard = stStandard;
		this.stSection = stSection;
		this.stDateOfJoin = stDateOfJoin;
		this.stPreviousSchool = stPreviousSchool;
		this.stDob = stDob;
	}
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStFatherName() {
		return stFatherName;
	}
	public void setStFatherName(String stFatherName) {
		this.stFatherName = stFatherName;
	}
	public String getStAge() {
		return stAge;
	}
	public void setStAge(String stAge) {
		this.stAge = stAge;
	}
	public int getStMobile() {
		return stMobile;
	}
	public void setStMobile(int stMobile) {
		this.stMobile = stMobile;
	}
	public int getStPin() {
		return stPin;
	}
	public void setStPin(int stPin) {
		this.stPin = stPin;
	}
	public String getStMothet() {
		return stMothet;
	}
	public void setStMothet(String stMothet) {
		this.stMothet = stMothet;
	}
	public String getStAddress() {
		return stAddress;
	}
	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}
	public String getStStandard() {
		return stStandard;
	}
	public void setStStandard(String stStandard) {
		this.stStandard = stStandard;
	}
	public String getStSection() {
		return stSection;
	}
	public void setStSection(String stSection) {
		this.stSection = stSection;
	}
	public String getStDateOfJoin() {
		return stDateOfJoin;
	}
	public void setStDateOfJoin(String stDateOfJoin) {
		this.stDateOfJoin = stDateOfJoin;
	}
	public String getStPreviousSchool() {
		return stPreviousSchool;
	}
	public void setStPreviousSchool(String stPreviousSchool) {
		this.stPreviousSchool = stPreviousSchool;
	}
	public String getStDob() {
		return stDob;
	}
	public void setStDob(String stDob) {
		this.stDob = stDob;
	}
	
	
}
