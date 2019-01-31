import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		boolean bool=true;
		while (bool==true) {
		
		System.out.println("\nWelcome to The PEEKAY Gym | Rai Ansar");
		System.out.println("Manager MENU");
		Scanner input = new Scanner(System.in);
		System.out.println("1 to Manage Member.");
		System.out.println("2 to Check Membership Status.");
		System.out.println("3 to Check Available Membership.");
		System.out.println("4 to Check Trainers' Background.");
		System.out.println("0 to Exit Program");
		System.out.print("Enter Option Number: ");
		int Choice = input.nextInt();
		
	switch(Choice) {
			case 1: Members.main(Members.Arrays()); break;
			case 3: Membership.print(); break;
			case 4: Trainers.trainers(); break;
			case 0: bool = false;
			default: System.out.println("Invalid Input");
		}
	}
}}
