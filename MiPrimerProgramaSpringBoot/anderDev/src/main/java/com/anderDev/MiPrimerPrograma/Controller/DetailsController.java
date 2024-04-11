package com.anderDev.MiPrimerPrograma.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DetailsController {
    @GetMapping("/details")
    public String details(){
        return "details";
    }

    @GetMapping("/details/person")
    public String detailsPerson( Model model){
        model.addAttribute("name", "Anderson");
        model.addAttribute("edad", 24);
        return "details";
    }
}
