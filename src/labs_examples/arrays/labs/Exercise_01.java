package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        for(int i = 1; i <11; i++){
            System.out.print("Enter number " + i + ": ");
            // assign input to variable as int
            int number = scanner.nextInt();
            numbers[i - 1] = number;
        }

        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        float average = (float) sum / numbers.length;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
    }

}