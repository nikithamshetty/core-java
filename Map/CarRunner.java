package runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarRunner {

    public static void main(String[] args) {

        Map<Integer, String> carMap = new HashMap<>();
        carMap.put(2011,"Verna");
        carMap.put(2012,"Ertiga");
        carMap.put(2013,"Breeze");
        carMap.put(2014,"Polo");
        carMap.put(2015,"Innova");

        Set<Integer> keys = carMap.keySet();
        System.out.println("Values using Set:");
        keys.forEach(System.out::println);
        System.out.println("........................");


        Collection<String> values = carMap.values();
        System.out.println("Values using Collection:");
        values.forEach(System.out::println);

    }
}
