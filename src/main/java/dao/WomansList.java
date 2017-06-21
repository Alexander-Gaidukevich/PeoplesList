package dao;

import bean.Woman;

import java.util.ArrayList;
import java.util.List;

public class WomansList {
    private static List<Woman> List = new ArrayList<Woman>();

    static {
        List.add(new Woman("Alisa", "Sov", 555444, 20));
        List.add(new Woman("Anna", "Lenina", 111222, 25));
        List.add(new Woman("Vera", "Oktyabya", 222111, 60));
        List.add(new Woman("Diana", "Rechicki", 333222, 50));
        List.add(new Woman("Ekaterina", "Ukrainskaya", 222333, 20));
        List.add(new Woman("Elena", "Pushkina", 444555, 80));
        List.add(new Woman("Inna", "Soligorskaya", 555666, 85));
        List.add(new Woman("Kristina", "Lermontova", 650777, 90));
        List.add(new Woman("Marina", "Sevastopalskaya", 777888, 15));
        List.add(new Woman("Nina", "Pionerskaya", 888999, 55));
        List.add(new Woman("Natasha", "Centralnaya", 999888, 50));
    }

    public static List<Woman> getList() {
        return List;
    }
}