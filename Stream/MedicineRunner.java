package runner;

import dto.Medicine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MedicineRunner {

    public static void main(String[] args) {



        String[] ingredient={"Aspirin", "microcrystalline cellulose", "croscarmellose sodium", "Talc", "Silicon dioxide"};
        String[] ingredient1={"calcium stearate","magnesium stearate","cellulose", "docusate sodium"};
        String[] ingredient2={"hydroxyethylcellulose", "sodium hydroxide", "benzyl alcohol", "isopropyl alcohol"};
        String[] ingredient3={"gelatin", "magnesium stearate", "titanium dioxide","yellow iron oxide"};
        String[] ingredient4={"substituted benzimidazole", "5-methoxy"};
        String[] ingredient5={"povidone", "povidone", "pregelatinized starch", "magnesium stearate"};
        String[] ingredient6={"monofluorobenzenes","dihydroxy monocarboxylic acid"," pyrroles"};
        String[] ingredient7={"losartan"," potassium"};
        String[] ingredient8={"butylated hydroxyanisole", "lactose monohydrate", "magnesium stearate"};
        String[] ingredient9={"microcrystalline cellulose", "sodium starch glycolate", "colloidal anhydrous silica", "magnesium stearate"};
        String[] ingredient10={"propylene glycol", "sodium lauryl sulfate"};
        String[] ingredient11={"anise flavor", "artificial strawberry flavor", "glycerin", "hydrochloric acid", "purified water", "sodium hydroxide","xylitol"};
        String[] ingredient12={"dimethylaminomethyl","dimethylaminomethyl"};
        String[] ingredient13={"crospovidone", "hypromellose", "magnesium stearate", "polyethylene glycol"};
        String[] ingredient14={"quinolone antibiotic","fluoroquinolone antibiotic"};
        String[] ingredient15={"croscarmellose sodium", "dibasic calcium phosphate anhydrous", "hypromellose", "magnesium stearate"};
        String[] ingredient16={"colloidal silicon dioxide", "magnesium stearate", "microcrystalline cellulose"};
        String[] ingredient17={"anhydrous lactose", "colloidal silicon dioxide", "magnesium stearate","microcrystalline cellulose","sodium starch glycolate","talc"};
        String[] ingredient18={"docusate sodium", "lactose monohydrate", "magnesium stearate", "microcrystalline cellulose", "pregelatinized starch", "sodium benzoate"};
        String[] ingredient19={"calcium hydrogen phosphate","hyprolose","microcrystalline cellulose"};


        Medicine medicine=new Medicine("Aspirin",1,"Bayer", LocalDate.of(2026,1,1), LocalDate.of(2025,2,1), 89, ingredient);
        Medicine medicine1=new Medicine("Paracetamol", 2, "GlaxoSmithKline", LocalDate.of(2025,5,15), LocalDate.of(2024,6,26), 50,ingredient1);
        Medicine medicine2=new Medicine("Ibuprofen", 3, "Pfizer", LocalDate.of(2024,12,31), LocalDate.now(), 35,ingredient2);
        Medicine medicine3=new Medicine("Amoxicillin", 4, "Aurobindo Pharma", LocalDate.of(2023,6,30), LocalDate.of(2021,7,29), 120,ingredient3);
        Medicine medicine4=new Medicine("Omeprazole", 5, "Dr.Reddy's Laboratories",LocalDate.of(2023,9,30),LocalDate.of(2021,2,13), 159,ingredient4);
        Medicine medicine5=new Medicine("Metformin", 6, "Sun Pharmaceutical",LocalDate.of(2024,3,31),LocalDate.of(2020,9,23), 79,ingredient5);
        Medicine medicine6=new Medicine("Atorvastatin", 7, "Pfizer",LocalDate.of(2025,2,28), LocalDate.now(), 119,ingredient6);
        Medicine medicine7=new Medicine("Losartan", 8, "Torrent Pharmaceuticals", LocalDate.of(2024,11,30),LocalDate.of(2020,8,12), 109, ingredient7);
        Medicine medicine8=new Medicine("Simvastatin", 9, "Merck & Co.",LocalDate.of(2023,8,31), LocalDate.of(2021,12,29), 139,ingredient8);
        Medicine medicine9=new Medicine("Amlodipine", 10, "Pfizer",LocalDate.of(2024,5,31),LocalDate.of(2023,11,11), 99,ingredient9);
        Medicine medicine10=new Medicine("Metoprolol", 11, "AstraZeneca",LocalDate.of(2023,12,31),LocalDate.of(2022,1,20), 89,ingredient10);
        Medicine medicine11=new Medicine("Gabapentin", 12, "Pfizer",LocalDate.of(2024,6,30),LocalDate.of(2021,12,20), 199,ingredient11);
        Medicine medicine12=new Medicine("Tramadol", 13, "Johnson & Johnson",LocalDate.of(2025,1,31),LocalDate.of(2020,3,20), 149,ingredient12);
        Medicine medicine13=new Medicine("Ciprofloxacin", 14, "Bayer",LocalDate.of(2023,11,30),LocalDate.of(2019,11,20), 129,ingredient13);
        Medicine medicine14=new Medicine("Levofloxacin", 15, "Daiichi Sankyo",LocalDate.of(2024,9,30),LocalDate.of(2020,10,20), 159,ingredient14);
        Medicine medicine15=new Medicine("Azithromyci", 16, "Pfizer",LocalDate.of(2025,4,30),LocalDate.of(2021,6,20), 109,ingredient15);
        Medicine medicine16=new Medicine("Doxycycline", 17, "Pfizer",LocalDate.of(2023,10,31),LocalDate.of(2022,3,20), 99,ingredient16);
        Medicine medicine17=new Medicine("Prednisone", 18, "Pfizer",LocalDate.of(2024,2,29),LocalDate.of(2023,1,20), 85,ingredient17);
        Medicine medicine18=new Medicine("Alprazolam", 19, "Pfizer",LocalDate.of(2023,7,31),LocalDate.of(2020,8,20), 199,ingredient18);
        Medicine medicine19=new Medicine("Sertraline", 20, "Pfizer",LocalDate.of(2024,8,31),LocalDate.of(2021,10,20), 139,ingredient19);

        List<Medicine> list=new ArrayList<>();
        list.add(medicine);
        list.add(medicine1);
        list.add(medicine2);
        list.add(medicine3);
        list.add(medicine4);
        list.add(medicine5);
        list.add(medicine6);
        list.add(medicine7);
        list.add(medicine8);
        list.add(medicine9);
        list.add(medicine10);
        list.add(medicine11);
        list.add(medicine12);
        list.add(medicine13);
        list.add(medicine14);
        list.add(medicine15);
        list.add(medicine16);
        list.add(medicine17);
        list.add(medicine18);
        list.add(medicine19);

        list.stream()
                .sorted((a1,a2)->a1.getCompany().compareTo(a2.getCompany()))
                .forEach(l-> System.out.println(l));
        System.out.println(".....................................");

        list.stream()
                .sorted((a1,a2)->a2.getExpiryDate().compareTo(a1.getExpiryDate()))
                .forEach(l-> System.out.println(l));
        System.out.println("........................");

        list.stream()
                .sorted((a1,a2)->Double.compare(a1.getCost(),a2.getCost()))
                .forEach(l-> System.out.println(l));
        System.out.println("............................");

        List<String[]> filteredIngredient = list.stream()
                .map(Medicine::getIngredients)
                .filter(ingredients1 -> ingredients1.length > 4)
                .collect(Collectors.toList());
        filteredIngredient.forEach(ingredientsArray -> System.out.println(Arrays.toString(ingredientsArray)));
        System.out.println("..............................");

        System.out.println("Fetching only ingredients");
        list.stream()
                .map(Medicine::getIngredients)
                .forEach(i -> System.out.println(Arrays.toString(i)));
        System.out.println("...............................");

        list.stream()
                .sorted((a1,a2)->a2.getCompany().compareTo(a1.getCompany()))
                .forEach(l-> System.out.println(l.getCompany().toUpperCase()));
        System.out.println("............................................................");

        list.stream()
                .sorted((a1,a2)->a2.getName().compareTo(a1.getName()))
                .forEach(l-> System.out.println(l));
        System.out.println("......................");

        System.out.println("manufactured date less than 30 days");
        List<Medicine> gettingMedicines = list.stream()
                .filter(m -> m.getManfDate().isAfter(LocalDate.now().minusDays(30)))
                .collect(Collectors.toList());
        gettingMedicines.forEach(l-> System.out.println(l));
        System.out.println(".....................");


        System.out.println("manufactured date More than 30 days");
        List<Medicine> oldMedicines = list.stream()
                .filter(m -> m.getManfDate().isBefore(LocalDate.now().minusDays(30)))
                .collect(Collectors.toList());
        oldMedicines.forEach(l-> System.out.println(l));
        System.out.println("....................");

        System.out.println("expiry date within 30 days");
        List<Medicine> expiryMedicines = list.stream()
                .filter(m -> m.getExpiryDate().isBefore(LocalDate.now().minusDays(30)))
                .collect(Collectors.toList());
        expiryMedicines.forEach(l-> System.out.println(l));

    }
    }

