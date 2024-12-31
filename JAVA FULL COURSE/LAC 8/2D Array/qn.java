// Take a matrix as input from a user. Search for a given 
// no. x and print indices at which it occurs.

import java.util.*;

public record qn() {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int nums[][] = new int[rows][cols];

        // ----input a Matrix------
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                nums[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (nums[i][j] == target) {
                    System.out.println("X found at location (" + i + ", " + j + ")");
                }
            }
        }

    }
}


