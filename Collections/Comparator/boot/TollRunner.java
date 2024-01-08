package com.xworkz.boot;

import com.xworkz.comparator.Toll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TollRunner {

    public static void main(String[] args) {


        List<Double> list=new ArrayList<>();
        list.add(250d);
        list.add(654d);
        list.add(745d);
        list.add(456d);
        list.add(290d);
        list.add(876d);
        list.add(118d);
        list.add(120d);
        list.add(660d);
        list.add(450d);

        Collections.sort(list);
        System.out.println("Ordering in Ascending");

        for(Double ref: list){
            System.out.println(ref);
        }

        Comparator<Double> comp=new Toll();
        Collections.sort(list,comp);
        System.out.println("Ordering in Descending");

        for(Double ref: list){
            System.out.println(ref);
        }
    }
}
