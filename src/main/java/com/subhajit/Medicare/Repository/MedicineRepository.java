package com.subhajit.Medicare.Repository;

import com.subhajit.Medicare.Models.ERole;
import com.subhajit.Medicare.Models.Medicine;
import com.subhajit.Medicare.Models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MedicineRepository extends MongoRepository<Medicine, String> {
    Optional<Medicine> findByName(String name);
    Boolean existsByName(String name);
}
