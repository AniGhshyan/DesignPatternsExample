package patterns.structural.composite;

import java.util.ArrayList;

public class Team {

    private ArrayList<Developer> developers = new ArrayList<>();


    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project...\n");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
