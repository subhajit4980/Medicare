package com.subhajit.Medicare.controllers.API.Medicine;

import com.subhajit.Medicare.Models.Medicine;
import com.subhajit.Medicare.Models.User;
import com.subhajit.Medicare.Payload.response.MessageResponse;
import com.subhajit.Medicare.Repository.MedicineRepository;
import com.subhajit.Medicare.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicine")
public class AddMedicine {
    @Autowired
    MedicineRepository medicineRepository;
    @Autowired
    UserRepository userRepository;
    @PostMapping("/add")
    public ResponseEntity<?> addMedicine(@Valid @RequestBody Medicine medicine)
    {
        if(medicineRepository.existsByName(medicine.getName())){
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Medicine already added!"));
        }
        Medicine medicine_obj= new Medicine(medicine.getName(),medicine.getDescription(),medicine.getPrice(),medicine.getQuantityInStock(),medicine.getManufacturer(),medicine.getExpiryDate(),medicine.getActiveIngredients(),medicine.getUsageInstructions(),medicine.getImageUrl(),medicine.getBuyer(),medicine.getRating());
        medicine_obj.setExpiryDate(medicine.getExpiryDate());
        medicine_obj.setQuantityInStock(medicine.getQuantityInStock());
        medicine_obj.setBuyer(0);
        medicine_obj.setRating(0.0);
        medicineRepository.save(medicine_obj);
        return  ResponseEntity.ok(new MessageResponse("Medicine  added successfully"));
    }
    @PostMapping("/update")
    public  ResponseEntity<?> updateMedicine(@Valid @RequestBody Medicine medicine)
    {
        if(medicineRepository.existsByName(medicine.getName())){
            Medicine medicine_obj = medicineRepository.findByName( medicine.getName()).orElseThrow(() -> new UsernameNotFoundException("Medicine Not Found with name: " + medicine.getName()));;
            if(medicine.getQuantityInStock()>=0)
                medicine_obj.setQuantityInStock(medicine.getQuantityInStock());
            if(medicine.getPrice() > 0)
                medicine_obj.setPrice(medicine.getPrice());
            if (!medicine.getExpiryDate().isEmpty() && medicine.getQuantityInStock()>=0)
                medicine_obj.setExpiryDate(medicine.getExpiryDate());
            medicineRepository.save(medicine_obj);
            return ResponseEntity.ok(medicine_obj);
        }
        else  return ResponseEntity.badRequest().body("Medicine Not Found with name: " + medicine.getName());
    }
    @PostMapping("/buyItem")
    public ResponseEntity<?> updateMedicineAfterBuy(@Valid @RequestParam("noOfQuantityToBuy") String medicineName , @RequestParam("noOfQuantityToBuy") int noOfQuantityToBuy ,@RequestParam("username") String username)
    {
        Medicine medicine_obj = medicineRepository.findByName( medicineName).orElseThrow(() -> new UsernameNotFoundException("Medicine Not Found with name: " + medicine.getName()));;
        if(medicine_obj.getQuantityInStock()==0)
        {
            return  ResponseEntity.badRequest().body("Medicine out of stock");
        }
        if(userRepository.existsByUsername(username))
        {
//            User user=userRepository.findByUsername(username).orElseThrow(()->new IllegalStateException("User not found"));


            // Update the medicine object with the new quantity
            medicine_obj.setQuantityInStock(medicine_obj.getQuantityInStock() - noOfQuantityToBuy);
            // Save the updated medicine object
            medicineRepository.save(medicine_obj);
            return  ResponseEntity.ok("Medicine ordered successfully");
        }

    }
}
