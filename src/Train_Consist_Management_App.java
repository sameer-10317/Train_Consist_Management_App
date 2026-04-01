import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {
        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 54));
        list.add(new Bogie("First Class", 24));

        List<Bogie> filtered = list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        for (Bogie b : filtered) {
            System.out.println(b.name + " : " + b.capacity);
        }
    }
}