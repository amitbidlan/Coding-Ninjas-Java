
public class mergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,4,6,10,13};
		int arr2[]= {2,5,7,9};
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		int arr3[] = new int[n1+n2];
		int i = 0;
		int j=0;
		int k = 0;
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
	}

}


//--in if else loops

//
//int arr1[] = {1,4,6,10,13};
//	int arr2[]= {2,5,7,9};
//	
//	int n1 = arr1.length;
//	int n2 = arr2.length;
//	int arr3[] = new int[n1+n2];
//	for(int i =0;i<n1;) {
//		for(int j = 0;i<n2-1;) {
//			for(int k = 0;i<n1+n2;) {
//				if(arr1[i]<arr2[j]) {
//					arr3[k]=arr1[i];
//            i++;
//            k++;
//				}
//				if(arr1[i]>arr2[j]) {
//					arr3[k]=arr2[j];
//            j++;
//            k++;
//				}
//         if(j==n2){
//            for(int l = k;l<n1+n2;l++){
//               arr3[k]=arr1[i];
//               k++;
//               i++;
//            }
//         }
//			}
//		}
//	}