// Program to check a no. is 10, 20, 30, 40, 50 or none of it using ternary

package DayThree;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.: ");
        int num = sc.nextInt();

        // Taking a string to Print result
        String result = (num==10 || num==20 || num==30 || num == 40 || num == 50 )? "yes" : "none of these";

        System.out.println(result);
        
        sc.close();

    }
    
}
