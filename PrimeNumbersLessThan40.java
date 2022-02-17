package MathsForDSA;

public class PrimeNumbersLessThan40 {
    // Print Prime Numbers Less than 40
    public static void main(String [] args){
        int num = 40;
        for(int i = 2; i<= num ; i++){
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    static boolean isPrime(int num){
        if(num <= 0)
            return false;
        for(int i = 2; i * i<= num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
