import java.util.Scanner;

public class Trainers {

	public static void trainers() {
		String[] TRAINERS = {"James Bond","Sarah","Ahsan Malik" };
		
		System.out.println("Currently available trainers are: ");
		for(int i=0; i<TRAINERS.length; i++) {
			System.out.printf("\n%-20s", "  "+TRAINERS[i]);
		}
		System.out.println(" ");
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter Trainer's First Name for Information: ");
		String tName = input.next();
		
		tInfo(tName);
		input.close();
	}
	public static void tInfo(String x){
		System.out.println(" ");
		if(x.equals("James")) {
			System.out.println(" James Has Great Experience of Training, He is Well Known for his work on National Level.");
		}
		else if(x.equals("Sarah")) {
			System.out.println(" Sarah Has Great Experience of Training, She is Well Known for his work on National Level.");
			}
		else if(x.equals("Ahsan")) {
			System.out.println(" Malik Has Great Experience of Training, He is Well Known for his work on National Level.");
		}
		else
			System.out.println(" Error> Incorrect Name || Spell Mismatch ");
	}
}
