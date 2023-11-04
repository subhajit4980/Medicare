package com.subhajit.Medicare.Payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CartRequest {
    private String medicineId;
    private String username;
    private  String medicineName;
    private int NoOfQuantityToBuy;
}
