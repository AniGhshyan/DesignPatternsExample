package singleReasonPrinciple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    public void save(String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)) {
            out.println(toString());
        }
    }
}

class Persistence {
    public void saveToFile(Journal journal, String fileName, boolean overWrite) throws FileNotFoundException {
        if (overWrite || new File(fileName).exists()) {
            try (PrintStream out = new PrintStream(fileName)) {
                out.println(toString());
            }
        }
    }
}

class Demo {
    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);
        Persistence p=new Persistence();
        String fileName="C://Desktop/dev";
        p.saveToFile(j,fileName,true);
        Runtime.getRuntime().exec("notepad.exe"+fileName);
    }
}
