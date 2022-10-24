package patterns.behavioral.chainOfResponsibility;

public class EmailNotifier extends Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String messenger) {
        System.out.println("Send email: " + messenger);
    }
}
