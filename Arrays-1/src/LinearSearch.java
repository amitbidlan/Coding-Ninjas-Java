import java.util.Scanner;

public class LinearSearch {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
		}
	
	public static int linearSearch(int arr[], int x) {
        //Your code goes here
        int getIndex = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]==x){
                getIndex = i;
                
           }
        }
        return getIndex;
    }
	
	public static void match(int[] arr, int x) {
		if(arr.equals(x)==true) {
        	System.out.println("Yes it matches");
        }
    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = takeInput();
		int x = s.nextInt();
		int ans = linearSearch(arr,x);
		System.out.println(ans);
		match(arr,x);
	}

}
