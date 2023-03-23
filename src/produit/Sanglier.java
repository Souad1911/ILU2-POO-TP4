package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private String nom = "sanglier";

	public void descriptionProduit() {
		// TODO Auto-generated method stub
		System.out.println("sanglier de " + poids + super.unité + "chassé par " + nom);

	}

}
