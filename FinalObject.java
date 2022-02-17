package ObjectOrientedProg;

public class FinalObject {
    public static void main(String [] args){
        final Student deepak = new Student("Deepak");
        deepak.name = "Divyansh";
        System.out.println(deepak.name);

        // if a Non Primitive is final You Can't Reassign it
//        deepak = new Student("Deepak Kumar");  // ERROR !!

//        Student raj = new Study("Daily Study");  //  --> ERROR!
    }
}

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
}

//class Study{
//    String groupName;
//    Study(String groupName){
//        this.groupName = groupName;
//    }
//}