import java.util.Scanner;

public class ArrangeNumbersInArray {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
		}
	
	public static void arrange(int[] arr, int n) {
    	//Your code goes here
		int n1 = n/2;
        if(n%2==0){
            int val=1;
            for(int i=0; i<n1; i++){
                arr[i] = val;
                val += 2;
            }
            int end = 2;
            for(int i=n-1; i>=n1; i--){
                arr[i] = end;
                end += 2;
            }
        }
        else{

            int val=1;
            for(int i=0; i<=n1; i++){
                arr[i] = val;
                val += 2;
            }
            int end = 2;
            for(int i=n-1; i>n1; i--){
                arr[i] = end;
                end += 2;
            }

        }
      
         
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		arrange(arr,n);
		
	}

}
