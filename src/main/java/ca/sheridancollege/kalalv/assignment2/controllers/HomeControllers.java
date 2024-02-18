package ca.sheridancollege.kalalv.assignment2.controllers;


import ca.sheridancollege.kalalv.assignment2.beans.Password;
import ca.sheridancollege.kalalv.assignment2.database.DatabaseAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class HomeControllers {
    Autowired
    private DatabaseAccess databaseAccess;
    @GetMapping("/")
    public String ReturnIndex(){

        return "index";
    }
    @PostMapping("/addrecord")
    public void Addrecord(Model model){

        public String addRecord( Model model) {
            Password p= new Password();
            p.setId(databaseAccess.generateRandomId());

            // Save the password record
            databaseAccess.SavePasswordRecord(p);

            // Add a success message to the model
            model.addAttribute("message", "Password record added successfully!");

            // Redirect back to the home page after adding the record
            return "redirect:/";
        }

    }
    @GetMapping("/searchPass")
    public String ReturnSearchPassword(){
        return "searchPasswordRecord";
    }
    @GetMapping("/searchByTitle")
    public ModelAndView searchByTitle(@ModelAttribute("title")String title){
        List<Password> p= databaseAccess.findByTitle(title);
        return new ModelAndView("searchPasswordRecord","searchByTitle",p); //implement logic for title

    }
    @GetMapping("/viewPass")
     public String ReturnPasswordRecord(Model model){
        List<Password> p=databaseAccess.getAllPasswordRecords();
        model.addAttribute("passwordRecords",p);
        return "viewPasswordRecord";
     }
}
