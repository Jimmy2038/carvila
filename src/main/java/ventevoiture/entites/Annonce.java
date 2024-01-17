package ventevoiture.entites;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table( name = "annonce")
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnnonce;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;

    private LocalDateTime daty;

    @ManyToOne
    @JoinColumn(name = "id_model")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "id_energie")
    private Energie energie;

    @ManyToOne
    @JoinColumn(name = "id_transmission")
    private Transmission transmission;

    private int kilometrage;

    private int annee;

    private String descri;

    private double prix;

    public Annonce() {
    }

    public Annonce(int idAnnonce, Utilisateur utilisateur, LocalDateTime daty, Model model, Energie energie, Transmission transmission, int kilometrage, int annee, String descri, double prix) {
        this.idAnnonce = idAnnonce;
        this.utilisateur = utilisateur;
        this.daty = daty;
        this.model = model;
        this.energie = energie;
        this.transmission = transmission;
        this.kilometrage = kilometrage;
        this.annee = annee;
        this.descri = descri;
        this.prix = prix;
    }

    public int getIdAnnonce() {
        return idAnnonce;
    }

    public void setIdAnnonce(int idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public LocalDateTime getDaty() {
        return daty;
    }

    public void setDaty(LocalDateTime daty) {
        this.daty = daty;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Energie getEnergie() {
        return energie;
    }

    public void setEnergie(Energie energie) {
        this.energie = energie;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
