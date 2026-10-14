public class Calcule extends Thread {
	long resultat = 0;
	int valeur;
	int multiplicateur;
	int index;
	
	public void Calcule(int val, int mult, int index) {
		
	}
	
	// TODO: Déclarer les attributs nécessaires
	@Override
	public void run() {


		// Calcul intensif simulé par des opérations mathématiques

		for (int j = 0; j < multiplicateur; j++) {
			resultat += valeur * valeur + valeur;
							// on pourrais aussi mettre un sleep
		}
	}
	
	public int getResultat() {
		return resultat;
	}
	
	public static void main(String[] args) {
		Calcule test = new Calcule();
		test.start();
		test.join();
	}
	
}