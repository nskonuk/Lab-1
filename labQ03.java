package methods.sub;

public class labQ03 {

	public static void main(String[] args) {
		/*Question-3

We'll say a number is special if it is a multiple of 11
 or if it is one more than a multiple of 11. 
 Write a method that accepts a number and prints true if the given number is special.

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false*/
	specialEvent(44);	
	specialEvent(45);	
	specialEvent(58);	

	}
public static void specialEvent(int num) {
	if(num%11==0||num%11==1) {//(num-1)%11==0
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}
