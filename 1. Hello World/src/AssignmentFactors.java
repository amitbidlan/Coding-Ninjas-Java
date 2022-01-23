import java.util.Scanner;
public class AssignmentFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i =2;

		while(num/2>=i) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
			i++;

		}
	}

}
