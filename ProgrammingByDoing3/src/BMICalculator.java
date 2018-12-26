/*For +10 bonus points, use more if statements to show the ALL the BMI categories.

BMI	category
less than 15.0	very severely underweight
15.0 to 16.0	severely underweight
16.1 to 18.4	underweight
18.5 to 24.9	normal weight
25.0 to 29.9	overweight
30.0 to 34.9	moderately obese
35.0 to 39.9	severely obese
40.0 and up	very severely (or "morbidly") obese
*/


import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height=0,weight=0;
		String category = "";
		Scanner input=new Scanner(System.in);
		System.out.print("Your height in metres: ");
		height = input.nextDouble();
		
		System.out.print("Your weight in kg: ");
		weight = input.nextDouble();
		
		double bmi= weight/(Math.pow(height, 2));
		
		if (bmi<15.0) { //mistake:didnt use && but || instead
			System.out.printf("Your BMI is %4.1f", bmi);
			category = "very severely underweight";
		}else if(bmi>=15.0&&bmi<=16) {
			System.out.printf("Your BMI is %4.1f",bmi);
			category = "severly underweight";
		}else if(bmi>16.0&&bmi<=18.4) {
			System.out.printf("Your BMI is %4.1f",bmi);
			category = "underweight";
		}else if(bmi>=18.5&&bmi<=24.9) {
			System.out.printf("Your BMI is %4.1f",bmi);
			category = "normal";
		}else if(bmi>=25&&bmi<=29.9) {
			System.out.printf("Your BMI is %4.1f",bmi);
			category = "overweight";
		}else if(bmi>=30&&bmi<=34.9) {
			System.out.printf("Your BMI is %4.1f",bmi);
			category = "moderately obese";
		}else if(bmi>=35&&bmi<=39.9) {
			System.out.printf("Your BMI is %4.1f",bmi);
			category = "severely obese";
		}else if(bmi>40.0){
			System.out.printf("Your BMI is %4.1f",bmi);
			category = "morbidly obese";
		}
		System.out.println("\nBMI category: "+category);
	}

}
