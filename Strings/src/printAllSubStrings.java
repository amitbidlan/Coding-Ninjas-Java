
public class printAllSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		int n = str.length();
		for(int i = 0;i<n;++i) {
			for(int j = i;j<n;++j) {
                for(int k = i;k<=j;++k){
                    System.out.print(str.charAt(k));
                }
			System.out.println();   
            }
			}
		
		
	}

}
