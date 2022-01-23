
import java.util.Scanner;
public class AssignmentProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(0);
	
		//System.out.println(ch);
		
		if(Character.isUpperCase(ch)) {
			System.out.println("1");
		}
		else if(Character.isLowerCase(ch)) {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
	}

}
