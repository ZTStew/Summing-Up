/*
 * Prompts the user for a 3 digit number and then returns the sum of all the components
 * if the user enters more values than requested, only the values to the hundereds place will be counted
 * example: 784 = 19
 * example: 2343784 = 19
 *
 * @author Stewart
 * @version JAVA 8, 6/27/2019
 */

import java.lang.Math;
import java.util.Scanner;

public class summingUp{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /// prompts user for the value they would like summed
        System.out.print("Enter a 3 digit number: ");
        int val = scan.nextInt();

        int mult = 10;
        int sum = 0;
        int stopper = 0;

        /// while the value entered by the user is not '0' or the 'stopper' 
        // (controles the itterations of the while loop) is bellow 3 cycles.
        while(val > 0 && stopper < 3){
            /// adds to the sum the value of each issolated digit
            sum += val % mult / (mult/10);
            /// removes the previous value added from the value given by the user
            val -= val % mult;
            /// increases the size of the multiplier
            mult *= 10;
            /// increaments the cycles of the while loop
            stopper++;
        }
        /// returns the value of sum
        System.out.println(sum);
        scan.close();
    }
}

