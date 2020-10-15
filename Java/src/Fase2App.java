import javax.swing.JOptionPane;

public class Fase2App {

	public static void main(String[] args) {
		final int ANY_INICIAL = 1948;
		int interval = 4;
		
		int anyNaixement = Integer.parseInt(JOptionPane.showInputDialog("Introdueix el teu any de naixement"));
		
		int totalAnysTraspas = ((anyNaixement - ANY_INICIAL) / interval) + 1;
		
		JOptionPane.showMessageDialog(null, "Anys de traspàs entre 1948 i " + anyNaixement + ": " + totalAnysTraspas);
	}
}
