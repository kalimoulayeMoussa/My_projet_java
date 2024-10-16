//import NotreApplication.Projet;

import OU.Projet;

import java.util.ArrayList;
import java.util.List;

class Utilisateur {
    private String nom;
    private List<Projet> projets;

    public Utilisateur(String s, String prenom, String motDePasse, String nom) {
        this.nom = nom;
        this.projets = new ArrayList<Projet>();
    }

    public String getNom() {
        return nom;
    }

    public <Projet> List<Projet> getProjets() {
        return (List<Projet>) projets;
    }

    public void supprimerProjet(projet projet) {
        projets.remove(projet);
    }

    public void supprimerProjet() {

    }
}

