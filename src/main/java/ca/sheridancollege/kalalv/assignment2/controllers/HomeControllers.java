package ca.sheridancollege.kalalv.assignment2.controllers;


import ca.sheridancollege.kalalv.assignment2.beans.Password;
import ca.sheridancollege.kalalv.assignment2.database.DatabaseAccess;
import ca.sheridancollege.kalalv.assignment2.utilities.AddRecord;
import ca.sheridancollege.kalalv.assignment2.utilities.RandomNumberGenerator;
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
    private final DatabaseAccess databaseAccess;
    private final AddRecord addRecord;
    private final RandomNumberGenerator random;
    @Autowired
    public HomeControllers(DatabaseAccess databaseAccess,AddRecord addRecord
            ,RandomNumberGenerator random) {
        this.databaseAccess = databaseAccess;
        this.addRecord=addRecord;
        this.random=random;
    }


    @GetMapping("/")
    public String ReturnIndex() {

        return "index";
    }
    @PostMapping("/addrecord")
        public void Addrecord(Model model){


                Password p= new Password();
                p.setId(random.generateRandomId());


               addRecord.SavePasswordRecord();

                // Add a success message to the model
                model.addAttribute("message", "Password record added successfully!");


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
        List<Password> p= addRecord.getAllPasswordRecords();
        model.addAttribute("passwordRecords",p);
        return "viewPasswordRecord";
     }
}
