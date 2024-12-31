// Void -> No return Type

import java.util.*;

public class fun {

    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    printName(name); // call
    }
}

