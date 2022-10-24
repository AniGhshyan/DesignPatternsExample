package patterns.behavioral.state;

public class Sleeping implements Activity{
    @Override
    public void justDuIt() {
        System.out.println("Sleeping...");
    }
}
