package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class airport {

    @Id
    @Column(name = "Id_vol")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVol;

    @ManyToOne
    @JoinColumn(name = "ID_airport")
    private vol airport;
   
    private String compagnie;
    private Date dateDepart;
    private Date dateArrivee;
    private int  prix;

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "Compagnie: " + compagnie + ", Date de départ: " + sdf.format(dateDepart) + 
               ", Date d'arrivée: " + sdf.format(dateArrivee) + ", Prix: " + prix;
    }
    
	public airport() {
		super();
	}

	public airport(metier.vol airport, String compagnie, Date dateDepart, Date dateArrivee, int prix) {
		super();
		this.airport = airport;
		this.compagnie = compagnie;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.prix = prix;
	}

	public airport(int idVol, metier.vol airport, String compagnie, Date dateDepart, Date dateArrivee, int prix) {
		super();
		this.idVol = idVol;
		this.airport = airport;
		this.compagnie = compagnie;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.prix = prix;
	}

	public int getIdVol() {
		return idVol;
	}

	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}

	public vol getAirport() {
		return airport;
	}

	public void setAirport(vol airport) {
		this.airport = airport;
	}

	public String getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

    
    
}