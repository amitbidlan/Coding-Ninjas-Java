import java.util.Scanner;
public class GetTwoNumberInputs {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //create a scanner to fetch values
		
//		// defining variables
//		int a , b;
//		
//		//fetch a
//		a = s.nextInt();
//		b = s.nextInt();
//		
//		int c = a + b;
//		System.out.println(c);
//		// if want input in form of Double we will write
//		//s.nextDouble()
//		
//		//s.next() == Gives word Input
//		// String Str = s.next()
//		
//		//s.nextLine() == Fetches Entire Line
//		
//		// Character printing is done in diff way
//		
//		String str = s.next();
//		char ch = str.charAt(0);
//		
//		double x = 6/4;
//		
//		
//		System.out.println(ch);
//		System.out.println(x);
		
		double a = 55.5;
		int b = 55;
		a = a%10;
		b = b%10;
		System.out.println(a + " " + b);
	}

}
