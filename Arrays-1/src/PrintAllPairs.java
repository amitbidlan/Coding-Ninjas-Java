import java.util.Scanner;

public class PrintAllPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner s = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			for(int j = i+1;j<=n-1;j++) {
				System.out.println(arr[i] + " " + arr[j]);
			}
		}
	}

}
