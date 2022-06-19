package com.dhairya;

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
		int choice;
		do {
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				credService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tech");
				credService.generatePassword();
				credService.showCredentials(emp);
				break;
			case 2:
				credService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "admin");
				credService.generatePassword();
				credService.showCredentials(emp);
				break;
			case 3:
				credService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "hr");
				credService.generatePassword();
				credService.showCredentials(emp);
				break;
			case 4:
				credService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "legal");
				credService.generatePassword();
				credService.showCredentials(emp);
				break;
				
			}
		} while(choice != 1|| choice != 2 ||choice != 3 ||choice != 4 ); 
		   
		   sc.close();
	}

}
