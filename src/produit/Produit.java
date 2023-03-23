package produit;

public abstract class Produit {

	private static String nom;
	public Unité unité;

	public String getNom() {
		return nom;
	}

	public abstract void descriptionProduit();

}
