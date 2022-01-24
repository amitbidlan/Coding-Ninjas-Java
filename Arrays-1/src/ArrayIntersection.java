
public class ArrayIntersection {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr1[] = {2,6,1,2};
        int arr2 [] = {1,2,3,4,2};
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        int num = 0;
        
        for(int i = 0;i<=n1-1;i++) {
          int count = 0;
            for(int j =0;j<=n2-1;j++) {
                if(arr1[i]==arr2[j]) {
                    if(arr1[i]==arr2[j]) {
                        count++;
                        break;
                    }
                    
                }
            }
            if(count==1) {
                   num =arr1[i];
                   System.out.print(num + " ");
               }
        }
        
    }

}