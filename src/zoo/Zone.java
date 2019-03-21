package zoo;

import java.util.ArrayList;

public class Zone {
	private String zone;
	
	private ArrayList<Animal> animaux = new ArrayList<>();
	
	public void add(Animal animal) {
		animaux.add(animal);
	}

	@Override
	public String toString() {
		return "Zone [zone=" + zone + "]";
	}

	public ArrayList<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(ArrayList<Animal> animaux) {
		this.animaux = animaux;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

		
}
