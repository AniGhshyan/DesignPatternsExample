package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFlyweight {

    public static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String speciality) {
        Developer developer = developers.get(speciality);
        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring Java developer");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring c++ developer");
                    developer=new CppDeveloper();
                    break;
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
