package ma.fstg.security.spring_security_demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Thymeleaf → templates/login.html
    }

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Page d'accueil accessible après connexion.";
    }

    @GetMapping("/user/dashboard")
    @ResponseBody
    public String userDashboard() {
        return "Espace utilisateur - accessible aux rôles USER et ADMIN.";
    }

    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminDashboard() {
        return "Espace administrateur - réservé au rôle ADMIN.";
    }
}
