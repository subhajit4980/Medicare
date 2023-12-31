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
    private String orderId;
    @NotBlank
    private String medicineName;
    @NotBlank
    private  int orderQuantity;
    @NotBlank
    private String username;
    @NotBlank
    private String email;
    @NotBlank
    private String address;
    @NotBlank
    private  String pinNumber;
    @NotBlank
    private String mobileNumber;
    @NotBlank
    private boolean status;
    @NotBlank
    private  String orderedDate;
    @NotBlank
    private  String expectedDeliveryDate;
    @NotBlank
    private double price;
    @NotBlank
    private String imageUrl;

    public Order(String medicineName,int orderQuantity, String username, String email, String address, String pinNumber, String mobileNumber, boolean status, String orderedDate, String expectedDeliveryDate, double price, String imageUrl) {
        this.medicineName = medicineName;
        this.orderQuantity=orderQuantity;
        this.username = username;
        this.email = email;
        this.address = address;
        this.pinNumber = pinNumber;
        this.mobileNumber = mobileNumber;
        this.status = status;
        this.orderedDate = orderedDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.price = price;
        this.imageUrl = imageUrl;
    }
}

