package methods.sub;

public class labQ6 {

	public static void main(String[] args) {
		/*Question-6

When chipmonks get together for a party, 
they like to have cigars. A chipmonk party is successfull when 
the number of cigars is between 40 and 60. Unless it is the weekend, 
in which case there is no upper bound on the number of cigars.
Write a method that accepts number of cigars and a boolean for weekend,
 and prints true if the party with the given values is successful, or false otherwise.

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true*/
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
		

	}
public static void cigarParty(int cigarNum, boolean weekend) {
	if(weekend==false)  {
		if(40<=cigarNum&&cigarNum<=60) {
			System.out.println("true");
		}else {
			System.out.println("false");}
	}else if(weekend==true)  {
		if (40<=cigarNum){
			System.out.println("true");
		}else {
				System.out.println("false");}
		
	}
}
		
	}

