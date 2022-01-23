import java.util.Scanner;
public class CheckIfPrime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int div = 2;
		//boolean isPrime = true;
		while(div<=n/2) {
			
			if(n%div==0) {
				System.out.println("The number is Composite");
				//isPrime = false;
				return;
			}
			div = div + 1;
		}
		
			System.out.println("The number is Prime");
		
		
		
	}
}
