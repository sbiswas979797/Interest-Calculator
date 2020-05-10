package TM04_Proj1;

public class FDAccount extends Account {
	int noOfDays;
	int ageOfACHolder;
	@Override
	double calculateInterest() {
		if(amount<=10000000) {
			if(ageOfACHolder>0&&ageOfACHolder<60) {
				if(noOfDays>=7&&noOfDays<=14)
					interestRate = 4.5;
				else if(noOfDays>=15&&noOfDays<=29)
					interestRate = 4.75;
				else if(noOfDays>=30&&noOfDays<=45)
					interestRate = 5.5;
				else if(noOfDays>=46&&noOfDays<=60)
					interestRate = 7;
				else if(noOfDays>=61&&noOfDays<=184)
					interestRate = 7.5;
				else if(noOfDays>=185&&noOfDays<=365)
					interestRate = 8;
				else 
					System.out.println("Invalid number of days");
			}
			else if(ageOfACHolder>=60&&ageOfACHolder<125) {
				if(noOfDays>=7&&noOfDays<=14)
					interestRate = 5;
				else if(noOfDays>=15&&noOfDays<=29)
					interestRate = 5.25;
				else if(noOfDays>=30&&noOfDays<=45)
					interestRate = 6;
				else if(noOfDays>=46&&noOfDays<=60)
					interestRate = 7.5;
				else if(noOfDays>=61&&noOfDays<=184)
					interestRate = 8;
				else if(noOfDays>=185&&noOfDays<=365)
					interestRate = 8.5;
				else 
					System.out.println("Invalid number of days");
			}
			else {
				System.out.println("Invalid Age of Account holder");
			}
		}
		if(amount>10000000) {
			if(ageOfACHolder>0&&ageOfACHolder<125) {
				if(noOfDays>=7&&noOfDays<=14)
					interestRate = 6.5;
				if(noOfDays>=15&&noOfDays<=29)
					interestRate = 6.75;
				if(noOfDays>=30&&noOfDays<=45)
					interestRate = 6.75;
				if(noOfDays>=46&&noOfDays<=60)
					interestRate = 8;
				if(noOfDays>=61&&noOfDays<=184)
					interestRate = 8.5;
				if(noOfDays>=185&&noOfDays<=365)
					interestRate = 10;
			}
			else {
				System.out.println("Invalid Age of Account holder");
			}
		}
		return (amount * interestRate)/100;
	}
}
