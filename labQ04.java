package methods.sub;

public class labQ04 {

	public static void main(String[] args) {
		/*Question-4

The deers in VA spend most of the day playing. 
In particular, they play if the temperature is between 60 and 90. 
Unless it is summer, then the upper limit is 100 instead of 90.
Write a method that accepts temperature and a boolean isSummer, 
prints true if the deers play and false otherwise.

*/
deerPlay(70, false); 
deerPlay(95, false);
deerPlay(95, true); 

	}
public static void deerPlay(int temp, boolean isSummer) {
	if(isSummer) {
		if(60<=temp&&temp<=100) {
			System.out.println("true");
		}else {System.out.println("false");
	}}
		else {
		if(60<=temp&&temp<=90) {
			System.out.println("true");
		}else {System.out.println("false");}
	
		}
		
	
	/*if(isSummer!=true) {   
		if(60<=temp&&temp<=90) {
			System.out.println("true");
		}else {System.out.println("false");}
	}
	
	else if(isSummer==true) {
		if(60<=temp&&temp<=100) {
			System.out.println("true");
			
		}else {System.out.println("false");}
	}*/
	}
}

