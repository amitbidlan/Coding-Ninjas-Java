import java.util.Scanner;
public class AssignmentFindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();

		if(x>=0 || x<= 8) {

			if((n>=0 || n<= 9)) {

				if(x==0 && n==0) {
					System.out.println("1");
				}else {


					int ans = (int)(Math.pow(x, n));
					System.out.println(ans);
				}

			}
		}
	}
}