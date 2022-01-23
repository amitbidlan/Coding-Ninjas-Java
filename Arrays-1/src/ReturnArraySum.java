import java.util.Scanner;

public class ReturnArraySum {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
