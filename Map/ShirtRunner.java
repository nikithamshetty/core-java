package runner;

import dto.Shirt;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShirtRunner {

    public static void main(String[] args) {

        Map<String,Integer> shirtMap=new HashMap<>();
        shirtMap.put("Nike",999);
        shirtMap.put("Zara",599);
        shirtMap.put("Zudio",399);
        shirtMap.put("H&M",699);
        shirtMap.put("Forever21",1299);

        Set<String> keys = shirtMap.keySet();
        System.out.println("Values using Set:");
       keys.forEach(System.out::println);

        System.out.println("..............................");

        Collection<Integer> values = shirtMap.values();
        System.out.println("Values using Collection:");
        values.forEach(System.out::println);
    }
}
