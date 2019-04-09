

import java.util.Random;

	public class BankAccount {
		
	private static final String BIC = "ABCDDEFFXXX";
	
	private String Iban = "DE00123456780000000000";
	
	private int securityNumber;
	
	private Person owner;
	
	private double limit;
	
	private double balance;

	public BankAccount(Person owner, double limit, double balance){
		
		this.owner=owner;
		this.balance=balance;		
	 this.limit=limit;
			
		
		String a = "";
		Random r = new Random();
		
		for(int i = 0; i<7; i++){
			
			a+=this.securityNumber= r.nextInt(10);	
			
			this.securityNumber = Integer.parseInt(a);
		}

		Iban = Iban.substring(0, 12);
		
		for(int i = 0; i<10; i++){
			
			Iban+=new Random().nextInt(10);
		}								
	}

	public BankAccount(Person owner, double balance){
		
		this.owner=owner;
		
		this.balance=balance;	
		
		String a = "";
		
		Random r = new Random();
		
		for(int i = 0; i<6; i++){
			
			a+=this.securityNumber= r.nextInt(10);
		}
		
		this.securityNumber = Integer.parseInt(a);	
		
		Iban = Iban.substring(0, 12);
		
		for(int i = 0; i<10; i++){
			
			Iban+=new Random().nextInt(10);
			
		}								
	}

	public double getbalance(){
		return this.balance;
	}
	public void setbalance(double balance){
		this.balance=balance;
	}
	public String getiban(){
		return this.Iban;
	}

	public Person getowner(){
		return this.owner;
	}
	
	public int getSecurityNumber(){
		return this.securityNumber;
	}

	public double getlimit(){
		return this.limit;
	}
	

	public double deposit(double amount, int securityNumber){		
		if(securityNumber==this.securityNumber){
			balance = balance + amount;
			return balance;	
		}
		else {			

		return balance;
		}
	}
	public double withdraw(double amount, int securityNumber){		
		if((securityNumber==this.securityNumber)&&(amount<=limit+balance)){							
		balance = balance - amount;
		return balance;
		}
		else {			

		return balance;
		}
	}

	public void transfer(BankAccount remote, double amount, int securityNumber){
		if((securityNumber==this.securityNumber)&&(amount<=limit+balance)){							
			 remote.setbalance(remote.getbalance()+amount);
			 setbalance(balance - amount);
		}else
			System.out.println("Error");
	}	

} 