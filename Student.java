package com.Task_21_04_22;

public class Student {
	private int admissionId;
	private int phoneNumber;
	private String name;
	private String eMail;

	public int getadmissionId() {
		return admissionId;
	}

	public void setadmissionId(int admissionID) {
		this.admissionId = admissionID;
	}

	public long getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(int number) {
		phoneNumber = number;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
