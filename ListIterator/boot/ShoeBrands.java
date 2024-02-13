package boot;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShoeBrands {

    public static void main(String[] args) {

        List<String> addShoeBrands=new ArrayList<>();
        addShoeBrands.add("Nike");
        addShoeBrands.add("Red Tape");
        addShoeBrands.add("Asian");
        addShoeBrands.add("Puma");
        addShoeBrands.add("Adidas");
        addShoeBrands.add("Reebok");
        addShoeBrands.add("New Balance");
        addShoeBrands.add("Under Armour");
        addShoeBrands.add("Vans");
        addShoeBrands.add("Skechers");

        ListIterator<String> listIterator= addShoeBrands.listIterator();

        System.out.println("After adding the shoe brand");
        while (listIterator.hasNext()){
            String forward=listIterator.next();
            if("Puma".equals(forward)){
                listIterator.add("ASICS");
            }
        }
        addShoeBrands.forEach(s -> System.out.println(s));
    }
}
