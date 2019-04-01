import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {

	@Test public static void Test1() {
	     
		Person owner = new Person("malik");
	    BankAccount account = new BankAccount(owner, 3000.00,1500.00);
	   
	    assertEquals(1500.00,account.getlimit(),0.001);
		}

	@Test public static void Test2() {
	     
	    Person owner = new Person("malik");
	    BankAccount account = new BankAccount(owner, 5000.00);
	   
	    assertEquals(0.00,account.getlimit(),0.001);
		}

	@Test public static void Test3() {
	     
	    Person owner = new Person("malik");
	    BankAccount account = new BankAccount(owner, 6000.00);
	    
	    account.deposit(600.00,account.getSecurityNumber());
	    account.withdraw(400.00,account.getSecurityNumber());
	    account.deposit(500.00,account.getSecurityNumber());
	    account.deposit(200.00,account.getSecurityNumber());
	   
	    assertEquals(900.00,account.getbalance(),0.001);
		}

	@Test public static void Test4() {
	     
	    Person owner = new Person("malik");
	    BankAccount account = new BankAccount(owner, 3000.00,500.00);
	    
	      account.withdraw(700.00,account.getSecurityNumber());
	   
	    assertEquals(300.00,account.getbalance(),0.001);
		}

	@Test public static void Test5() {
	     
	    Person owner = new Person("malik");
	    BankAccount account = new BankAccount(owner, 3000.00);
	    System.out.println(account.getiban());
	   
	    assertEquals(22,account.getiban().length(),0.001);
	}

	@Test public static void Test6() {
		 
		Person owner = new Person("malik");
		Person holder= new Person("shareef");
		BankAccount account = new BankAccount(owner, 3000.00,2000.00);
		BankAccount privateacc= new BankAccount(holder,5000.00,3000.00);
		//changes
		account.transfer(privateacc,400.00,account.getSecurityNumber());
		account.deposit(800.00,account.getSecurityNumber());
		//test
		assertEquals(3400.00,account.getbalance(),0.001);
	}

	 @Test public static void Test7() {
		
		 Person owner = new Person("John Doe");
		    BankAccount account = new BankAccount(owner, 1000.00,2000.00);
		    //test
		    assertEquals(2000.00,account.getlimit(),0.001);
	  }

	 @Test public static void Test8() {
		   
		  Person owner = new Person("malik");
		  BankAccount account = new BankAccount(owner, 3000.00,2000.00);
		  
		  account.withdraw(4300.00,account.getSecurityNumber());
		 
		  assertEquals(-1300,account.getbalance(),0.001);
	  }

	 @Test public static void Test9() {
		   
		  Person owner = new Person("malik");
		  Person newOwner=new Person("shareef");
		  BankAccount account = new BankAccount(owner, 3000.00,500.00);
		  BankAccount remote=new BankAccount(newOwner,3500.00);
		  
		    account.transfer(remote,300.00,account.getSecurityNumber());
		 
		  assertEquals(700.00,account.getbalance(),0.001);
	  }


	 @Test public static void Test10() {
		   
		  Person owner = new Person("malik");
		  BankAccount account = new BankAccount(owner, 3000.00);
		  boolean result = (account.getSecurityNumber()<1000000) && (account.getSecurityNumber()>10000);
		 
		  assertEquals(true,result,0.001);
	  }

	@Test public static void Test11() {
		   
		  Person owner = new Person("malik");
		  BankAccount account = new BankAccount(owner, 3000.00);
		 
		  assertEquals(3000.00,account.getbalance(),0.001);
	  }

	   @Test public static void Test12() {
		  
		  Person owner = new Person("malik");
		  BankAccount account = new BankAccount(owner, 3000.00,5000.00);
	
		  assertEquals(5000.00,account.getlimit(),0.001);
	  }

	   @Test public static void Test13() {
		  
		  Person owner = new Person("malik");
		  Person newOwner=new Person("shareef");
		  BankAccount account = new BankAccount(owner, 3000.00,500.00);
		  BankAccount remote=new BankAccount(newOwner,3500.00);
		  
		    account.transfer(remote,300.00,account.getSecurityNumber());
		 
		  assertEquals(3800.00,remote.getbalance(),0.001);
	  }

	   @Test public static void Test14() {
		   
		  Person owner = new Person("malik");
		  
		  Person holder= new Person("shareef");
		  
		  BankAccount account = new BankAccount(owner, 1000.00,2000.00); 
		  
		  BankAccount privateacc= new BankAccount(holder,5000.00,1000.00);
		  
		  
		  account.transfer(privateacc,600.00,account.getSecurityNumber());
		  account.deposit(800.00,account.getSecurityNumber());
		  
		  
		 
		  assertEquals(5600.00,privateacc.getbalance(),0.001);
	  }

	  @Test public static void Test15() {
		  Person owner = new Person("John Doe");
		    BankAccount account = new BankAccount(owner, 2000.00);
		    //changes
		    account.deposit(700.00,account.getSecurityNumber());
		    account.withdraw(1200.00,account.getSecurityNumber());
		    account.deposit(500.00,account.getSecurityNumber());
		    account.deposit(2100.00,account.getSecurityNumber());
		    //test
		    assertEquals(owner,account.getowner(),0.001);
		    assertEquals(4100.00,account.getbalance(),0.001);
		  }
		}