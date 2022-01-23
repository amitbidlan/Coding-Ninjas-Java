import java.util.Scanner;

public class InvertedNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while(n>=i) {
			int chr = 1;
			
			while(chr <= n-i+1) {
				System.out.print(n-i+1);
				chr++;
			}
			int spaces = 1;
			while(spaces<=i-1) {
				System.out.print(' ');
				spaces++;
			}
			i++;
			System.out.println();
			
		}
	}

}
