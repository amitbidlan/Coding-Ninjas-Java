import java.util.Scanner;
public class HalfDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int num = 1;
			int j = 1;
			while(j<=2*i-1) {
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
		}
		i = n-1;
		while(i>=1) {
			int j = 1;
			while(j<=2*i-1) {
				System.out.print(j);
				j++;
			}
			i--;
			System.out.println();
		}
	}
}
