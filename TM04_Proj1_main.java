package TM04_Proj1;

import java.util.Scanner;

public class TM04_Proj1_main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ch;
		do {
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("1.Interest Calculator –SB ");
			System.out.println("2.Interest Calculator –FD ");
			System.out.println("3.Interest Calculator –RD ");
			System.out.println("4.Exit");
			System.out.print("Enter your option (1..4):");
			ch = scanner.nextInt();
			switch(ch){
				case 1:
					System.out.print("Enter the Average amount in your account: ");
					SBAccount sbaccount = new SBAccount();
					sbaccount.amount = scanner.nextInt();
					System.out.println("Enter 1 for Normal Account or Enter 2 for NRI Account.");
					sbaccount.typeOfAcc = scanner.nextInt();
					if(sbaccount.amount>0) {
						if(sbaccount.typeOfAcc>=1&&sbaccount.typeOfAcc<=2) {
							System.out.println("Interest gained: Rs. "+sbaccount.calculateInterest());							
						}
						else {
							System.out.println("Invalid type of Account. Enter the right option.");
						}
					}
					else {
						System.out.println("Invalid amount. Please enter non-negative values.");
					}
					break;
				case 2:
					FDAccount fdaccount = new FDAccount();
					System.out.print("Enter the FD amount: ");
					fdaccount.amount = scanner.nextInt();
					System.out.print("Enter the number of days: ");
					fdaccount.noOfDays = scanner.nextInt();
					System.out.print("Enter your age: ");
					fdaccount.ageOfACHolder = scanner.nextInt();					
					if(fdaccount.amount>0) {
						if(fdaccount.noOfDays>0) {
							if(fdaccount.ageOfACHolder>0) {
								System.out.println("Interest gained is: Rs. "+fdaccount.calculateInterest());					
							}
							else {
								System.out.println("Invalid age of Account Holder. Please enter non-negative values.");
							}						
						}
						else {
							System.out.println("Invalid Number of days. Please enter non-negative values.");
						}
					}
					else {
						System.out.println("Invalid amount. Please enter non-negative values.");
					}					
					break;
				case 3:
					RDAccount rdaccount = new RDAccount();
					System.out.print("Enter the FD amount: ");
					rdaccount.amount = scanner.nextInt();
					System.out.print("Enter the number of months: ");
					rdaccount.noOfMonths = scanner.nextInt();
					System.out.print("Enter your age: ");
					rdaccount.ageOfACHolder = scanner.nextInt();					
					if(rdaccount.amount>0) {
						if(rdaccount.noOfMonths>0) {
							if(rdaccount.ageOfACHolder>0) {
								System.out.println("Interest gained is: Rs. "+rdaccount.calculateInterest());
							}
							else {
								System.out.println("Invalid age of Account Holder. Please enter non-negative values.");
							}						
						}
						else {
							System.out.println("Invalid Number of months. Please enter non-negative values.");
						}
					}
					else {
						System.out.println("Invalid amount. Please enter non-negative values.");
					}
					break;
				case 4:
					System.out.print("Exiting...!! Thanks for using the application.");
					System.exit(1);
					break;
				default:
					System.out.print("Enter the right option");
					break;
			}
		}while(ch<5);
	}

}
