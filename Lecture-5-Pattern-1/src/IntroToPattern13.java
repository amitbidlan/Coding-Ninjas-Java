import java.util.Scanner;

public class IntroToPattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(n>=i) {
			int j = 1;
			while(j<=i) {
				char toPrint = (char)('A'+ n-i+j-1);
				System.out.print(toPrint);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}


//
//E
//DE
//CDE
//BCDE
//ABCDE