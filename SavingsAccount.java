class SavingsAccount extends Account_Inheritance;

double initialDeposit;
double rate;


public SavingsAccount(String id, double initialDeposit){
	super(id);
	this.initialDeposit = initialDeposit;
	if(initialDeposit < 10.0){
		System.out.println("Minimum initial deposit is £10.");
	}
	if(initialDeposit >= 1000.0){
		balance = balance + 10.0;
	}
}

public boolean withdraw(double amount){
	if(balance < 10.0 || amount > balance){
		balance = amount - 3.0;
		System.out.println("There are insufficient funds.")
		return balance = balance - amount;
	}
}

public double addInterest(double rate){
	return balance = balance + (balance * rate);
}