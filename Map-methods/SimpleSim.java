package dto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleSim {
    public static void main(String[] args) {

        Map<String,String> simMap=new HashMap<>();
        simMap.put("Suresh","Jio");
        simMap.put("Namitha","Airtel");
        simMap.put("Mohan","Reliance");
        simMap.put("Bhumika","Jio");
        simMap.put("Nirvan","BSNL");
        simMap.put("Suraj","Airtel");

        System.out.println("Size of the map: " + simMap.size());

        System.out.println("Is the map empty? " + simMap.isEmpty());

        System.out.println("Contains key 'Suresh'? " + simMap.containsKey("Suresh"));

        System.out.println("Contains value 'Airtel'? " + simMap.containsValue("Airtel"));

        System.out.println("Value associated with key 'Mohan': " + simMap.get("Mohan"));

        System.out.println("Remove entry with key 'Bhumika': " + simMap.remove("Bhumika"));

        Map<String,String> addSimMap=new HashMap<>();
        addSimMap.put("Neelam","Reliance");
        addSimMap.put("Uday","BSNL");
        simMap.putAll(addSimMap);
        System.out.println("After adding additional values" +simMap);

        Set<String> setKeys = simMap.keySet();
        System.out.println("All the keys from the Map: " + setKeys);

        Collection<String> values = simMap.values();
        System.out.println("All values from the Map: " + values);

        Set<Map.Entry<String,String>> entryHere=simMap.entrySet();
        System.out.println("Applying EntrySet");
        for(Map.Entry<String,String> entry:entryHere){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println("Owner Name:" + key + "Sim Name:" + value);

//            simMap.clear();
//            System.out.println("Map after applying Clear: " + simMap);
        }


    }
}

