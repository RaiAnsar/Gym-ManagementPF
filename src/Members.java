import java.util.Scanner;

public class Members {
	public static void main(String[][] memberArray) {
		boolean bool = true;
		while(bool==true) {
		Scanner input = new Scanner(System.in);
		System.out.println("1: Add a new Member");
		System.out.println("2: Delete Existing User");
		System.out.println("3: Display List of All Members");
		System.out.println("4: To Main Menu");
		System.out.print("\rOption No: ");
		int ctrl = input.nextInt();
		switch (ctrl) {
		case 1:
			addNew(memberArray); break;
			
		case 2:
			delMember(memberArray); break;
		case 3:
			displayMembers(memberArray);break;
		case 4: bool = false;
			System.out.println("Back to Main Menu"); break;
		default:
			System.out.println("Invalid Entry");	
		}	
	}
}

	public static String[][] Arrays() {
		String[][] memberArray = new String[100][6];
		memberArray[0][0] = "101";
		memberArray[1][0] = "102";
		memberArray[2][0] = "103";
		memberArray[3][0] = "104";
		memberArray[4][0] = "105";
		memberArray[5][0] = "106";
		memberArray[0][1] = "Rai";
		memberArray[1][1] = "Khadeeja";
		memberArray[2][1] = "Moqeet";
		memberArray[3][1] = "Sami";
		memberArray[4][1] = "Maida";
		memberArray[5][1] = "Haris";

		memberArray[0][2] = "Platinum";
		memberArray[1][2] = "Gold";
		memberArray[2][2] = "Silver";
		memberArray[3][2] = "Gold";
		memberArray[4][2] = "Silver";
		memberArray[5][2] = "Platinum";

		memberArray[0][3] = "21";
		memberArray[1][3] = "19";
		memberArray[2][3] = "20";
		memberArray[3][3] = "12";
		memberArray[4][3] = "19";
		memberArray[5][3] = "16";
		memberArray[0][4] = "MALE";
		memberArray[1][4] = "FEMALE";
		memberArray[2][4] = "MALE";
		memberArray[3][4] = "MALE";
		memberArray[4][4] = "FMALE";
		memberArray[5][4] = "MALE";

		memberArray[0][5] = "0300-0000000";
		memberArray[1][5] = "0300-1111111";
		memberArray[2][5] = "0300-2222222";
		memberArray[3][5] = "0300-3333333";
		memberArray[4][5] = "0300-4444444";
		memberArray[5][5] = "0300-5555555";
		

		return memberArray;
	}

	public static String[][] addNew(String[][] memberArray) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i][0] == (null)) {
				System.out.println("Register New Member");
				memberArray[i][0] = Integer.toString(i + 101);
				System.out.print("Name: ");
				memberArray[i][1] = input.next();
                memberArray[i][1] += " ";
                memberArray[i][1] += input.next();
				System.out.print("Membership: ");
				memberArray[i][2] = input.next();
				System.out.print("Age: ");
				memberArray[i][3] = input.next();
				System.out.print("Gender: ");
				memberArray[i][4] = input.next();
				System.out.print("Mobile NO: ");
				memberArray[i][5] = input.next();
				return memberArray;
			}
		}
		return null;
	}

	public static String[][] delMember(String[][] memberArray) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter MemberShip Number to Del Member");
		int x = input.nextInt();
		if (memberArray[x - 101][0] != null) {
			for (int i = 1; i < 6; i++) 
				memberArray[x - 101][i] = "deleted"; 
			memberArray[x-101][3] = "--";
			System.out.println("Member Deleted and List Updated");
			return memberArray;	
		} 
		else {
			System.out.println("Member doesn't Exist ");
		}
		return null;

	}

	public static void displayMembers(String[][] memberArray) {
		System.out.println("Below is the data of All Registered Members: \n");
		System.out.printf("%-11s%-2s%-15s%-2s%-10s%-2s%-5s%-2s%-7s%-2s%-14s\n", " Member NO ", "|", "Member Name ", "|",
				"Membership ", "|", "Age", "|", "Gender", "|", "Contact NO");
		int i = 0;
		while (memberArray[i][0] != null) {
			System.out.printf("%11s%-2s%-15s%-2s%-11s%-2s%-5s%-2s%-7s%-2s%-14s\n", memberArray[i][0] + " ", "|",
					memberArray[i][1], "|", memberArray[i][2], "|", memberArray[i][3], "|", memberArray[i][4], "|",
					memberArray[i][5]);
			++i;
		}
	}
}
