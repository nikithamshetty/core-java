package runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TvRunner {

    public static void main(String[] args) {

        Map<Integer, String> tvMap = new HashMap<>();
        tvMap.put(819,"Sony");
        tvMap.put(887,"Samsung");
        tvMap.put(909,"Mi");
        tvMap.put(220,"Panasonic");
        tvMap.put(765,"LG");

        Set<Integer> keys = tvMap.keySet();
        System.out.println("Values using Set:");
        keys.forEach(System.out::println);
        System.out.println("..............................");

        Collection<String> values = tvMap.values();
        System.out.println("Values using Collection:");
        values.forEach(System.out::println);

    }
}
