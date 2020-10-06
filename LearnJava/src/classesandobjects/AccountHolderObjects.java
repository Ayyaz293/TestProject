package classesandobjects;

public class AccountHolderObjects {


  public static void main(String[] args) {
	
	  AccountHolder tom = new AccountHolder();
	  AccountHolder henry = new AccountHolder(); 
	  AccountHolder sarah = new AccountHolder(); 

	  tom.firstname="Tom";
	  tom.lastname="Tomi";
	  tom.age=9;
	  tom.accountbalane=500;
	  
	  tom.eligibilitycondition(22,77000);
	  System.out.println("Is Tom eligible for creditcard:" +tom.eligibleforcreditcard);
	  
	  

	  henry.firstname="Tom";
	  henry.lastname="Tomi";
	  henry.age=22;
	  henry.accountbalane=2560;
	  
	  henry.eligibilitycondition(12,12);
	  System.out.println("Is henry eligible for creditcard:" +henry.eligibleforcreditcard);
  }

}
