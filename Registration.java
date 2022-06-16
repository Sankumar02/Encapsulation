package com.Task_21_04_22;

public class Registration {

	public static void main(String[] args) {
		Student registrationDetailsStudent = new Student();
		registrationDetailsStudent.setadmissionId(2016105102);
		registrationDetailsStudent.setphoneNumber(99401);
		registrationDetailsStudent.setname("Kumar");
		registrationDetailsStudent.seteMail("kumarsabari0141@gmail.com");

		System.out.println("----------Student Registration Portal----------");
		System.out.println("Student Name : " + registrationDetailsStudent.getname());
		System.out.println("Student Number : " + registrationDetailsStudent.getphoneNumber());
		System.out.println("Student admissionId : " + registrationDetailsStudent.getadmissionId());
		System.out.println("Student email : " + registrationDetailsStudent.geteMail());

	}

}
