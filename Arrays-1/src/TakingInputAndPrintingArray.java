import java.util.Scanner;
public class TakingInputAndPrintingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.print("Enter element at " + i +": ");
			arr[i] = s.nextInt();
		}
		for(int i = 0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
