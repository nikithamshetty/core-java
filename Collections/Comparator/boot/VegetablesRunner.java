package com.xworkz.boot;

import com.xworkz.comparator.Vegetables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VegetablesRunner {

        public static void main(String[] args) {

            List<String> list=new ArrayList<>();
            list.add("Onion");
            list.add("Tomato");
            list.add("Potato");
            list.add("Ginger");
            list.add("Garlic");
            list.add("Beetroot");
            list.add("Carrot");
            list.add("Brinjal");
            list.add("Lemon");
            list.add("Cabbage");

            Collections.sort(list);
            System.out.println("Ordering in Ascending");

            for(String ref:list){
                System.out.println(ref);
            }

            Comparator<String> comparator=new Vegetables();
            Collections.sort(list,comparator);
            System.out.println("Ordering in Descending");
            for(String ref:list){
                System.out.println(ref);
            }
        }
    }


