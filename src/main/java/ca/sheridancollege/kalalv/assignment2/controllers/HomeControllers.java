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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
@Controller
public class HomeControllers {

    private  DatabaseAccess databaseAccess;
    private final AddRecord addRecord;

    List<Password> searchResults = new ArrayList<>();
    long id;
    public HomeControllers(DatabaseAccess databaseAccess, AddRecord addRecord) {
        this.databaseAccess = databaseAccess;
        this.addRecord = addRecord;
    }



    @GetMapping("/")
    public String ReturnIndex(Model model) {
        model.addAttribute("newPasswordRecord", new Password());
        id = RandomNumberGenerator.generateRandomId();
        model.addAttribute("Id",id);
        return "index";
    }

    @PostMapping("/addRecord")
    public String addRecord(Model model,@ModelAttribute Password password) {
        id = RandomNumberGenerator.generateRandomId();
        password.setId(id);
        this.databaseAccess.save(password);
        model.addAttribute("newPasswordRecord",new Password());
        return "redirect:/";
    }
    @GetMapping("/searchPass")
    public String getSearchPassword(Model model) {
        model.addAttribute("searchTitle",searchResults);
        return "searchPasswordRecord";
    }

    @PostMapping("/searchByTitle")
    public String searchByTitle(@RequestParam("search-title") String title) {
        searchResults = databaseAccess.findByTitle(title);
        return "redirect:/searchPass"; // Return the view directly
    }
    @GetMapping("/viewPass")//works perfect
    public String ReturnPasswordRecord(Model model){
        List<Password> p= addRecord.getAllPasswordRecords();
        model.addAttribute("passwordRecords",p);
        return "viewPasswordRecord";
    }
}
