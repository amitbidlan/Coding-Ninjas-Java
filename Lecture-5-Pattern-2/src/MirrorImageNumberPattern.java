import java.util.Scanner;

public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;

		while(n>=i) {
			int spaces = 1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces++;
			}
			int num = 1;
			while(num<=i) {
				System.out.print(num);
				num++;
			}
			i++;
			System.out.println();
		}
	}

}
