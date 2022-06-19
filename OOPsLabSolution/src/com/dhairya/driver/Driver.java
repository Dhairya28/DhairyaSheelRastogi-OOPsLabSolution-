package com.dhairya.driver;

import java.util.Scanner;

import com.dhairya.model.Employee;
import com.dhairya.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		

		Employee emp = new Employee("DHAIRYA","RASTOGI");
		CredentialService credService = new CredentialService();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please Enter the Department from the following");
		System.out.println("1. Technical Department");
		System.out.println("2. Admin Department");
		System.out.println("3. Human Resource Department");
		System.out.println("4. Legal Department");
		int choice= sc.nextInt();
		String deparment = null ;
	
			
			switch(choice) {
			case 1:
				deparment = "tech";
				break;
			case 2:
				deparment = "admin";
				break;
			case 3:
				deparment = "hr";
				break;
			case 4:
				deparment = "legal";
				break;
			default:
				throw new IllegalArgumentException("invalid input");
			}
			String generatedEmail = credService.generateEmailAddress(emp.getFirstName(), emp.getLastName(),deparment);
			String generatedPassword=credService.generatePassword();
			credService.showCredentials(emp,generatedEmail,generatedPassword);
		
	}

}
