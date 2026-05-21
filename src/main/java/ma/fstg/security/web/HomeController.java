package ma.fstg.security.web;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    /**
     * Page d'accueil - accessible à tout utilisateur authentifié.
     */
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "<h2>Page d'accueil</h2><p>Accessible après connexion.</p>" +
               "<ul>" +
               "<li><a href='/user/dashboard'>Espace utilisateur</a></li>" +
               "<li><a href='/admin/dashboard'>Espace administrateur</a></li>" +
               "<li><a href='/logout'>Se déconnecter</a></li>" +
               "</ul>";
    }

    /**
     * Espace utilisateur - accessible aux rôles USER et ADMIN.
     */
    @GetMapping("/user/dashboard")
    @ResponseBody
    public String userDashboard() {
        return "<h2>Espace utilisateur</h2>" +
               "<p>Accessible aux rôles USER et ADMIN.</p>" +
               "<a href='/'>Retour accueil</a> | <a href='/logout'>Déconnexion</a>";
    }

    /**
     * Espace administrateur - réservé au rôle ADMIN.
     */
    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminDashboard() {
        return "<h2>Espace administrateur</h2>" +
               "<p>Réservé au rôle ADMIN.</p>" +
               "<a href='/'>Retour accueil</a> | <a href='/logout'>Déconnexion</a>";
    }

    /**
     * Affiche le formulaire de connexion personnalisé (login.html).
     */
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
