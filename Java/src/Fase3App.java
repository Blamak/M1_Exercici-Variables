import javax.swing.JOptionPane;

public class Fase3App {

	public static void main(String[] args) {
	
		int anyInici = 1948;
		int interval = 4;
		int anyNaixement = Integer.parseInt(JOptionPane.showInputDialog("Introdueix el teu any de naixement"));

		for (int i = anyInici; i <= anyNaixement; i += interval) {
			System.out.println(i);
		}

		boolean esAnyTraspas = (anyNaixement % 4 == 0 && anyNaixement % 100 != 0) || anyNaixement % 400 == 0;
		String bixestSi = String.format("L'any %d és any de traspàs.", anyNaixement);
		String bixestNo = String.format("L'any %d no és any de traspàs.", anyNaixement);

		if (esAnyTraspas) {
			System.out.println(bixestSi);
			
		} else {
			System.out.println(bixestNo);
		}
	}
}
