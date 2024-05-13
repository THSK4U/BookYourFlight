package metier;

import javax.persistence.*;

@Entity
public class vol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String depart;
    private String arrivee;
    private String pays;

    public vol() {
        super();
    }

    public vol(String nom, String depart, String arrivee, String pays) {
        this.nom = nom;
        this.depart = depart;
        this.arrivee = arrivee;
        this.pays = pays;
    }

    public vol(int id, String nom, String depart, String arrivee, String pays) {
        this.id = id;
        this.nom = nom;
        this.depart = depart;
        this.arrivee = arrivee;
        this.pays = pays;
    }

    
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getDepart() {
	return depart;
}
public void setDepart(String depart) {
	this.depart = depart;
}
public String getArrivee() {
	return arrivee;
}
public void setArrivee(String arrivee) {
	this.arrivee = arrivee;
}
public String getPays() {
	return pays;
}
public void setPays(String pays) {
	this.pays = pays;
}
	
}
