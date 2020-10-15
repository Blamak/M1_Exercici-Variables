public class Fase4App {

	public static void main(String[] args) {
		String nom = "V�ctor Lasheras S�nchez";
		String dataNaixement = "15/07/1974";
		int anyNaixement = Integer.parseInt(dataNaixement.substring(dataNaixement.length() - 4));

		System.out.printf("El meu nom �s %s.%n", nom);
		System.out.printf("Vaig n�ixer el %s.%n", dataNaixement);

		boolean esAnyTraspas = (anyNaixement % 4 == 0 || anyNaixement % 400 == 0) && !(anyNaixement % 100 == 0);
		String bixestSi = String.format("El meu any de naixement �s de trasp�s.");
		String bixestNo = String.format("El meu any de naixement no �s de trasp�s.");

		if (esAnyTraspas) {
			System.out.println(bixestSi);
		} else {
			System.out.println(bixestNo);
		}
	};
}
