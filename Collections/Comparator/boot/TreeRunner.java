package com.xworkz.boot;

import com.xworkz.comparator.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreeRunner {


        public static void main(String[] args) {

            List<Integer> list=new ArrayList<>();
            list.add(345);
            list.add(600);
            list.add(230);
            list.add(100);
            list.add(300);
            list.add(290);
            list.add(560);
            list.add(900);
            list.add(756);
            list.add(784);

            Collections.sort(list);
            System.out.println("Ordering in Ascending");

            for(Integer ref: list){
                System.out.println(ref);
            }

            Comparator<Integer> comparator=new Tree();
            Collections.sort(list,comparator);
            System.out.println("Descending order");
            for(Integer ref: list){
                System.out.println(ref);
            }

        }
    }

