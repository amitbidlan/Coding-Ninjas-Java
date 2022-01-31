import java.util.Scanner;
public class CheckPalindromApproach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		for(int i = 0;i<str.length()/2;) {
			for(int j = (str.length()-1)/2;j>0;) {
				if(str.charAt(i)!=str.charAt(j)) {
					System.out.println(false);
					return;
				}else {
					i++;
					j--;
					
				}
			}
		}
		
	}

}
