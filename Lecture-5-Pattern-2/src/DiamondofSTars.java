import java.util.Scanner;

public class DiamondofSTars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int n1 = (n+1)/2;
		int n2 = n1-1;
		while(i<=n1) {
			int spaces1 = 1;
			while(spaces1<=n1-i) {
				System.out.print(' ');
				spaces1++;
			}
			int stars1 = 1;
			while(stars1<=(2*i)-1) {
				System.out.print("*");
				stars1++;
			}
			i++;
			System.out.println();

		}

		 i = n2;
		while(i>=1){
			int space = 1;
			while(space<=n2-i+1) {
				System.out.print(" ");
				space+=1;
			}
			int star = 1;
			while(star<=2*i-1) {
				System.out.print("*");
				star+=1;
			}

			System.out.println();
			i-=1;		

		}

	}
}




