package com.subhajit.Medicare.controllers.API.Medicine;

import com.subhajit.Medicare.Models.Medicine;
import com.subhajit.Medicare.Repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/medicine")
public class GetMedicine {
    @Autowired
    MedicineRepository medicineRepository;
    @GetMapping("/getMedicine")
    public List<Medicine> getMedicines(){
        return medicineRepository.findAll();
    }
}
