package dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PointRequest {
    @NotNull(message = "X не может быть null")
    @DecimalMin(value = "-5.0", message = "X должен быть >= -5")
    @DecimalMax(value = "3.0", message = "X должен быть <= 3")
    private Double x;

    @NotNull(message = "Y не может быть null")
    @DecimalMin(value = "-3.0", message = "Y должен быть >= -3")
    @DecimalMax(value = "5.0", message = "Y должен быть <= 5")
    private Double y;

    @NotNull(message = "R не может быть null")
    @DecimalMin(value = "0.0", inclusive = false, message = "R должен быть > 0")
    @DecimalMax(value = "3.0", message = "R должен быть <= 3")
    private Double r;
}
