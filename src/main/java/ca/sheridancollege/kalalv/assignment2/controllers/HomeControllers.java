package ca.sheridancollege.kalalv.assignment2.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {

@GetMapping("/")
public String ReturnIndex(){

    return "index";
}

}
