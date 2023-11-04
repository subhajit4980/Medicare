package com.subhajit.Medicare.controllers.API.Order;

import com.subhajit.Medicare.Models.Cart;
import com.subhajit.Medicare.Models.Medicine;
import com.subhajit.Medicare.Models.Order;
import com.subhajit.Medicare.Models.User;
import com.subhajit.Medicare.Payload.request.CartRequest;
import com.subhajit.Medicare.Payload.request.OrderRequest;
//import com.subhajit.Medicare.Repository.CartRepository;
import com.subhajit.Medicare.Repository.CartRepository;
import com.subhajit.Medicare.Repository.MedicineRepository;
import com.subhajit.Medicare.Repository.OrderRepository;
import com.subhajit.Medicare.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderProduct {
    @Autowired
    MedicineRepository medicineRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CartRepository cartRepository;
    @PostMapping("/addCart")
    public ResponseEntity<?> addCart(@Valid @RequestBody CartRequest cartRequest)
    {
        Medicine medicine_obj = medicineRepository.findByMedicineId(cartRequest.getMedicineId()).orElseThrow(() -> new UsernameNotFoundException("Medicine Not Found with Id: " + cartRequest.getMedicineName()));
//        Cart cart= new Cart(medicine_obj.getName(),cartRequest.getMedicineName(),cartRequest.getUsername(),cartRequest.getNoOfQuantityToBuy());
//        cartRepository.save(cart);
        return ResponseEntity.ok("product added to cart successfully");
    }
//    @GetMapping("/cart")
//    public List<Cart> getCart(@Valid @RequestParam("username") String username)
//    {
////        List<Cart> cart = (List<Cart>) cartRepository.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("not found"));
//        return cart;
//    }
//    buy product
    @PostMapping("/buy")
    public ResponseEntity<?> updateMedicineAfterBuy(@Valid @RequestBody OrderRequest orderRequest) {
        Medicine medicine_obj = medicineRepository.findByMedicineId(orderRequest.getMedicineId()).orElseThrow(() -> new UsernameNotFoundException("Medicine Not Found with name: " + orderRequest.getMedicineName()));
        if (medicine_obj.getQuantityInStock() == 0) {
            return ResponseEntity.badRequest().body("Medicine out of stock");
        }
        if (userRepository.existsByUsername(orderRequest.getUsername())) {
            Order order = new Order(orderRequest.getMedicineId(),orderRequest.getMedicineName(),orderRequest.getNoOfQuantityToBuy(), orderRequest.getUsername(),
                    orderRequest.getEmail(), orderRequest.getAddress(), orderRequest.getPinNumber(),
                    orderRequest.getMobileNumber(), false, LocalDate.now().toString(), LocalDate.now().plusDays(4).toString(),
                    medicine_obj.getPrice() * orderRequest.getNoOfQuantityToBuy(), medicine_obj.getImageUrl());
            // Update the medicine object with the new quantity
            medicine_obj.setQuantityInStock(medicine_obj.getQuantityInStock() - orderRequest.getNoOfQuantityToBuy());
            // Save the updated medicine object
            medicineRepository.save(medicine_obj);
            orderRepository.save(order);
            return ResponseEntity.ok("Medicine ordered successfully");
        }
        return ResponseEntity.badRequest().body("Something went wrong");
    }
}
