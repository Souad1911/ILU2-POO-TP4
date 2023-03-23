package produit;

public class Poisson extends Produit {
	private String datePeche;
	private String nom = "poisson";

	public void descriptionProduit(String datePeche) {
		// TODO Auto-generated method stub
		System.out.println("poisson peché" + datePeche);
	}

	@Override
	public void descriptionProduit() {
		// TODO Auto-generated method stub

	}

}
