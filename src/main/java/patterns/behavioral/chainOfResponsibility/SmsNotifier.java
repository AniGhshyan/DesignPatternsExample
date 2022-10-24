package patterns.behavioral.chainOfResponsibility;

public class SmsNotifier extends Notifier {

    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String messenger) {
        System.out.println("Sending SMS to manager: " + messenger);
    }
}
