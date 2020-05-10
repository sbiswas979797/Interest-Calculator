package TM04_Proj1;

public class SBAccount extends Account {
	int typeOfAcc;
	@Override
	double calculateInterest() {
		if(typeOfAcc==1)
			interestRate = 4;
		if(typeOfAcc==2)
			interestRate = 6;		
		return (amount * interestRate)/100;
	}

}
