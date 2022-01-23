import java.util.Scanner;

public class OddSquareAttempt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num = 1;
		int i = 1;
		while(i<=n) {
			int j = 1;
			num = 2*i-1;
			while(j<=n) {
				System.out.print(num);
				num = num + 2;
				if(num>2*n-1) {
					num = 1;
				}
				j++;
			}
			i++;
			System.out.println();
		}
	}
}



















//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int num = 1;
//		int i = 1;
//		while(i<=n) {
//			int j = 1;
//			num =2*i-1;
//			while(j<=n) {
//				System.out.print(num);
//				num +=2;
//                if(num>n*2-1){
//                    num=1;
//                }
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
//	}
//}
//





