public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,24,20,21,15,10,6};
		int n = arr.length;
		for(int i =0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				int temp = arr[j];
				if(arr[j]<arr[i]) {
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		int x = 15;
		int start = 0;
		int end = n;
		int mid = (start+end)/2;
		while(start <= end) {
			if(x>arr[mid]) {
				start = mid;
			}
			if(x<arr[mid]) {
				end = mid;
			}
         if(x==arr[mid]){
            System.out.println(arr[mid]);
            System.out.println(mid);
            break;
         }
         
		}
		
		
	}

}