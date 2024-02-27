package runner;

import dto.PalaceDto;
import dto.StatesAndCapitalDto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PalaceStatesRunner {
    public static void main(String[] args) {

        PalaceDto palaceDto1 = new PalaceDto("Mysore Palace", "Mysore", 1897);
        PalaceDto palaceDto2 = new PalaceDto("Bangalore Palace", "Bangalore", 1887);
        PalaceDto palaceDto3 = new PalaceDto("Chatrapati Shahu Palace", "Kolhapur", 1877);
        PalaceDto palaceDto4 = new PalaceDto("Ahmedgunj Palace", "Murud", 1885);
        PalaceDto palaceDto5 = new PalaceDto("Daulatabad Palace", "Daulatabad", 1187);

        StatesAndCapitalDto statesAndCapitalDto1 = new StatesAndCapitalDto("Maharashtra", "Mumbai", 400001);
        StatesAndCapitalDto statesAndCapitalDto2 = new StatesAndCapitalDto("Uttar Pradesh", " Lucknow", 226001);
        StatesAndCapitalDto statesAndCapitalDto3 = new StatesAndCapitalDto("Karnataka", " Bangalore", 560001);
        StatesAndCapitalDto statesAndCapitalDto4 = new StatesAndCapitalDto("Tamil Nadu", "Chennai", 600001);
        StatesAndCapitalDto statesAndCapitalDto5 = new StatesAndCapitalDto("Gujarat", "Mumbai", 400001);


        Map<PalaceDto, StatesAndCapitalDto> palaceDtoStatesAndCapitalDtoMap = new HashMap<>();
        palaceDtoStatesAndCapitalDtoMap.put(palaceDto1, statesAndCapitalDto1);
        palaceDtoStatesAndCapitalDtoMap.put(palaceDto2, statesAndCapitalDto2);
        palaceDtoStatesAndCapitalDtoMap.put(palaceDto3, statesAndCapitalDto3);
        palaceDtoStatesAndCapitalDtoMap.put(palaceDto4, statesAndCapitalDto4);
        palaceDtoStatesAndCapitalDtoMap.put(palaceDto5, statesAndCapitalDto5);

        System.out.println("Size of the map: " + palaceDtoStatesAndCapitalDtoMap.size());
        System.out.println("Is the map empty? " + palaceDtoStatesAndCapitalDtoMap.isEmpty());

        Map<PalaceDto, StatesAndCapitalDto> palaceDtoStatesAndCapitalDtoMap1 = new HashMap<>();
        palaceDtoStatesAndCapitalDtoMap1.putAll(palaceDtoStatesAndCapitalDtoMap);

        PalaceDto palaceRemove = palaceDto3;
        StatesAndCapitalDto removedStates = palaceDtoStatesAndCapitalDtoMap.remove(palaceRemove);
        System.out.println("Here removed Palace is:" + palaceRemove + "removed states and capital is:" + removedStates);

        StatesAndCapitalDto statesAndCapital = statesAndCapitalDto1;
        System.out.println("Does this" + statesAndCapital + " is existing in the Map: " + palaceDtoStatesAndCapitalDtoMap.containsKey(statesAndCapital));

        Set<PalaceDto> keys = palaceDtoStatesAndCapitalDtoMap.keySet();
        System.out.println("All Keys:");
        for (PalaceDto key : keys) {
            System.out.println(key);

            Collection<StatesAndCapitalDto> values = palaceDtoStatesAndCapitalDtoMap.values();
            System.out.println("All Values:");
            for (StatesAndCapitalDto value : values) {
                System.out.println(value);

                System.out.println("using equals method " + palaceDtoStatesAndCapitalDtoMap1.equals(palaceDtoStatesAndCapitalDtoMap));

                System.out.println("Hash code of the Map " + palaceDtoStatesAndCapitalDtoMap.hashCode());

                //palaceDtoStatesAndCapitalDtoMap.clear();

            }
        }
    }
}
