import java.util.Scanner;
public class MirrorImagePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		while(n>=i) {
			int spaces = 1;
			while(spaces <= n-i) {
				System.out.print(' ');
				spaces++;
			}
			int stars = 1;
			while(stars<=i) {
				System.out.print("*");
				stars++;
			}
			
			System.out.println();
			i++;
		}
		
	}

}
