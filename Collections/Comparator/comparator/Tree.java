package com.xworkz.comparator;

import java.util.Comparator;

public class Tree  implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            int no=o2.compareTo(o1);
            return no;
        }
    }


