import java.util.Scanner;

public class IntroToPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
