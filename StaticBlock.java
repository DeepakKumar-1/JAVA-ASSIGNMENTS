package ObjectOrientedProg.StaticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // Will Run Only once, when the First Object is created i.e When the Class is loaded for the First Time
    static {
        System.out.println("I am in Static Block");
        b = a * 5;
    }

    public static void main(String [] args){
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
