package com.dhairya.driver;

import java.util.Scanner;

import com.dhairya.model.Employee;
import com.dhairya.service.CredentialService;


/***
* This class is used for initialize for creating credentials for new hires
*
***/
public class Driver {

	public static void main(String[] args) {
		

		Employee emp = new Employee("DHAIRYA","RASTOGI");
		CredentialService credService = new CredentialService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(
				  "----------------------------------------------- \n"
		   		+ "Please Enter the Department from the following: \n"
				+ "----------------------------------------------- \n"
		   		+ "1. Technical Department\n"
		   		+ "2. Admin Department\n"
		   		+ "3. Human Resource Department \n"
		   		+ "4. Legal Department"
				);
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
