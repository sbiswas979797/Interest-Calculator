package TM04_Proj1;

public class RDAccount extends Account {
	int noOfMonths;
	int ageOfACHolder;
	@Override
	double calculateInterest() {
		if(ageOfACHolder>0&&ageOfACHolder<60) {
			if(noOfMonths==6)
				interestRate = 7.5;
			else if(noOfMonths==9)
				interestRate = 7.75;
			else if(noOfMonths==12)
				interestRate = 8;
			else if(noOfMonths==15)
				interestRate = 8.25;
			else if(noOfMonths==18)
				interestRate = 8.5;
			else if(noOfMonths==21)
				interestRate = 8.75;
			else 
				System.out.println("Invalid number of months");
		}
		else if(ageOfACHolder>=60&&ageOfACHolder<125) {
			if(noOfMonths==6)
				interestRate = 8;
			else if(noOfMonths==9)
				interestRate = 8.25;
			else if(noOfMonths==12)
				interestRate = 8.5;
			else if(noOfMonths==15)
				interestRate = 8.75;
			else if(noOfMonths==18)
				interestRate = 9;
			else if(noOfMonths==21)
				interestRate = 9.25;
			else 
				System.out.println("Invalid number of months");
		}
		else {
			System.out.println("Invalid Age of Account holder");
		}
		return  (amount * interestRate)/100;
	}

}
