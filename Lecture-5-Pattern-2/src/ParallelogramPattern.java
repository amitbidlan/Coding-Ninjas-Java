import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while(i<=n) {
			int spaces = 1;
			while(spaces<i) {
				System.out.print(' ');
				spaces++;
			}
			int stars = 1;
			while(stars<=n) {
				System.out.print("*");
				stars++;
			}
			i++;
			System.out.println();
		}

	}

}
