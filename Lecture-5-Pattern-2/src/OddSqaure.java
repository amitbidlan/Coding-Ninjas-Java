import java.util.Scanner;
public class OddSqaure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int num = 1;
		while(i <=n) {
			int toPrint = 1;
			
			while(toPrint <= n) {
				
				System.out.print(num);
				toPrint++;
				num = num + 2;
			}
			i++;
			System.out.println();
		}
	}

}
