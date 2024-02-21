package runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FoodRunner {

    public static void main(String[] args) {

        String[] ingre1={"Rice","Salt","Turmeric Powder","Lemon"};
        String[] ingre2={"Lettuce", "Tomatoes", "Cucumbers", "Dressing"};
        String[] ingre3={"Dough", "Tomato Sauce", "Cheese", "Toppings"};
        String[] ingre4={"Pasta", "Tomato Sauce", "Parmesan Cheese"};

        Map<String, String[]> foodMap = new HashMap<>();
        foodMap.put("Lemon Rice",ingre1);
        foodMap.put("Salad",ingre2);
        foodMap.put("Pizza",ingre3);
        foodMap.put("Pasta",ingre4);

        Set<String> keys = foodMap.keySet();
        System.out.println("Values using Set:");
        keys.forEach(System.out::println);
        System.out.println("............................");


        Collection<String[]> values = foodMap.values();
        System.out.println("Values using Collection:");
        values.forEach(System.out::println);


    }
}
