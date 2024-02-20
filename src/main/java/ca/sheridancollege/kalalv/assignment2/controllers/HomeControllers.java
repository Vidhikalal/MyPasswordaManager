package ca.sheridancollege.kalalv.assignment2.controllers;


import ca.sheridancollege.kalalv.assignment2.beans.Password;
import ca.sheridancollege.kalalv.assignment2.databases.DatabaseAccess;
import ca.sheridancollege.kalalv.assignment2.utilities.AddRecord;
import ca.sheridancollege.kalalv.assignment2.utilities.RandomNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class HomeControllers {
    private DatabaseAccess databaseAccess;
    private final AddRecord addRecord;
    public HomeControllers(DatabaseAccess databaseAccess, AddRecord addRecord) {
        this.databaseAccess = databaseAccess;
        this.addRecord = addRecord;
    }


    @GetMapping("/")
    public String ReturnIndex(Model model) {

        return "index";
    }
//    @PostMapping("/addRecord")
//        public String addRecord(Model model,@ModelAttribute Password record){
//                Long id = RandomNumberGenerator.generateRandomId();
//                record.setId(id);
//
//                databaseAccess.save(record);
//                model.addAttribute("passwordRecord",new Password());
//                model.addAttribute("message", "Password record added successfully!");
//                return "index";
//
//            }

    @GetMapping("/searchPass")
    public String getSearchPassword(){
        return "searchPasswordRecord";

    }
    @PostMapping("/searchByTitle")
    public String searchByTitle(@RequestParam("title") String title,Model model){
        List<Password> s= addRecord.searchByTitle(title);
        model.addAttribute("searchTitle",s);
        return "searchPasswordRecord";
    }
    @GetMapping("/viewPass")//works perfect
     public String ReturnPasswordRecord(Model model){
        List<Password> p= addRecord.getAllPasswordRecords();
        model.addAttribute("passwordRecords",p);
        return "viewPasswordRecord";
     }
}
