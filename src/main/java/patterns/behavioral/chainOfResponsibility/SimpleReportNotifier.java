package patterns.behavioral.chainOfResponsibility;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String messenger) {
        System.out.println("Notifying using simple report: " + messenger);
    }
}
