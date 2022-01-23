
//HalfDiamondPatternTry2 

import java.util.Scanner;
public class HalfDiamondPatternTry2   {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        if(i==1) {
        	System.out.print("*");
        	System.out.println();
        	System.out.print("*");
        }
        
        while(i<=n) {
            int num = i;
            int j = 1;
            while(j<=2*i-1) {
                //System.out.print(j);
                if(j>i) {
                    num = num-1;
                    System.out.print(num);
                    //
                }else {
                    System.out.print(j);
                }
                
                j++;
            }
            i++;
            System.out.print("*");
            System.out.println();
            System.out.print("*");
        }
        i = n-1;
        while(i>=1) {
        	int num = i;
            int j = 1;
            while(j<=2*i-1) {
                //System.out.print(j);
            	if(j>i) {
                    num = num-1;
                    System.out.print(num);
                    //
                }else {
                    System.out.print(j);
                }
                j++;
            }
            i--;
            System.out.print("*");
            System.out.println();
            System.out.print("*");
        }
    }
}