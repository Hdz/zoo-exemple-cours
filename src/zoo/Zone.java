package zoo;

import java.util.ArrayList;

public class Zone {
	private String zone;
	private String nom;
	
	public static ArrayList<Animal> sahara = new ArrayList<>();
	
	public void add(Animal animal) {
		sahara.add(animal);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Zone [zone=" + zone + "]";
	}

	public ArrayList<Animal> getsahara() {
		return sahara;
	}

	public void setsahara(ArrayList<Animal> sahara) {
		this.sahara = sahara;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

		
}
