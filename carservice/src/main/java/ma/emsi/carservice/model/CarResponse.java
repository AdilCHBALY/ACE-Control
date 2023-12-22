package ma.emsi.carservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.carservice.beans.Client;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private String matricue;
    private Client client;
}
