package ObjectOrientedProg.Polymorphism;

public class MethodOverloading {
    public static void main(String [] args){
        Numbers num = new Numbers();
        System.out.println(num.sum(4,6));
        System.out.println(num.sum(4,6, 18));
        System.out.println(num.sum("Deepak ", "Kumar"));
    }
}

class Numbers{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    String sum(String a, String b){
        return a+b;
    }
}
