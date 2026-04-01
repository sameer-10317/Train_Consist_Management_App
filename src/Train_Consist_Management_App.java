import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {
        List<GoodsBogie> list = new ArrayList<>();

        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Open", "Coal"));
        list.add(new GoodsBogie("Box", "Grain"));

        boolean safe = list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        if (safe) {
            System.out.println("Train is Safety Compliant");
        } else {
            System.out.println("Train is NOT Safety Compliant");
        }
    }
}