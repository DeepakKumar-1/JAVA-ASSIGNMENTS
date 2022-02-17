package MathsForDSA;
import java.util.Scanner;

public class SquareRootOfANumber2 {
    // Find Square Root of a Number Using Binary Search
    public static void main(String [] args){
        // Creating Scanner Object for taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Number as a Input from the USER
        System.out.print(" Enter Any Number: ");
        int num = sc.nextInt();
        int p = 3;
        // Display the Square Root of Number
//        System.out.println(" Square Root of " + num + " is: " + sqrt(num, p));
        System.out.format(" Square Root of %d is: %.3f ", num, sqrt(num, p));
    }
    // Time Complexity: O(log(n))
    static double sqrt(int num, int p){
        // Apply Simple Binary Search to Find the Square Root
        int start = 0;
        int end = num;
        double root = 0.0;

        while(start <= end){
            // Find Mid
            int mid = start + (end - start)/2;
            if(mid * mid == num)
                return mid;
            else if(mid * mid > num)
                end = mid - 1;
            else
                start = mid + 1;
        }

        double increment = 0.1;
        for(int i = 0; i < p; i++){
            while (root * root <= (double)(num)){
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}
