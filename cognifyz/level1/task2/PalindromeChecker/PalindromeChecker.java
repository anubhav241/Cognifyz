package cognifyz.level1.task2.PalindromeChecker;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user to take the word phrase
		System.out.print("Enter the word or phrase: ");
		String wordPhrase = sc.nextLine();
		
		//check whether the enter word phrase is palindrome or not
		if(isPalindrome(wordPhrase)) {
			System.out.println("Yes!! The given word phrase is \""+ wordPhrase+"\" is a palindrome ");
		}else {
			System.out.println("Sorry..!! The given word phrase is \""+ wordPhrase+"\" not a palindrome ");
		}
		sc.close();
	}
	
	// User define Method for checking if a given string is a palindrome or not
	public static boolean isPalindrome(String wordPhrase) {
		
		//clean the string means remove all space and extra symbol and convert into 
		String cleaned = wordPhrase.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		
		for(int i = 0 ; i < cleaned.length()/2 ; i++) {
			if(cleaned.charAt(i) != cleaned.charAt(cleaned.length() - 1 - i)) {
				return false;
			}
		}
		
		//If the condition will false then it will return true 
		return true;
	}
}
