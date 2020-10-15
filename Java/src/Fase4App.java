public class Fase4App {

	public static void main(String[] args) {
		String nom = "Víctor Lasheras Sánchez";
		String dataNaixement = "15/07/1974";
		int anyNaixement = Integer.parseInt(dataNaixement.substring(dataNaixement.length() - 4));

		System.out.printf("El meu nom és %s.%n", nom);
		System.out.printf("Vaig néixer el %s.%n", dataNaixement);

		boolean esAnyTraspas = (anyNaixement % 4 == 0 || anyNaixement % 400 == 0) && !(anyNaixement % 100 == 0);
		String bixestSi = String.format("El meu any de naixement és de traspàs.");
		String bixestNo = String.format("El meu any de naixement no és de traspàs.");

		if (esAnyTraspas) {
			System.out.println(bixestSi);
		} else {
			System.out.println(bixestNo);
		}
	};
}
