import java.util.Scanner;
public class AssignmentTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 1;
		
		while(i<11) {
			System.out.println(num * i);
			i++;
		}

	}

}
