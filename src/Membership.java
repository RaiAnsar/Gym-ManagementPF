
public class Membership {

	public static void membership() {
		
		String[] MEMBERSHIP_LEVEL =  {"PLATINUM", "GOLD", "SILVER"};
		
		String[] PLATINUM = {"PLATINUM","10000","Bath", "Massage","Exclusive Trainer"};
		
		String[] GOLD = {"GOLD","6500","Bath", "       ","Trainer"};
		
		String[] SILVER = {"SILVER","4000","    ", "","No Trainer"};
	}
		
	public static void print() {
		String[] PLATINUM = {"PLATINUM", "10000", "Bath", "Massage", "Exclusive Trainer"};	
		String[] GOLD = {"GOLD", "6500", "Bath", "", "Trainer"};
		String[] SILVER = {"SILVER", "4000", " ", "", "No Trainer"};
		
		System.out.println(" ");
		System.out.printf("%-10s%-7s%-6s%-9s%-20s\n",PLATINUM[0],PLATINUM[1], PLATINUM[2], PLATINUM[3], PLATINUM[4] );
		System.out.printf("%-10s%-7s%-6s%-9s%-20s\n",GOLD[0],GOLD[1],GOLD[2],GOLD[3],GOLD[4] );
		System.out.printf("%-10s%-7s%-6s%-9s%-20s\n",SILVER[0], SILVER[1], SILVER[2], SILVER[3], SILVER[4] );

	

}
	}

