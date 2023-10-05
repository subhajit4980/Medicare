package com.subhajit.Medicare.controllers.API.Medicine;

import com.subhajit.Medicare.Models.Medicine;
import com.subhajit.Medicare.Payload.response.MessageResponse;
import com.subhajit.Medicare.Repository.MedicineRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/medicine")
public class AddMedicine {
    @Autowired
    MedicineRepository medicineRepository;
    @PostMapping("/add")
    public ResponseEntity<?> addMedicine(@Valid @RequestBody Medicine medicine)
    {
        if(medicineRepository.existsByName(medicine.getName())){
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Medicine already added !"));
        }
        Medicine medicine_obj= new Medicine(medicine.getName(),medicine.getDescription(),medicine.getPrice(),medicine.getQuantityInStock(),medicine.getManufacturer(),medicine.getExpiryDate(),medicine.getActiveIngredients(),medicine.getUsageInstructions(),medicine.getImageUrl());
        medicine_obj.setExpiryDate(medicine.getExpiryDate());
        medicine_obj.setQuantityInStock(medicine.getQuantityInStock());
        medicineRepository.save(medicine_obj);
        return  ResponseEntity.ok(new MessageResponse(" Medicine  added successfully"));
    }
    @PostMapping("/update")
    public  ResponseEntity<?> updateMedicine(@Valid @RequestBody Medicine medicine)
    {
        if(medicineRepository.existsByName(medicine.getName())){
            Medicine medicine_obj = medicineRepository.findByName( medicine.getName()).orElseThrow(() -> new UsernameNotFoundException("Medicine Not Found with name: " + medicine.getName()));;
            if(medicine.getQuantityInStock()>0)
                medicine_obj.setQuantityInStock(medicine.getQuantityInStock());
            if(medicine.getPrice() > 0)
                medicine_obj.setPrice(medicine.getPrice());
            if (!medicine.getExpiryDate().isEmpty())
                medicine_obj.setExpiryDate(medicine.getExpiryDate());
            medicineRepository.save(medicine_obj);
            return ResponseEntity.ok(medicine_obj);
        }
        else  return ResponseEntity.badRequest().body("Medicine Not Found with name: " + medicine.getName());
    }
}
