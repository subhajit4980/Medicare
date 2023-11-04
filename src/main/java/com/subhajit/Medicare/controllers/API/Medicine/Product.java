package com.subhajit.Medicare.controllers.API.Medicine;

import com.subhajit.Medicare.Models.Medicine;
import com.subhajit.Medicare.Payload.request.ProductRequest;
import com.subhajit.Medicare.Payload.response.MessageResponse;
import com.subhajit.Medicare.Repository.MedicineRepository;
import com.subhajit.Medicare.Repository.OrderRepository;
import com.subhajit.Medicare.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicine")
public class Product {
    @Autowired
    MedicineRepository medicineRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    OrderRepository orderRepository;

    //add medicine to the database
    @PostMapping("/create")
    public ResponseEntity<?> addMedicine(@Valid @RequestBody com.subhajit.Medicare.Models.Medicine medicine) {
        if (medicineRepository.existsByName(medicine.getName())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Medicine already added!"));
        }
        com.subhajit.Medicare.Models.Medicine medicine_obj = new com.subhajit.Medicare.Models.Medicine(medicine.getName(), medicine.getDescription(), medicine.getPrice(), medicine.getDiscountedPrice(), medicine.getQuantityInStock(), medicine.getManufacturer(), medicine.getExpiryDate(), medicine.getActiveIngredients(), medicine.getUsageInstructions(), medicine.getImageUrl(), medicine.getBuyer(), medicine.getRating());
        medicine_obj.setExpiryDate(medicine.getExpiryDate());
        medicine_obj.setQuantityInStock(medicine.getQuantityInStock());
        medicine_obj.setBuyer(0);
        medicine_obj.setRating(0.0);
        medicineRepository.save(medicine_obj);
        return ResponseEntity.ok(new MessageResponse("Medicine  added successfully"));
    }

    //update medicine data in database
    @PostMapping("/update")
    public ResponseEntity<?> updateMedicine(@Valid @RequestBody ProductRequest medicine) {
        if (medicineRepository.existsByName(medicine.getName())) {
            com.subhajit.Medicare.Models.Medicine medicine_obj = medicineRepository.findByName(medicine.getName()).orElseThrow(() -> new UsernameNotFoundException("Medicine Not Found with name: " + medicine.getName()));
            if (medicine.getQuantityInStock() >= 0)
                medicine_obj.setQuantityInStock(medicine.getQuantityInStock());
            if (medicine.getPrice() > 0)
                medicine_obj.setPrice(medicine.getPrice());
            if (medicine.getDiscountedPrice() >= 0)
                medicine_obj.setDiscountedPrice(medicine.getDiscountedPrice());
            if (medicine.getExpiryDate() != null && medicine.getQuantityInStock() >= 0)
                medicine_obj.setExpiryDate(medicine.getExpiryDate());
            medicineRepository.save(medicine_obj);
            return ResponseEntity.ok(medicine_obj);
        } else return ResponseEntity.badRequest().body("Medicine Not Found with name: " + medicine.getName());
    }

    //    Read medicine data from database
    @GetMapping("/getMedicine")
    public List<Medicine> getMedicines() {
        return medicineRepository.findAll();
    }

    //    delete medicine from database
    @PostMapping("/delete")
    public ResponseEntity<?> deleteMedicine(@Valid @RequestBody ProductRequest medicine) {
            Medicine medicine_obj = medicineRepository.findByMedicineId(medicine.getMedicineId()).orElseThrow(() -> new UsernameNotFoundException("Medicine Not Found with name: " + medicine.getName()));
            medicineRepository.delete(medicine_obj);
            return ResponseEntity.ok("Product was successfully deleted");
    }
}
