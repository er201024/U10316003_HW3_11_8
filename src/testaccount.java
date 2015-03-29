/**
 * Name: 彭涵芸 </br>
 * ID: U10316003 </br>
 * Ex: 11.8</br>
 **/

import java.util.Date;
import java.util.ArrayList;

public class testaccount {
	/**Main method*/
	public static void main(String[] args){
		
		// new object name Account
		Account Account = new Account("George" ,1000.0 ,1122);
		
		// call setannualInterestRate method and withdraw method and deposit method by value
		Account.setannualInterestRate(1.5);
		Account.withdraw(2);
		Account.withdraw(4); 
		Account.withdraw(5);
		Account.deposit(30);
		Account.deposit(40);
		Account.deposit(50);
		
		//call toString method to print
		System.out.println(Account.toString());
		
		//call ArrayList name List
		ArrayList<transaction> List = Account.getList();
		
		//loop to print type, Balance, amount, description, date
		for(int i = 0;i < 6;i++){
			System.out.println("Your type is " + List.get(i).gettype());
			System.out.println("Your Balance is " + List.get(i).getBalance());
			System.out.println("Your amount is " + List.get(i).getamount());
			System.out.println("Your description is " + List.get(i).getdescription());
			System.out.println("Your date is " + List.get(i).getdateCreated());
			System.out.println();
		}
	}
}

class Account{
	//variable
	private int id = 0;
	private double Balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated ;
	private String name ;
	
	//new ArrayList name List
	ArrayList<transaction> List = new ArrayList<>();
	
	//a no-arg construct
	public Account(){
		dateCreated = new java.util.Date();
	}
	
	//Construct Accounts
	public Account(String name ,double Balance ,int id){
		dateCreated = new Date();
		this.id = id;
		this.Balance = Balance;
		this.name = name;
	}
	
	//get List
	public ArrayList<transaction> getList(){
		return List;
	}
	
	//set name
	public void setname(String name){
		this.name = name;		
	}
	
	//get name
	public String getname(){
		return name;
	}
	
	//set id
	public void setid(int id){
		this.id = id;	
	}
	
	//get id
	public int getid(){
		return id;
	}
	
	//set Balance
	public void setBalance(double Balance){
		this.Balance = Balance;	
	}
	
	//get Balance	
	public double getBalance(){
		return Balance;
	}
	
	//set annualInterestRate	
	public void setannualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	//get annualInterestRate	
	public double getannualInterestRate(){
		return annualInterestRate/100;
	}
	
	//get dateCreated	
	public Date getdateCreated(){
		return dateCreated;
	}
	
	//get monthlyInterestRate		
	public double getmonthlyInterestRate(){
		return getannualInterestRate() / 1200;
	}
	
	//get monthlyInterest	
	public double getmonthlyInterest(){
			
		return Balance * (annualInterestRate / 1200);
	}
	
	//method withdraw to decrease Balance and List.add	
	public void withdraw(double withdraw){
		
		Balance = Balance - withdraw;
			
		List.add(new transaction('w',withdraw ,Balance,"Your withdraw some money"));
	}
	
	//method withdraw to increase Balance and List.add	
	public void deposit(double deposit){
		Balance = Balance + deposit;
		List.add(new transaction('D',deposit ,Balance,"Your deposit some money"));
	}
	
	//toString method to print	
	public String toString(){
				
		return "name : " + getname() + "\nID : " + getid() + "\nBalance : " + getBalance() + "\nMonthly Interest : " + getmonthlyInterest() + "\nDate : " + dateCreated;

	}
}

class transaction{
	//variable
	char type;
	double amount;
	double Balance;
	String description;
	private java.util.Date dateCreated ;
	
	//Construct transaction
	public transaction(char type,double amount ,double Balance,String description){
		dateCreated = new java.util.Date(); 
		this.type = type;
		this.amount = amount;
		this.Balance = Balance;
		this.description = description;	
	}
	
	//set type
	public void settype(char type){
		this.type = type;
	}
	
	//get type
	public char gettype(){
		return type;
	}
	
	//set amount
	public void setamount(double amount){
		this.amount = amount;
	}
	
	//get amount
	public double getamount(){
		return amount;
	}
	
	//set Balance
	public void setBalance(double Balance){
		this.Balance = Balance;
	}
	
	//get Balance
	public double getBalance(){
		return Balance;
	}
	
	//get description
	public void setdescription(String description){
		this.description = description;
	}
	
	//set description
	public String getdescription(){
		return description;
	}
	
	//get dateCreated
	public Date getdateCreated(){
		return dateCreated;
	}
	
}	
	

