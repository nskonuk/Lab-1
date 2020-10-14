package methods.sub;

public class labQ01 {

	public static void main(String[] args) {
		/* Question-1

Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String

stringTimes("Hi", 2); = > HiHi
stringTimes("Hi", 3); = > HiHiHi
stringTimes("Hi", 1); = > Hi*/
		stringTimes("Hi", 6);
	

	}
public static void stringTimes(String copy, int num) {
	copy="Hi";                    //Alternative: String str=""; 
	for (int i=1; i<=num; i++) {
		System.out.print(copy); //str= copy+str
	}
	 //System.out.print(str)
}
}
