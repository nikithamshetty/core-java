package dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class PlayGroundDto implements Serializable,Comparable<PlayGroundDto> {

    private String name;
    private String location;
    private int noOfGates;
    private double areaInMeters;

    @Override
    public int compareTo(PlayGroundDto o) {
        return this.getLocation().compareTo(o.getLocation());
    }
}
