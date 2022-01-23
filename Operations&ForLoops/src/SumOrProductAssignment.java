import java.util.Scanner;
public class SumOrProductAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = s.nextInt();
		
		if(c==1) {
			int temp = 0;
			for(int i =1;i<=n;i++) {
				temp=temp+i;
			}
			System.out.println(temp);
		}
		else if(c==2) {
			int temp = 1;
			for(int i =1;i<=n;i++) {
				temp=temp*i;
			}
			System.out.println(temp);
		}
		else {
			System.out.println(-1);
		}
	}

}
