package school.hei.arithm.tests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import school.hei.arithm.Controller.ArithmController;
import school.hei.arithm.DTO.CalculationDTO;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ArithmControllerTest {

    @Autowired
    private ArithmController arithmController;

    @Test
    public void add_should_return_correct_sum() {
        CalculationDTO result = arithmController.add(5, 3);
        assertThat(result.getResult()).isEqualTo(8);
        assertThat(result.getOperation()).isEqualTo("+");
    }

    @Test
    public void subtract_should_return_correct_difference() {
        CalculationDTO result = arithmController.substract(10, 2);
        assertThat(result.getResult()).isEqualTo(8);
        assertThat(result.getOperation()).isEqualTo("-");
    }

    @Test
    public void multiply_should_return_correct_product() {
        CalculationDTO result = arithmController.multiply(2, 7);
        assertThat(result.getResult()).isEqualTo(14);
        assertThat(result.getOperation()).isEqualTo("*");
    }

    @Test
    public void divide_should_return_correct_product() {
        CalculationDTO result = arithmController.divide(10, 5);
        assertThat(result.getResult()).isEqualTo(2);
        assertThat(result.getOperation()).isEqualTo("/");
    }
}