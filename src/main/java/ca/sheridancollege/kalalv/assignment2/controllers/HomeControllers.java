package ca.sheridancollege.kalalv.assignment2.controllers;

import ca.sheridancollege.kalalv.assignment2.databases.DatabaseAccess;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {

public DatabaseAccess databaseAccess;
@GetMapping("/")
public String ReturnIndex(Model model){
    model.addAttribute("passwordList", databaseAccess.findAll());
    return "index";
}

}
