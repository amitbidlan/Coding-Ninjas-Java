import java.util.Scanner;

public class TermsofApAssignment {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for(int i = 1;i<=1000;i++) {
        	int a = 3*i+2;
            if(a%4 != 0) {
                System.out.print(a + " ");
                count++;
                
            }
            if(count==n) {
            	return;
            }
        }
        
    }

}
