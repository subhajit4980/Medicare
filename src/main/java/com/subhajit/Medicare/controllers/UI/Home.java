package com.subhajit.Medicare.controllers.UI;

import com.subhajit.Medicare.Models.Medicine;
import com.subhajit.Medicare.Security.services.MyDataService;
import com.subhajit.Medicare.controllers.API.Medicine.GetMedicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class Home {
@Autowired
private MyDataService myDataService;

//    @RequestMapping("/")
//    public String Home(){
//        return "home";
//    }
    @RequestMapping("/")
    public String HomeMedicines(Model model){
        Medicine[] medicines= myDataService.fetchDataFromJson();
        for(int i=0;i<medicines.length;i++)
        {
            System.out.println(medicines[i]);
        }
        model.addAttribute("data", medicines);
        return "medicinelist";}
}
