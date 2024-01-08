package com.xworkz.boot;

import com.xworkz.comparator.Seeds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SeedRunner {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("water melon");
        list.add("papaya");
        list.add("orange");
        list.add("apple");
        list.add("ladies-finger");
        list.add("tulsi");
        list.add("tomato");
        list.add("lavender");
        list.add("lotus");
        list.add("ragi");

        Collections.sort(list);
        System.out.println("Ordering in Ascending");

        for(String ref: list){
            System.out.println(ref);
        }

        Comparator<String> comp=new Seeds();
        Collections.sort(list,comp);
        System.out.println("Ordering in Descending");

        for(String ref: list){
            System.out.println(ref);
        }

    }
}

