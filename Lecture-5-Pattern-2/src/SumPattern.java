import java.util.Scanner;

//import java.util.Scanner;

public class SumPattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n) {
          int temp = 0;
            int printInteger = 1;
            while(printInteger <= i) {
                System.out.print(printInteger);
                temp = temp + printInteger;
                printInteger++;
                if (printInteger > i) {
                    System.out.print("=");
                    System.out.print(temp);
                }else {
                    System.out.print("+");
                } 
            }
            i++;
            System.out.println();
            
        }

    }

}