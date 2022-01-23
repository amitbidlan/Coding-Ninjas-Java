import java.util.Scanner;
public class IntroToPatttern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(n>=i) {
			int j = 0;
			while(n>j) {
				char toPrint = (char)('A'+j);
				System.out.print(toPrint);	
				j++;
				
			}
			i++;
			System.out.println();
		}
	}

}
