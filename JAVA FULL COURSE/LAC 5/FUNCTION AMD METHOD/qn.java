// Enter 3 number from the user and make a function to print there average

import java.util.*;

public class qn {
   
     public static int Average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
         
     }
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();


       int result = Average(a, b, c);
       System.out.println(result);
    }
}


