import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = 0;
		int i = 1;
		int num = n;
		int check = n;
		while (n != 0) {
		      n /= 10;
		      ++i;
		    }
		
		
		while(num>0) {
			int remainder = num%10;
			temp = (int) (temp + Math.pow(remainder, i-1));
			num = num/10;
		}

		if(temp==check) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
