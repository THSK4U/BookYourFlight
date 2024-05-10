package metier;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vol")
public class airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
private int id;
	@Column(name = "nom")
private String nom;
	@Column(name = "depart")
private String depart;
	@Column(name = "arrivee")
private String arrivee;
	@Column(name = "pays")
private String pays;

public airport() {
	super();
}
public airport(String nom, String depart, String arrivee, String pays) {
	super();
	this.nom = nom;
	this.depart = depart;
	this.arrivee = arrivee;
	this.pays = pays;
}
public airport(int id, String nom, String depart, String arrivee, String pays) {
	super();
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
