package com.subhajit.Medicare.Security.services;

import com.subhajit.Medicare.Models.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class MyDataService {
    private final String jsonUrl = "http://localhost:8080/api/medicine/getMedicine"; // Replace with your JSON file URL

    @Autowired
    private RestTemplate restTemplate;

    public Medicine[] fetchDataFromJson() {
        Medicine[] response = (restTemplate.getForObject(jsonUrl, Medicine[].class));
        return response;
    }
}
