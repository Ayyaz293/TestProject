package classesandobjects;

public class AccountHolder {

	String firstname;
	String lastname;
	int age;
	float accountbalane;
	boolean eligibleforcreditcard;
	
	

public void eligibilitycondition(int a, int b) {
	
	if (age>a && accountbalane>b)
	{
		eligibleforcreditcard= true;
		
			
	}
	
	
}




}
