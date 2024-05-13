package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class siege {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int ID_Siege;
	  	private String Number_Siege;
	  	private String état_siège;
	    private String arrivee;
	    
	    
		public siege(String number_Siege, String état_siège, String arrivee) {
			super();
			Number_Siege = number_Siege;
			this.état_siège = état_siège;
			this.arrivee = arrivee;
		}

		public siege(int ID_Siege, String number_Siege, String état_siège, String arrivee) {
			super();
			this.ID_Siege = ID_Siege;
			Number_Siege = number_Siege;
			this.état_siège = état_siège;
			this.arrivee = arrivee;
		}

		public siege() {
			super();
		}

		public int getId() {
			return ID_Siege;
		}

		public void setId(int ID_passager) {
			this.ID_Siege = ID_passager;
		}

		public String getNumber_Siege() {
			return Number_Siege;
		}

		public void setNumber_Siege(String number_Siege) {
			Number_Siege = number_Siege;
		}

		public String getÉtat_siège() {
			return état_siège;
		}

		public void setÉtat_siège(String état_siège) {
			this.état_siège = état_siège;
		}

		public String getArrivee() {
			return arrivee;
		}

		public void setArrivee(String arrivee) {
			this.arrivee = arrivee;
		}


}
