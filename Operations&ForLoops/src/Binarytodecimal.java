import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int temp = 0;
		while(n>0) {

			int remainder = n % 10;
			//System.out.println(remainder);
			temp = (int) (temp + remainder * Math.pow(2, i));
			n = n / 10;
			i++;
		}
		System.out.println(temp);
	}

}
