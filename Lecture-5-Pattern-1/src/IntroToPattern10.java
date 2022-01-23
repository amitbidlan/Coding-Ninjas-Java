import java.util.Scanner;
public class IntroToPattern10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(n>=i) {
			int j = 1;
			while(j<=i) {
				char toPrint = (char)('A' + i-1);
				System.out.print(toPrint);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
