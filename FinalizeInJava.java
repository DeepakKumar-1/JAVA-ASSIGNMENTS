package ObjectOrientedProg;

public class FinalizeInJava {
    public static void main(String [] args){
        Student1 deepak = new Student1("Deepak");
        deepak.name = "Divyansh";
        System.out.println(deepak.name);

        Student1 obj;
        for(int i =0; i < 10000000; i++){
            obj = new Student1("Hey!!");
        }
    }
}

class Student1{
    String name;
    Student1(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(" Object is Destroyed");
        super.finalize();
    }
}
