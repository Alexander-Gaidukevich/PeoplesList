package dao;

import bean.Man;

import java.util.ArrayList;
import java.util.List;

public class MansList {
    private static List<Man> List = new ArrayList<Man>();

    static {
        List.add(new Man("Alexander", "Sov", 555444, 20));
        List.add(new Man("Andrei", "Lenina", 111222, 25));
        List.add(new Man("Vadim", "Oktyabya", 222111, 60));
        List.add(new Man("Denis", "Rechicki", 333222, 50));
        List.add(new Man("Grigoriy", "Ukrainskaya", 222333, 20));
        List.add(new Man("Ivan", "Pushkina", 444555, 80));
        List.add(new Man("Igor", "Soligorskaya", 555666, 85));
        List.add(new Man("Kirill", "Lermontova", 650777, 90));
        List.add(new Man("Leonid", "Sevastopalskaya", 777888, 15));
        List.add(new Man("Oleg", "Pionerskaya", 888999, 55));
        List.add(new Man("Yura", "Centralnaya", 999888, 50));
    }

    public static List<Man> getList() {
        return List;
    }
}