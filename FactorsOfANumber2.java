package MathsForDSA;

public class FactorsOfANumber2 {
    // Find All the factors of a Number
    public static void main(String [] args){
        int num = 40;
        factors(num);
    }
    // Time Complexity O(sqrt(N))
    static void factors(int num){
        for(int i=1; i<= Math.sqrt(num); i++){
            if(num % i == 0) {
                if(num/ i == i)
                    System.out.print(i + " ");
                else
                    System.out.print(i + " " + num/i + " ");
            }
        }
    }
}
