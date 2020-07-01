//IMPORT JAVA PACKAGE//
import java.util.*;

public class Account{

	//INSTANCE VARIABLES//
	String name;
	int accountNumber;
	double balance;

	//CLASS VARIABLES//
	static ArrayList <Account> ListOfAccounts = new ArrayList <Account> ();
	static int numberOfAccounts;

	//CONSTRUCTORS//
	public Account(String name, int accountNumber, double balance){
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	//GETTERS AND SETTERS//
	public String getName(){
		return name;
	}

	public void setName (String name){
		this.name = name;
	}

	public int getAccountNumber(){
		return accountNumber;
	}

	public void setAccountNumber (int accountNumber){
		this.accountNumber = accountNumber;
	}

	public double getBalance(){
		return balance;
	}

	public void setBalance (double balance){
		this.balance = balance;
	}


	//TRANSACTIONS//
	public double deposit (double depo){
		balance = balance + depo;
		return balance;
	}

	public double withdraw (double wdraw){
		if(balance > wdraw){
			balance = balance - wdraw;
		}
		else{
			System.out.println("There are Insufficient Funds")
		}
		return balance;
	}

	public void deleteAccount(int accountNumber){
		for(i = 0; i < ListOfAccounts.size(); i++){
			if(ListOfAccounts.get(i).accountNumber == accountNumber){
				ListOfAccounts.remove(i);
			}
		}
	}

	public void toString(){
		
	}
}