package com.subhajit.Medicare.Payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductRequest {
    private String medicineId;
    private String name;
    private double price;
    private double discountedPrice;
    private int quantityInStock;
    private String expiryDate;
}
