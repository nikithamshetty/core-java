package com.xworkz.collections.call;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class BiscuitBrand {


    public Collection<String> getBrand() {

        Collection<String> brand = new ArrayList<>();
        brand.add("Parle");
        brand.add("Britannia");
        brand.add("Sunfeast");
        brand.add("Unibic");
        brand.add("Patanjali");
        brand.add("Cadbery");
        brand.add("Monaco");
        brand.add("Dark fantasy");
        System.out.println(brand.size());
        Iterator<String> itr = brand.iterator();
        while (itr.hasNext()) {
            String cal = itr.next();
            System.out.println("Biscuits are available in many brands" + cal);
        }

        brand.remove("Cadbery");
        System.out.println("After removing cadbery the remaining biscuits are" + brand.size());
        boolean Cadbery = Collections.addAll(brand, "Cadbery");


        System.out.println("Using addAll" + Cadbery);
        System.out.println(brand);
        System.out.println("After using the addAll the size is " + brand.size());
        System.out.println("Now using containsAll" + brand.containsAll(brand));

        Object[] obj1 = brand.toArray();
        System.out.println("Now using toArray()");


        for (Object obj : obj1) {
            System.out.println(obj);
        }

        System.out.println(".............................");
        Object[] obj2 = new Object[brand.size()];
        obj2 = brand.toArray(obj2);
        System.out.println("Now using toArray(A[])");
        for (Object obje : obj2) {
            System.out.println(obje);
        }

        System.out.println("Now is contains" + brand.contains("Goodday"));
        System.out.println("Now is equal" + brand.equals("Parle"));
        System.out.println(brand.removeAll(brand));
        System.out.println("After removing all" + brand);
        System.out.println("retaining all" + brand.retainAll(brand));
        brand.clear();
        System.out.println("is empty" + brand.isEmpty());

        return brand;
    }
}



