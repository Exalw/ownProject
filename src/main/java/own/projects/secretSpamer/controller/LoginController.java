package own.projects.secretSpamer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import own.projects.secretSpamer.database.AccountRepository;

@Controller
public class LoginController {

    @Autowired
    AccountRepository accountRepo;

    /*@GetMapping("/")
    public String AnmeldungAnzeigen(Model model, Integer login){
        if (login != null){
            model.addAttribute("istFalsch",login);
        }
        else{
            model.addAttribute("istFalsch",0);
        }
        model.addAttribute("benutzer",new Benutzer());
        return "Anmeldung";
    }*/
}
