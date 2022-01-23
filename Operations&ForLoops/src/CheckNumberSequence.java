import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isDec = false;
		int isdec = 0;
		boolean isInc = false;
		int isinc = 0;
		List<Integer> myArrayList = new ArrayList<Integer>(); 
		for(int i = 1;i<=n;i++) {
			int inputi = (int) s.nextInt();
			myArrayList.add(inputi);
			
		}
		
		for(int i = 1;i<=n-2;i++) {
			
				int c = myArrayList.get(i);
				int p = myArrayList.get(i-1);
				if(c>p) {
					isInc = true;
					int c1 = myArrayList.get(i);
					int f1 = myArrayList.get(i+1);{
						if(f1<c1) {
							isDec=true;
							isdec++;
						}
					}
					
					}
				if(c<p) {
					isDec = true;
					int c1 = myArrayList.get(i);
					int f1 = myArrayList.get(i+1);{
						if(f1>c1) {
							isInc=true;
							isinc++;
						}
					}				
			}
		}
		
		
		
		
		
		
	}}
	

