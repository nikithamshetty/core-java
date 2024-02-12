package runner;

import dto.PlayGroundDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGroundRunner {

    public static void main(String[] args) {

        PlayGroundDto playGroundDto0 = new PlayGroundDto("Gandhi Park", "Shivamogga", 2, 30);
        PlayGroundDto playGroundDto1 = new PlayGroundDto("BTM Park", "BTM", 1, 20);
        PlayGroundDto playGroundDto2 = new PlayGroundDto("Ranthambore National Park", "Sawai Madhopur", 3, 40);
        PlayGroundDto playGroundDto3 = new PlayGroundDto("Kanha National Park", "Mandla", 4, 45);
        PlayGroundDto playGroundDto4 = new PlayGroundDto("Jim Corbett National Park", "Ramnagar", 6, 50);


        List<PlayGroundDto> list = new ArrayList<>();
        list.add(playGroundDto0);
        list.add(playGroundDto1);
        list.add(playGroundDto2);
        list.add(playGroundDto3);
        list.add(playGroundDto4);

        Collections.sort(list);
        list.forEach(l -> System.out.println(l));
        System.out.println("....................................");

        System.out.println("Ascending by location");
        Collections.sort(list, (p1, p2) -> p1.getLocation().compareTo(p2.getLocation()));
        list.forEach(l -> System.out.println(l));

        System.out.println("Descending by location");
        Collections.sort(list, (p1, p2) -> p2.getLocation().compareTo(p1.getLocation()));
        list.forEach(l -> System.out.println(l));

        System.out.println("Ascending by name");
        Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        list.forEach(l -> System.out.println(l));

        System.out.println("Descending by name");
        Collections.sort(list, (p1, p2) -> p2.getName().compareTo(p1.getName()));
        list.forEach(l -> System.out.println(l));

    }
}
