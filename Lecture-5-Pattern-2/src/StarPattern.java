import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(n>=i) {
			int spaces = 1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces++;
			}
			int ch = 1;
			while(ch<=i) {
				System.out.print("*");
				ch++;
			}
			int dec = 1;
			while(dec<i) {
				System.out.print("*");
				dec++;
			}
			i++;
			System.out.println();
		}
	}

}
