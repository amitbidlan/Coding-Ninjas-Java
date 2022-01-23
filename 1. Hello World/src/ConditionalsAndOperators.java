import java.util.Scanner;
public class ConditionalsAndOperators {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a > 0) {
			System.out.println("the entered number A is positive");
			
		}else {
			System.out.println("The entered number A is Negative");
		}
			
		if (b > 0) {
				System.out.println("the entered number B is positive");
		}else {
			System.out.println("The entered number B is Negative");
		}
		
	}

}
