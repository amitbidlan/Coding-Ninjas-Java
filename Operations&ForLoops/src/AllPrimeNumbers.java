import java.util.Scanner;
public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1;i<=n;i++) {
			int a = 6*i-1;
			int b = 6*i+1;
			if(a%2 != 0 && a%3 !=0) {
				if(a%5 !=0 && a%7 !=0) {
					if(a>n) {
						return;
					}
					else {
						System.out.println(a);
					}
				}
			}

			if(b%2 != 0 && b%3 !=0) {
				if(b%5 !=0 && b%7 !=0) {
					if(b>n) {
						return;
					}
					else {
						System.out.println(b);
					}
				}
			}
		}
	}
}


