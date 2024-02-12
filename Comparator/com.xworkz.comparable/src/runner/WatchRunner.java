package runner;

import dto.WatchDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchRunner {

    public static void main(String[] args) {

        WatchDto watchDto=new WatchDto(150000,"Rolex Submariner","Submariner","Stainless steel");
        WatchDto watchDto1=new WatchDto(12000,"Apple Watch","Series 7","Aluminum");
        WatchDto watchDto2=new WatchDto(13000,"Seiko","5 Sports","Stainless steel");
        WatchDto watchDto3=new WatchDto(10000,"Casio","G-Shock","Resin case");
        WatchDto watchDto4=new WatchDto(15000,"Omega","Speedmaster Professional Moonwatch","Hesalite crystal");

        List<WatchDto> list=new ArrayList<>();
        list.add(watchDto);
        list.add(watchDto1);
        list.add(watchDto2);
        list.add(watchDto3);
        list.add(watchDto4);

        Collections.sort(list);
        list.forEach(l-> System.out.println(l));
        System.out.println(".....................................");

        System.out.println("Ascending by brand");
        Collections.sort(list,(p1,p2)->p1.getBrand().compareTo(p2.getBrand()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Descending by brand");
        Collections.sort(list,(p1,p2)->p2.getBrand().compareTo(p1.getBrand()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by model");
        Collections.sort(list,(p1,p2)->p1.getModel().compareTo(p2.getModel()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Descending by model");
        Collections.sort(list,(p1,p2)->p2.getModel().compareTo(p1.getModel()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by material");
        Collections.sort(list,(p1,p2)->p1.getMaterial().compareTo(p2.getMaterial()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Descending by material");
        Collections.sort(list,(p1,p2)->p2.getMaterial().compareTo(p1.getMaterial()));
        list.forEach(l-> System.out.println(l));



    }
}
