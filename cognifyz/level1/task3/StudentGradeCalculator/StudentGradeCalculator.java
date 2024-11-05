package cognifyz.level1.task3.StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user to enter the number of grade
		System.out.print("Enter the number of grade you want to enter: ");
		int noOfGrade = sc.nextInt();
		
		//checking whether the number of grade is valid or not
		if(noOfGrade <= 0) {
			System.out.println("Invalid number please enter a positive number: ");
			sc.close();
			return;
		}
		
		//taking array to store the grades
		double[] grades = new double[noOfGrade];
		double sum = 0;
		
		//taking input for each grade
		for(int i = 0 ; i < noOfGrade ; i++ ) {
			System.out.print("Enter grade "+ (i+1) + ": ");
			grades[i] = sc.nextDouble();
			sum += grades[i];
		}
		
		//calculating the average of the grade
		double average = sum / noOfGrade;
		
		//Displaying the average of the grade
		System.out.println("The average of the grades is : "+ average);
		
		//close the scanner object 
		sc.close();
	}
}