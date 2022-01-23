import java.util.Scanner;
public class ZerosAndStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=2*n+1) {
				if(i==j || j == n + 1 || j == 2*n-i+2) {
					System.out.print("*");
				}
				else {
					System.out.print(0);
				}
				
				j++;
			}
			i++;
			System.out.println();
		}
		
		
		
		
		}

}
