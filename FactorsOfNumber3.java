package MathsForDSA;
import java.util.ArrayList;

public class FactorsOfNumber3 {
    // Find All the factors of a Number
    public static void main(String [] args){
        int num = 40;
        factors(num);
    }
    // Both Time Complexity and Space Complexity is O(sqrt(N))
    static void factors(int num){
        ArrayList <Integer> list = new ArrayList<>();

        for(int i=1; i<= Math.sqrt(num); i++){
            if(num % i == 0) {
                if(num/i == i)
                    System.out.print(i + " ");
                else {
                    System.out.print(i + " ");
                    list.add(num/i);
                }
            }
        }

        // Now Print the List Elements in the Reverse Order
        for(int i= list.size() - 1; i >= 0; i--)
            System.out.print(list.get(i) + " ");
    }
}
