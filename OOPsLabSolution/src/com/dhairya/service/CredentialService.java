package com.dhairya.service;

import java.util.Random;

import com.dhairya.model.Employee;

public class CredentialService {

	public String generatePassword() {
		int firstChar = (int) '!';
		int lastChar = (int) '~';
		int range =lastChar- firstChar;
		StringBuilder sb = new StringBuilder();
		/*String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		*/
		Random random = new Random();
		//char[] password = new char[8];
		for(int i=0; i<8; i++) {
			int randomNumber = random.nextInt(range);
			randomNumber = randomNumber + firstChar;
			char randomPassword = (char) randomNumber;
			sb.append(randomPassword);
			//password[i] = values.charAt(random.nextInt(values.length()));
		}
		return sb.toString();
		//System.out.println(sb);
		
		
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String email = firstName + lastName + "@" + department + ".dsr.com";
		return email;
	}
	
	public void showCredentials(Employee emp, String generatedEmail, String generatedPassword) {
		System.out.println("Dear "+ emp.getFirstName() +" your generated credentials are as follows:");
		System.out.println("EMAIL     --> " +  generatedEmail);
		System.out.println("Password  --> " +  generatedPassword);
	}
}
