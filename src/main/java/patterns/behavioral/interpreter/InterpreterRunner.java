package patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {

        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = gatJavaEEExpression();
        System.out.println("Does developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEDeveloper.interpret("Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("javaCore");
        return new OrExpression(java, javaCore);
    }

    public static Expression gatJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java, spring);
    }
}
