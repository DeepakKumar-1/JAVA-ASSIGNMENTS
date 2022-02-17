package ObjectOrientedProg.EnumsInJAVA;

public class Basic {
    enum Week{
        monday, Tuesday, Wednesday, Thursday, Saturday, Sunday;
        // These are Enum Constants
        // public static and Final
        // Since it is final so You can't Create Child enums
        // type is week
        Week(){
            System.out.println("Constructor Called for " + this);
        }
        // This is not Public or Protected, so only Private or Default
        // Why ? We don't Want to Create New Objects
        // because this is not the Enum Concept that's Why

        // Internally: public static final Week Monday = new Week();
    }
    public static void main(String [] args){
        Week week;
        week = Week.monday;

        for(Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(week);
        System.out.println(week.ordinal());
    }
}
