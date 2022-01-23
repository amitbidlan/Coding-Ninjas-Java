import java.util.Scanner;
public class FindingLargestElement {
	
	public static int[] getInput() {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
		
	}
	public  static int findLargest(int arr[]) {
		int largest = 0;
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			if(largest<arr[i]) {
				largest = arr[i];
				
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = getInput();
		int lar = findLargest(arr);
		System.out.println(lar);
	}

}
