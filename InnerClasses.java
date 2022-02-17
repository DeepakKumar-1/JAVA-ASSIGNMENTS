package ObjectOrientedProg.StaticExample;

public class InnerClasses {
    static class TestClass {
        String name;
        TestClass(String name){
            this.name = name;
        }
    }

    public static void main(String [] args){
        TestClass a = new TestClass("Deepak");
        TestClass b = new TestClass("Deepak");
    }
}
