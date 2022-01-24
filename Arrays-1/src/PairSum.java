
public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 13;
		int count =0;
		int arr[] = {5,5,4,4,5,4};
		int n = arr.length;
		for(int i = 0;i<=n;i++) {
			for(int j = i+1;j<=n-2;j++) {
				if(i==j) {
					j=+1;
					continue;
				}
				
					
					
					if(arr[i]+arr[j]+arr[j+1]==x) {
						count++;
						
					}
				}
			}
		System.out.println(count);
		}
		
	}


