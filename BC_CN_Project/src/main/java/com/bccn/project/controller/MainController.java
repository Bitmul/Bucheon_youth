package com.bccn.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("currentMenu", "home");
        
        return "index";
    }
    @GetMapping("/about")
    public String about(Model model) {
    	model.addAttribute("currentMenu", "about");
        return "about"; 
    }
    
    @GetMapping("/roastery")
    public String roastery(Model model) {
    	model.addAttribute("currentMenu", "roastery");
        return "roastery"; 
    }
    
    @GetMapping("/roasting-lab")
    public String roasting_lab(Model model) {
    	model.addAttribute("currentMenu", "roasting-lab");
        return "roasting-lab"; 
    }
    
    @GetMapping("/awards")
    public String awards(Model model) {
    	model.addAttribute("currentMenu", "awards");
        return "awards"; 
    }
}
