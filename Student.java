package com.Project.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int sId;
	private String sName;
	private int sAge;
	private String sAddress;
	private String sCourse;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sAddress=" + sAddress + ", sCourse="
				+ sCourse + "]";
	}

	public Student(int sId, String sName, int sAge, String sAddress, String sCourse) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sAddress = sAddress;
		this.sCourse = sCourse;
	}

	public Student() {

	}

}
