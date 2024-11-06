package cognifyz.level1.task4.RandomPasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//Character pools for random password generation
	        String numbers = "0123456789";
	        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
	        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String specialCharacters = "!@#$%^&*()-_=+[]{};:,.<>?";
		
		//Prompt the user to enter the desired length of the password
		System.out.print("Enter the length of the password: ");
		int passwordLength = sc.nextInt();
		sc.nextLine();  //For consuming new line
		
		// Prompt the user for including number types
		System.out.print("Include numbers? (y/n): ");
		boolean includeNumbers = sc.nextLine().equalsIgnoreCase("y");
		
		// Prompt the user for including lower case letters
		System.out.print("Include lower case letters? (y/n): ");
		boolean includeLowerCase = sc.nextLine().equalsIgnoreCase("y");
		
		// Prompt the user for including upper case letters
		System.out.print("Include upper case letters? (y/n): ");
		boolean includeUpperCase = sc.nextLine().equalsIgnoreCase("y");

		// Prompt the user for including special characters
		System.out.print("Include special characters? (y/n): ");
		boolean includeSpecialCharacter = sc.nextLine().equalsIgnoreCase("y");
		
		//Build the character pool according to the user preference
		String characterPool = "";
		
		//If includeNumber is true then character pool update with the number
		if(includeNumbers) { 
			characterPool += numbers;
		}
		
		//If includeLowerCase is true then character pool update with the lower case letters
		if(includeLowerCase) { 
			characterPool += lowercaseLetters;
		}
		
		//If includeUpperCase is true then character pool update with the upper case letters
		if(includeUpperCase) { 
			characterPool += uppercaseLetters;
		}
		
		//If includeSpecialCharacter is true then character pool update with the special character
		if(includeSpecialCharacter) { 
			characterPool += specialCharacters;
		}
		
		//Checking whether the character pool is empty or not
		if(characterPool.isEmpty()) {
			System.out.println("Error occured...!! You must include at least one type of character to generate a password.");
			sc.close();
            		return;
		}
		
		//Now Generate the random password according to the user requirement
		StringBuilder password = new StringBuilder();
		for(int i = 0 ; i < passwordLength ; i++) {
			int randomIndex = random.nextInt(characterPool.length()) ;
			password.append(characterPool.charAt(randomIndex));
		}
		
		//Then display the generated password
		System.out.println("Generated password: "+password.toString());
		
		//Closing the scanner class object 
		sc.close();
	}
}
