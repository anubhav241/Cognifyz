package cognifyz.level1.task1.TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user for temperature value
		System.out.print("Enter temperature value: ");
		double temperature = sc.nextDouble();
		
		//Prompt the user for unit
		System.out.print("Enter the unit of masurement(C for Celsius or F for Fahrenheit):  ");
		String unit = sc.next().trim().toUpperCase();
		
		//conversion based on the unit
		if(unit.equals("C")){			
			System.out.println(temperature + "°C is equal to " + celsiusToFahrenheit(temperature) +"°F" );
		}else if(unit.equals("F")){		
			System.out.println(temperature + "°F is equal to " + fahrenheitToCelsius(temperature) +"°C" );
		}else {
			System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
		}
		sc.close();
	}
	
	//Conversion for celsius to fahrenheit
	public static double celsiusToFahrenheit(double celsius) {
		return ( celsius * 9/5 ) + 32; 
	}
	
	//Conversion for fahrenheit to celsius
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9; 
	}
}
