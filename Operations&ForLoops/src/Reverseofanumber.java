import java.util.Scanner;

public class Reverseofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        if(n<=0) {
        	System.out.println(n);
        }
        
        else {
        while(n%10 == 0) {
        	n = n/10;
        }
        
        while(n>0) {
        	
        	int remainder = n % 10;
        	
        		System.out.print(remainder);
        		
        	
        	n = n / 10;
        }
	}
	}
}
