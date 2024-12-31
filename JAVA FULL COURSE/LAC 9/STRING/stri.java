// import java.util.*;

// public class stri {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine(); // input // nextLine -> full sentence take
//         System.out.println(name);
//     }
// }



// --------------Concatination-------------
import java.util.*;

public class stri {
    public static void main(String args[]) {
       String fName = "Rajendra";
       String Lname = "Chaudhary";
       // String fullName = fName + " " + Lname; // or, 
       String fullName = fName.concat(Lname);
       System.out.println(fullName);
       System.out.println(fullName.length());



       // ----------charAt------------------

       for(int i=0; i<fullName.length(); i++) {
        System.out.println(fullName.charAt(i));

       }

    }
}



