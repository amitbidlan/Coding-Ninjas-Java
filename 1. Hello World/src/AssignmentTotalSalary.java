import java.util.Scanner;
//import java.text.DecimalFormat;
public class AssignmentTotalSalary {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		String grade = s.next();
		
		if(basic>=0 || basic <=7500000 ) {
		
		
		
	    float hra = (float)basic * 1/5;
	    
	    float da    = (float)basic * 1/2;
	    
	    float pf = (float)basic * 11/100;
	    
	    float allow;
	    
	    if (grade.matches("A")) {
	    	allow = 1700;
	    }
	    
	    else if(grade.matches("B")) {
	    	allow = 1500;
	    }
	    else {
	    	allow = 1300;
	    }
	   float totalSalary = basic + hra + da + (allow - pf);
	   int roundOff = Math.round(totalSalary);
	   
	   System.out.println(roundOff);
	    
	    
	}
	

}
}