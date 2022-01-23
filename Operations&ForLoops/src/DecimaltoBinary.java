import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        List<Long> myArrayList = new ArrayList<Long>(); 
        
        if(n<=0) {
        	System.out.print(n);
        }
        
        else {
        
        while(n>0) {
        	long remainder = n%2;
        	myArrayList.add(remainder);
        	//System.out.println(myArrayList);
        	n = n/2;
        }
        for(int i = myArrayList.size();i>=1;i--) {
        	System.out.print(myArrayList.get(i-1));
        }

	}

}
}