
// public class str {
//     public static void main(String args[]) {
//         StringBuilder sb = new StringBuilder("Rajendra");
//         System.out.println(sb); // Rajendra


//         // char at index 0
//         System.out.println(sb.charAt(0)); // R

//         // set char at index
//         sb.setCharAt(0, 'A');
//         System.out.println(sb); // Aajendra
//     }
// }




// ---------------Insert-----------------------

// public class str {
//     public static void main(String args[]) {
//         StringBuilder sb = new StringBuilder("Rajendra");
//         System.out.println(sb); // Rajendra


//         sb.insert(0, 'C'); // => (Index, character)
//         System.out.println(sb);


//    // delete------
//    sb.delete(0,1); // Ending index is not include
//    System.out.println(sb);

//     }
// }



// -------------Append-------------------

public class str {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Rajendra");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

    }
}



