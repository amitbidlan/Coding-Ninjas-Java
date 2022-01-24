
public class SwapAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int a = 0;
		int b = 0;
		int arr[] = new int[n];
		for(int i = 0;i<=n-2;i++) {
			a = arr[i];
			b = arr[i+1];
			arr[i]=b;
			arr[i+1] = a;
		}
	}

}
