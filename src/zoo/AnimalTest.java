package zoo;

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
		
		nvZone.add(animal2);
		
		
		System.out.println("\n Création d'un deuxième animal : Le " + animal2.getNom() + ", Il est de type : "
				+ animal2.getType() + " venant de la zone : " + nvZone.getZone());

	}

}