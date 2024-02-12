package dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class DiseaseDto implements Serializable,Comparable<DiseaseDto> {

    private String diseaseName;
    private String symptoms;
    private String treatment;
    private String severityLevel;

    @Override
    public int compareTo(DiseaseDto o) {
        return this.getDiseaseName().compareTo(o.getDiseaseName());
    }


    }

