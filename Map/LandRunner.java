package runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LandRunner {

    public static void main(String[] args) {

        Map<String, String> landMap = new HashMap<>();
        landMap.put("Puneeth","Bommanhalli");
        landMap.put("Meena","Whitefield");
        landMap.put("Sumit","Kengeri");
        landMap.put("Anusha","BTM");
        landMap.put("Naveen","Rajajjinagar");

        Set<String> keys = landMap.keySet();
        System.out.println("Values using Set:");
        keys.forEach(System.out::println);
        System.out.println("..............................");

        Collection<String> values = landMap.values();
        System.out.println("Values using Collection:");
        values.forEach(System.out::println);

    }
}
