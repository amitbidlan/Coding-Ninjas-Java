
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int d = 2;
		int n = arr.length;
		int narr[]=new int[d];
		for(int i =0;i<n/2;i++) {
			int temp =0;
			temp = arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1] = temp;
			
		}
		
		n = n -d;
		for(int i =0;i<n/2;i++) {
			int temp =0;
			temp = arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1] = temp;
			
		}
		
		
	}

}
