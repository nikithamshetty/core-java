package boot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ShoeBrandRunner {

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

        System.out.println("Forward direction:");
        ListIterator<String> forwardIterator = addShoeBrands.listIterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        System.out.println("Backward direction:");
        ListIterator<String> backwardIterator = addShoeBrands.listIterator(addShoeBrands.size());
        while (backwardIterator.hasPrevious()) {
            System.out.println(backwardIterator.previous());
        }

        System.out.println("Forward direction using index:");
        ListIterator<String> forwardIndexIterator = addShoeBrands.listIterator();
        while (forwardIndexIterator.hasNext()) {
            int index = forwardIndexIterator.nextIndex();
            System.out.println("Index " + index + ": " + forwardIndexIterator.next());
        }

        System.out.println("Backward direction using index:");
        ListIterator<String> backwardIndexIterator = addShoeBrands.listIterator(addShoeBrands.size());
        while (backwardIndexIterator.hasPrevious()) {
            int index = backwardIndexIterator.previousIndex();
            System.out.println("Index " + index + ": " + backwardIndexIterator.previous());
        }

        System.out.println("Remove element while looping:");
        ListIterator<String> removeIterator = addShoeBrands.listIterator();
        while (removeIterator.hasNext()) {
            String brand = removeIterator.next();
            if (brand.equals("Vans")) {
                removeIterator.remove();
            }
        }
        System.out.println("Shoe brands after removing 'Vans': " + addShoeBrands);

        System.out.println("Add element while looping:");
        ListIterator<String> addIterator = addShoeBrands.listIterator();
        while (addIterator.hasNext()) {
            String brand = addIterator.next();
            if (brand.equals("Reebok")) {
                addIterator.add("Jordan");
            }
        }
        System.out.println("Shoe brands after adding 'Jordan' next to 'Reebok': " + addShoeBrands);

        System.out.println("Sort in descending order using forEach:");
        addShoeBrands.sort(Comparator.reverseOrder());
        addShoeBrands.forEach(System.out::println);
    }
}

