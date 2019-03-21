package zoo;

class Animal {
	private String nom;
	// Stock le nom de l'animal
	private String type;

	public Animal() {
		System.out.println("Création d'un animal");
		//En gros c'est le constructeur
		nom ="Rentrez le : ";
		type ="Rentez le : ";
	}


	public Animal(String Anom, String Atype) {
		System.out.println("Création d'un animal avec paramètres");
		this.nom = Anom;
		this.type = Atype;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "AnimalTest [nom=" + nom + ", type=" + type + "]";
	}
	
}