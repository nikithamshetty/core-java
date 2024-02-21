package dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Medicine implements Serializable {

    private String name;
    private int id;
    private String company;
    private LocalDate expiryDate;
    private LocalDate manfDate;
    private double cost;
    private String[] ingredients;



}
