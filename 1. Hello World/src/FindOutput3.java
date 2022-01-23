
public class FindOutput3 {
	public static void main(String[] args) {
		int a = 50, b= 20;
		if(a>b) {
			if (a>100) {
				System.out.println("Ace");
			}
			
			if(b<100) {
				b = 50;
				System.out.println(b);
			}
		}
			
		else if(a==b) {
				System.out.println("king");
			}
			
		else {
				System.out.println("Queen");
			}
		}
	}

