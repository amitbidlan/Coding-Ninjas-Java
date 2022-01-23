
import java.util.Scanner;
public class NestedIfElse {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a>b) {
			System.out.println("A is Greater than B");
		}
		
		else if(b>a) {
			System.out.println("B is greter than A");
		}
		
		else {
			System.out.println("Both are equal");
		}
		
	}
}
