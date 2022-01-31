import java.util.Scanner;
public class CheckPalindromeSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count = 0;
		for(int j=0;j<str.length()-1;j++) {
		for(int i =str.length()-1;i>0;i--) {
			if(str.charAt(j)==str.charAt(i)) {
				count++;
			}
				
		}
		
		
		
	}
		if(str.length()==count) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

}}
