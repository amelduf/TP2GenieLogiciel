package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Analyser la requête
		//Analyse la requête donnée en paramètre et retourne que la requête a bien été analysé en renvoyant la chaine de caractère "requête analysée"
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Comparaison des données entres les patients pour savoir s'il y a un cluster ou pas retourne la chaine de caractère "Cluster trouvé" s'il y en a un
		return "Cluster trouvé";
	}

}
