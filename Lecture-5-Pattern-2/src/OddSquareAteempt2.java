import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddSquareAteempt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List myArrayList = new ArrayList(); 
		int i = 1;
		int num = 1;
		while(i<=n) {
			myArrayList.add(num);
			num = num + 2;
			i++;
		}
		//Iteration should be done on n to n-1
		i = 1;
		while(i<=n) {
			int j = 0;
			while(j<n) {
				if(j==1) {
					System.out.println(i);
				}
				
			}
			i++;
			System.out.println();
		}
	}

}


