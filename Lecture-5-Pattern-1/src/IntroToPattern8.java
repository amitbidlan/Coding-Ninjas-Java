import java.util.Scanner;

public class IntroToPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print(i-j+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}


//1
//21
//321
//4321
// n i j print
// 5 1 1 1
// 5 2 2
//Hint always write n j i and desired result (print) sidewise and then 
//try to find a relationship between them.