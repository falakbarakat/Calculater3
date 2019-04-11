package se.lexicon.falak.calculator3;
import java.util.Scanner;
public class App {
	static boolean running = true;
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		while (running) {
			i_calculator cal = new calculatori();
			System.out.println("input num1");
			double num1 = Double.parseDouble(sc1.nextLine());
			System.out.println("input num2");
			double num2 = Double.parseDouble(sc1.nextLine());
			System.out.println("input the operator");
			String operator = sc1.nextLine();
			switch (operator) {
			case "+":
				System.out.println(cal.add(num1, num2));
				break;
			case "-":
				System.out.println(cal.substract(num1, num2));
				break;
			case "*":
				System.out.println(cal.multiply(num1, num2));
				break;
			case "/":
				System.out.println(cal.devide(num1, num2));
				break;
			default:
				throw new IllegalArgumentException("operator : " + operator + "not valid operator");
			}
		System.out.println(" Do you have more numbers to calculate?");
		String answer = sc1.nextLine();
		switch (answer.toUpperCase()) {
		case "Y":
			running = true;
			break;
		default:
			System.out.println("good by");
			running = false;
		}
	 }
  }
}
