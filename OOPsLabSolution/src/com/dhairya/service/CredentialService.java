package com.dhairya.service;

import java.util.Random;

import com.dhairya.model.Employee;

public class CredentialService {

	
	private String generatedEmail;
	private String generatedPassword;
	
	
	
	
	public String getGeneratedEmail() {
		return generatedEmail;
	}

	public void setGeneratedEmail(String generatedEmail) {
		this.generatedEmail = generatedEmail;
	}

	public String getGeneratedPassword() {
		return generatedPassword;
	}

	public void setGeneratedPassword(String generatedPassword) {
		this.generatedPassword = generatedPassword;
	}

	public void generatePassword() {
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
		setGeneratedPassword(sb.toString());
		//System.out.println(sb);
		
		
	}
	
	public void generateEmailAddress(String firstName, String lastName, String department) {
		String email = firstName + lastName + "@" + department + ".dsr.com";
		setGeneratedEmail(email);
	}
	
	public void showCredentials(Employee emp) {
		System.out.println("Dear "+ emp.getFirstName() +" your generated credentials are as follows:");
		System.out.println("EMAIL     --> " +  getGeneratedEmail());
		System.out.println("Password  --> " +  getGeneratedPassword());
	}

	
}
