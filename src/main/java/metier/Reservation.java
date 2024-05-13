package metier;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Reservation")
public class Reservation { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Reservations")
    private int idReservations;

    @ManyToOne
    @JoinColumn(name = "ID_Utilisateurs")
    private utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "ID_Siege")
    private siege siege; 

    @ManyToOne
    @JoinColumn(name = "ID_Passager")
    private passager passager;

    public Reservation() {
        super();
    }

    public Reservation(utilisateur utilisateur, siege siege, passager passager) { 
        super();
        this.utilisateur = utilisateur;
        this.siege = siege;
        this.passager = passager;
    }

    public Reservation(int idReservations, utilisateur utilisateur, siege siege, passager passager) {
        super();
        this.idReservations = idReservations;
        this.utilisateur = utilisateur;
        this.siege = siege;
        this.passager = passager;
    }

    // Getters and setters

    public int getIdReservations() {
        return idReservations;
    }

    public void setIdReservations(int idReservations) {
        this.idReservations = idReservations;
    }

    public utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public siege getSiege() {
        return siege;
    }

    public void setSiege(siege siege) {
        this.siege = siege;
    }

    public passager getPassager() {
        return passager;
    }

    public void setPassager(passager passager) {
        this.passager = passager;
    }
}
