package IMPORTANAT;

public class KadanesAlgorithm {
    // Kadane's Algorithm : Use to Find Maximum Sum SubArray
    public static int kadanesAlgo(int [] arr){
        // take Two Variables
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(maxSum < currSum){
                maxSum = currSum;
            }
            if(currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }

    public static void main(String [] args){
        int [] arr = {-1, -2, 3, 4, 6};
        // Display Maximum Sum
        System.out.println(kadanesAlgo(arr));
    }
}
