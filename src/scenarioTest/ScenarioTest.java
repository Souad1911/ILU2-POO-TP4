package scenarioTest;

import produit.Poisson;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import produit.Sanglier;
import produit.Produit;


public class ScenarioTest {
	public static void main(String[] args) {

		IEtals[] marche = new IEtals[3];
		IEtals etalSanglier = new Etal();
		IEtals etalPoisson = new Etal();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
		IEtal<Produit>[] marche = new IEtal[3];

	}

}


