//import java.util.Scanner;

//AllPrimeNumberTry2 {

import java.util.Scanner;
public class AllPrimeNumberTry2  {

	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        for(int d=2;d<=n;d++)
        {
            
        
              int count=0;
              for(int i=2;i<=d;i++)
              {
                  if(d%i==0)
                  count++;
                
            
             }
            if(count==1)
             System.out.println(d);
       
        
		
        }

		
	}
}

