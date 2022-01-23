import java.util.Scanner;
public class FahrenheittoCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		
		while(S<E) {
			
			if(S>=0 || S<=80) {
				if(S<=E || E<=900) {
					if(W>=0 || W<=40) {
						
						int C = (S-32)*5/9;
						System.out.println(C +  " " + S);
						S = S + W;
						
						
					}
				}
			}
		
		
		}
		
		
		
	}

	
	

}

//0 <= S <= 80
//S <= E <=  900
//0 <= W <= 40 

	