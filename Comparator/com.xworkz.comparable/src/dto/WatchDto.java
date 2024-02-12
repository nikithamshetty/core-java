package dto;



import lombok.*;

import java.io.Serializable;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class WatchDto implements Serializable, Comparable<WatchDto> {

    private double price;
    private String brand;
    private String model;
    private String material;


    @Override
    public int compareTo(WatchDto watchDto) {
        return Double.compare(this.getPrice(),watchDto.getPrice());
    }
}

