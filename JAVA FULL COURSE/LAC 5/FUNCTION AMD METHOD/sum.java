
import java.util.*;

public class sum {


    public static int sumOf(int a, int b) {
        int re = a + b;
        return re;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        int result = sumOf(a, b);
        System.out.println(result);
    }
}




