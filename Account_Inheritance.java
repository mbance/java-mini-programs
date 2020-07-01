public class Account{
	
	protected String id;
	protected double balance;

	public Account(String id, double balance){
		this.id = id;
		this.balance = balance;
	}

	public String getid(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}

	public String toString(){
		return "ID: " + id + " , Balance: " + balance;
	}

	public boolean withdraw(double amount){
		return balance = balance - amount;
	}

	public void deposit(double amount){
		balance = balance + amount;
	}

}