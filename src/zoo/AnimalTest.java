package zoo;

import java.util.Iterator;

public class AnimalTest {

	public static void main(String[] args) {
		System.out.println("Premier programme");
		Animal animal = new Animal();

		System.out.println("\n Création d'un " + animal.getNom() + ", Il est de type : " + animal.getType());
		animal.setNom("Pipo");
		animal.setType("Pingouin");
		System.out.println("\n Création d'un " + animal.getNom() + ", Il est de type : " + animal.getType());

		Zone nvZone = new Zone();
		nvZone.setZone("Sahara");
		System.out.println(nvZone.getZone() + "\n");

		Animal animal2 = new Animal("Leo", "Lion");
		Animal animal3 = new Animal("Thomas", "Antilope");
		Animal animal4 = new Animal("Gecko", "lézard");
		Animal animal5 = new Animal("Gaspard", "Guépard");
		Animal animal6 = new Animal("Beber", "Dromadaire");

		
		nvZone.add(animal2);
		nvZone.add(animal3);
		nvZone.add(animal4);
		nvZone.add(animal5);
		nvZone.add(animal6);

		
		System.out.println("\n Création d'un deuxième animal : Le " + animal2.getNom() + ", Il est de type : "
				+ animal2.getType() + " venant de la zone : " + nvZone.getZone());

		
		
		Iterator<Animal> iterator = Zone.sahara.iterator();
		while (iterator.hasNext()){
			Animal temp = iterator.next();
			System.out.println("Zone Sahara : -> "+temp);
			
		}
	}

}