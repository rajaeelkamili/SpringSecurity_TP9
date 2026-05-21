# TP9 — Authentification en mémoire avec Spring Security

## Description
Projet Spring Boot démontrant la configuration d'une authentification en mémoire
avec Spring Security, gestion des rôles et formulaire de connexion personnalisé.

## Prérequis
- Java 17+
- Maven 3.6+

## Lancement
```bash
mvn spring-boot:run
```
Puis ouvrir : http://localhost:8081

## Comptes de test

| Utilisateur | Mot de passe | Rôle  | Accès                        |
|-------------|--------------|-------|------------------------------|
| user        | 1111         | USER  | `/`, `/user/dashboard`       |
| admin       | 1234         | ADMIN | `/`, `/user/dashboard`, `/admin/dashboard` |

## Routes

| URL                | Accès requis       |
|--------------------|--------------------|
| `/login`           | Public             |
| `/`                | Authentifié        |
| `/user/dashboard`  | USER ou ADMIN      |
| `/admin/dashboard` | ADMIN seulement    |
| `/logout`          | Authentifié        |

## Structure du projet
```
src/main/java/ma/fstg/security/
├── SpringSecurityDemoApplication.java   ← Classe principale
├── config/
│   └── SecurityConfig.java              ← Configuration sécurité
└── web/
    └── HomeController.java              ← Contrôleurs

src/main/resources/
├── templates/
│   └── login.html                       ← Formulaire de connexion
└── application.properties
```

## Note importante
Le préfixe `{noop}` désactive l'encodage des mots de passe.
**En production**, toujours utiliser `BCryptPasswordEncoder`.
