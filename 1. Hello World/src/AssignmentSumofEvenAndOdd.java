import java.util.Scanner;
public class AssignmentSumofEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 10;
        int j= 1;
        int rem ;
        int quo ;
        int even = 0;
        int odd=0;
        while(num>0) {
            rem = num%i;
            quo = num/i;
            if(rem%2==0) {
                even = even + rem;
            }
            else {
                odd = odd + rem;
            }
            j++;
            num = quo;
            
		}
        System.out.println(even +" "+ odd);


	}
}
