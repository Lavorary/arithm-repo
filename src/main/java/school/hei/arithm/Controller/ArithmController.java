package school.hei.arithm.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import school.hei.arithm.DTO.CalculationDTO;
import school.hei.arithm.exception.DivisionByZeroException;

@RestController
@RequestMapping("/api/arithm")
public class ArithmController {
    @GetMapping("/add")
    public CalculationDTO add(@RequestParam int a, @RequestParam int b) {
        double result = a + b;
        return new CalculationDTO(a, b, "/", result);
    }

    @GetMapping("/substract")
    public CalculationDTO substract(@RequestParam int a, @RequestParam int b) {
        double result = a - b;
        return new CalculationDTO(a, b, "/", result);
    }


    @GetMapping("/multiply")
    public CalculationDTO multiply(@RequestParam int a, @RequestParam int b) {
        double result = a * b;
        return new CalculationDTO(a, b, "/", result);
    }

    @GetMapping("/divide")
    public CalculationDTO divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        double result = a / b;
        return new CalculationDTO(a, b, "/", result);
    }
}
