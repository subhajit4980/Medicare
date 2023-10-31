package com.subhajit.Medicare.Models;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "Order")
public class Order {
    @Id
    private String medicineId;
    @NotBlank
    private String medicineName;
    @NotBlank
    private String address;
    @NotBlank
    private  int pinNumber;
    @NotBlank
    private int mobileNumber;
    @NotBlank
    private double price;
    @NotBlank
    private String imageUrl;
}
