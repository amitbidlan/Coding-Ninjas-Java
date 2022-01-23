import java.util.Scanner;
public class IsocelesTraingle {

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
			int chr = 1;
			while(chr<=i) {
				System.out.print(chr);
				chr++;
			}
			int dec = 1;
			while(dec<i) {
				System.out.print(i-dec);
				dec++;
			}
			i++;
			System.out.println();
		}
	}

}
