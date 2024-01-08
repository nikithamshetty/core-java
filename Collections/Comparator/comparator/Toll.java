package com.xworkz.comparator;

import java.util.Comparator;

public class Toll implements Comparator<Double> {



    @Override
    public int compare(Double o1, Double o2) {
        int no=o2.compareTo(o1);
        return 0;
    }
}
