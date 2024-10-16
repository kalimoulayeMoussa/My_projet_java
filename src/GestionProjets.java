import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestionProjets {
    private Utilisateur utilisateur;
    private Scanner scanner;
    private boolean utilisateurCree = false;

    public GestionProjets(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        GestionProjets gestionProjets = new GestionProjets(null); // Utilisateur est null initialement
        gestionProjets.menuPrincipal();
    }

    public void menuPrincipal() {
        while (true) {
            System.out.println("##########################################################################################");
            System.out.println("Bonjours et bienvenue dans notre application\n" +
                    "Ce travail a été réalisé par GARANGO Moussa et BISSYENDE Pascaline ");
            System.out.println("##########################################################################################");
            System.out.println("Ici c'est le menu");
            if (!utilisateurCree) {
                System.out.println("1. Inscrivez-vous à notre programme");
            }
            System.out.println("2. Ajouter un projet");
            System.out.println("3. Afficher les projets");
            System.out.println("4. Ajouter une tâche à un projet");
            System.out.println("5. Modifier un projet");
            System.out.println("6. Supprimer un projet");
            System.out.println("7. Quitter");
            System.out.print("Faites votre choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne
            switch (choix) {
                case 1:
                    if (!utilisateurCree) {
                        inscrireUtilisateur();
                    } else {
                        System.out.println("Utilisateur déjà inscrit.");
                    }
                    break;
                case 2:
                    ajouterProjet();
                    break;
                case 3:
                    afficherProjets();
                    break;
                case 4:
                    ajouterTache();
                    break;
                case 5:
                    modifierProjet();
                    break;
                case 6:
                    utilisateur.supprimerProjet();
                    break;
                case 7:
                    System.out.println("Vous avez quitté le programme!");
                    return; // Quitter l'application
                default:
                    System.out.println("Désolé, nous n'avons pas trouvé votre choix. Réessayez à nouveau.");
            }
        }
    }

    private void afficherProjets() {

    }

    private void modifierProjet() {
    }

    private void ajouterTache() {
    }

    private void inscrireUtilisateur() {
        System.out.print("Nom: ");
        String nom = scanner.nextLine();
        System.out.print("Prénom: ");
        String prenom = scanner.nextLine();
        System.out.print("Mot de passe: ");
        String motDePasse = scanner.nextLine();
        System.out.print("Gmail: ");
        String gmail = scanner.nextLine();
        if (!isValidGmail(gmail)) {
            System.out.println("Adresse Gmail non valide. Veuillez réessayer.");
            return;
        }
        utilisateur = new Utilisateur(nom, prenom, motDePasse, gmail);
        utilisateurCree = true;
        System.out.println("Utilisateur créé avec succès!");
    }

    private boolean isValidGmail(String gmail) {
        String regex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(gmail);
        return matcher.matches();
    }

    private void ajouterProjet() {
        if (utilisateur == null) {
            System.out.println("Veuillez d'abord créer un utilisateur.");
            return;
        }
        System.out.print("Nom du projet: ");
    }}