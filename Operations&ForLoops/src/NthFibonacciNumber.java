import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class NthFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp1 = 0;
		int temp2 = 0;
		List myArrayList = new ArrayList(); 
		myArrayList.add(1);
		myArrayList.add(1);
		myArrayList.add(2);
		for(int i = 3;i<n+1;i++) {
			System.out.println(myArrayList);
			int  a = (int) myArrayList.get(i-1)+(int) myArrayList.get(i-2) ;
			myArrayList.add(a);

		}
		System.out.println(myArrayList.get(n-1));
	}

}
