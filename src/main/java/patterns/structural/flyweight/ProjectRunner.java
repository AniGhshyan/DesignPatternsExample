package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFlyweight developerFlyweight = new DeveloperFlyweight();

        List<Developer> developers = new ArrayList<>();
        developers.add(developerFlyweight.getDeveloperBySpecialty("java"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("java"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("java"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("java"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("java"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("java"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperBySpecialty("c++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
