package dto;

import lombok.*;

import java.util.Objects;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class StatesAndCapitalDto {

    private String state;
    private String capital;
    private int pincode;

    @Override
    public boolean equals(Object o) {
        System.out.println("Running Equals");
        if (this == o) return true;
        if (!(o instanceof StatesAndCapitalDto)) return false;
        StatesAndCapitalDto that = (StatesAndCapitalDto) o;
        return getState().equals(that.getState());
    }

    @Override
    public int hashCode() {
        System.out.println("Running HashCode");
        return Objects.hash(getState());
    }

}
