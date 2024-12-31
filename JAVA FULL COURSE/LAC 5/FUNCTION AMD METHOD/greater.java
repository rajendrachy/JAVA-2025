// Take two number and return greater number

import java.util.*;

public class greater {
    

    public static int greater(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = greater(a, b);
        System.out.println(res);
    }
}




