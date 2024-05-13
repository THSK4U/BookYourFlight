package metier;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class passager {

    @Id
    @Column(name = "ID_passager")
    private int ID_passager;
    private String nom;

    
	public passager() {
		super();
	}

	public passager(String nom) {
		super();
		this.nom = nom;
	}

	public passager(int ID_passager, String nom) {
		super();
		this.ID_passager = ID_passager;
		this.nom = nom;
	}

	public int getIdPassager() {
		return ID_passager;
	}

	public void setIdPassager(int ID_passager) {
		this.ID_passager = ID_passager;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}