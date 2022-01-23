import java.util.Scanner;
public class TriangleofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(n>=i) {
			int spaces = 1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces++;
			}
			int num = 0;
			while(num<i) {
				System.out.print(i+num);
				num++;
			}
			int dec = 1;
			while(dec<i) {
				System.out.print(i+i-dec-1);
				//System.out.print(2*i-2*dec-1);
				dec++;
			}
			i++;
			System.out.println();
		}
	}

}
