package ObjectOrientedProg;

public class WrapperClassExample {
    public static void main(String [] args){
        // Try to Swap Two Variables Using Swap Function
        int a = 10;
        int b = 20;
        swap(a, b);
        // It will not Swap Because there is no Such Concept of Pass by Value in JAVA
        System.out.println(a + " " + b);

        // As we Know in case of Objects changes made by the Reference Variable Effects the Original Variables
        // Now Try to Swap Objects  ( Wrapper Class Integer )
        Integer a1 = 10;
        Integer b1 = 20;
        swapWrapper(a, b);
        // Now Here in this Case it will Not Swap Because Integer is a final Class
        System.out.println(a1+ " " + b1);
    }

    static void swapWrapper(Integer a, Integer b){
        Integer temp = a;
        b = a;
        a = temp;
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
