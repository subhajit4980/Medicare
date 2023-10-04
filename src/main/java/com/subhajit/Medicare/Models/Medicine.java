package com.subhajit.Medicare.Models;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@Document(collection = "Medicine")
public class Medicine {
    @Id
    private String medicineId;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private double price;
    @NotBlank
    private int quantityInStock;
    @NotBlank
    private String manufacturer;
    @NotBlank
    private String expiryDate;
    private List<String> activeIngredients;
    @NotBlank
    private String usageInstructions;
    @NotBlank
    private String imageUrl;

}
