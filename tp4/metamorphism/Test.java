package metamorphizme;

public class Test {
	public static void main(String[] args) {
		
		vehicule vehicule = new Vehicule();
		System.out.println(vehicule.seDeplacer());
		
		vehicule = new Velo();
		System.out.println(vehicule.seDeplacer());
		
		vehicule = new Voiture();
		System.out.println(vehicule.seDeplacer());
	}
}