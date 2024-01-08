package com.xworkz.boot;

import com.xworkz.comparator.Ocean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OceanRunner {

        public static void main(String[] args) {

            List<String> list=new ArrayList<>();
            list.add("Indian Ocean");
            list.add("Pacific Ocean");
            list.add("Atlantic Ocean");
            list.add("Arctic Ocean");
            list.add("Antartic Ocean");
            list.add("Southern Ocean");

            Collections.sort(list);
            System.out.println("Ordering in Ascending");

            for(String ref:list){
                System.out.println(ref);
            }

            Comparator<String> comparator=new Ocean();
            Collections.sort(list,comparator);
            System.out.println("Ordering in Descending");

            for(String ref:list){
                System.out.println(ref);
            }
        }
    }

