package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_Utilisateurs;
    private String nom;
    private String email;


    public utilisateur() {
        super();
    }

    public utilisateur(int ID_Utilisateurs, String nom, String email, passager passager) {
        super();
        this.ID_Utilisateurs = ID_Utilisateurs;
        this.nom = nom;
        this.email = email;
    }

    public utilisateur(String nom, String email, passager passager) {
        super();
        this.nom = nom;
        this.email = email;
    }

    public int getIdUtilisateur() {
        return ID_Utilisateurs;
    }

    public void setIdUtilisateur(int ID_Utilisateurs) {
        this.ID_Utilisateurs = ID_Utilisateurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
