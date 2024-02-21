package runner;

import dto.Wall;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WallRunner {

    public static void main(String[] args) {

        Map<Integer, String> wallMap = new HashMap<>();
        wallMap.put(10,"Blue");
        wallMap.put(8,"Red");
        wallMap.put(12,"Yellow");
        wallMap.put(13,"Purple");
        wallMap.put(11,"White");

        Set<Integer> keys = wallMap.keySet();
        System.out.println("Values using Set:");
        keys.forEach(System.out::println);
        System.out.println("........................");

        Collection<String> values = wallMap.values();
        System.out.println("Values using Collection:");
        values.forEach(System.out::println);
    }
}


