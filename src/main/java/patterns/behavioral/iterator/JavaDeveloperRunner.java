package patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgresSQL"};
        Developer developer = new Developer("Poxos Poxosyan", skills);
        Iterator iterator = developer.getIterator();
        System.out.println("Developer: " + developer.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString()+" ");
        }

    }
}
