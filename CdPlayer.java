package ObjectOrientedProg.Interfaces;

public class CdPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }
}
