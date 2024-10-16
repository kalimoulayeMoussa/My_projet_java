import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class projet {
    private String nom;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private List<tache> taches;

    public projet(String nom, String description, Date dateDebut, Date dateFin) {
        this.nom = nom;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.taches = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<tache> getTaches() {
        return taches;
    }

    public void ajouterTache(tache tache) {
        taches.add(tache);
    }

    public void supprimerTache(tache tache) {
        taches.remove(tache);
    }
}
