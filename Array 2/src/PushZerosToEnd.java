
public class PushZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,0,0,1,3,0,0};
		int n = arr.length;
		int tracknum = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
                arr[i] = arr[tracknum];
                arr[tracknum] = temp;
                tracknum++;
			}
		}
		
}}

