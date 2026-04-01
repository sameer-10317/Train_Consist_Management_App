import java.util.*;

public class Train_Consist_Management_App {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        train.add(2, "Pantry");

        train.removeFirst();
        train.removeLast();

        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}