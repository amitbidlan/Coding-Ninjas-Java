
public class FindUnique {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {5,3,1,5,1,3,4,7,4,8,8};
        int n = arr.length;
        int num = 0;
        for(int i =0;i<=n-1;i++) {
           int count = 0;
            for(int j=0;j<=n-1;j++) {
                if(i==j) {
                    continue;
                }
                
                if(arr[i]==arr[j]) {
                    count++;
                    break;
                }
                
            }
           if(count==0) {
               num =arr[i];
               
           }
            
        }
    }

}