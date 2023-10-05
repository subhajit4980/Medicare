package com.subhajit.Medicare.Models;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
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

    public Medicine(String name, String description, double price, int quantityInStock, String manufacturer, String expiryDate, List<String> activeIngredients, String usageInstructions, String imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.activeIngredients = activeIngredients;
        this.usageInstructions = usageInstructions;
        this.imageUrl = imageUrl;
    }

    public Medicine( String name, double price, int quantityInStock, String expiryDate) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.expiryDate = expiryDate;
    }
}
