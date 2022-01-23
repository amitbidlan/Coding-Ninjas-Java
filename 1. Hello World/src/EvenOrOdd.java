
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a ;
		a = s.nextInt();
		int rem = a%2;
		boolean result = rem == 0;
		
		if(result = true) {
			System.out.println(a + " is even");
			
			// Can be Written as
			// if (result) Since it always takes a true statement.
			// or if (rem ==0)
			//or if (a%2 ==0)
		}else {
			System.out.println(a + " is odd");
			
		}
	}

}
