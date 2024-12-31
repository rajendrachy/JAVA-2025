// sum of all the odd no. from 1 to n

import java.util.*;

public class odd {
    

    public static int oddNum(int n) {
      int sum = 0;
        for(int i=1; i<=n; i++) {
         if(i % 2 != 0) {
            sum += i;
         }
        }

        return sum;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // taking input n;

        int result = oddNum(n);
        System.out.println(result);
    }
}


