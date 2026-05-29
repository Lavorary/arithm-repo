package school.hei.arithm.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalculationDTO {
    private double a;
    private double b;
    private String operation;
    private double result;

    public void CalculationResult(double a, double b, String operation, double result) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        this.result = result;
    }
}