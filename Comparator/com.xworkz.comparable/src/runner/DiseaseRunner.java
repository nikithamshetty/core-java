package runner;

import dto.DiseaseDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseRunner {

    public static void main(String[] args) {

        DiseaseDto diseaseDto=new DiseaseDto("Flu","High fever","Antiviral medications","Low");
        DiseaseDto diseaseDto1=new DiseaseDto("Hypertension","Headaches","medication","High");
        DiseaseDto diseaseDto2=new DiseaseDto("Diabetes Mellitus","Excessive thirst","Insulin therapy","Low");
        DiseaseDto diseaseDto3=new DiseaseDto("Asthma","Wheezing","Inhalers","High");
        DiseaseDto diseaseDto4=new DiseaseDto("Arthritis","Joint pain","Medications","Low");

        List<DiseaseDto> list=new ArrayList<>();
        list.add(diseaseDto);
        list.add(diseaseDto1);
        list.add(diseaseDto2);
        list.add(diseaseDto3);
        list.add(diseaseDto4);


        Collections.sort(list);
        list.forEach(l-> System.out.println(l));
        System.out.println("..........................................");

        System.out.println("Ascending by Disease name");
        Collections.sort(list,(p1,p2)->p1.getDiseaseName().compareTo(p2.getDiseaseName()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Descending by Disease name");
        Collections.sort(list,(p1,p2)->p2.getDiseaseName().compareTo(p1.getDiseaseName()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by Symptoms");
        Collections.sort(list,(p1,p2)->p1.getSymptoms().compareTo(p2.getSymptoms()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Descending by Symptoms");
        Collections.sort(list,(p1,p2)->p2.getSymptoms().compareTo(p1.getSymptoms()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Ascending by treatment");
        Collections.sort(list,(p1,p2)->p1.getTreatment().compareTo(p2.getTreatment()));
        list.forEach(l-> System.out.println(l));

        System.out.println("Descending by treatment");
        Collections.sort(list,(p1,p2)->p2.getTreatment().compareTo(p1.getTreatment()));
        list.forEach(l-> System.out.println(l));




    }
}
