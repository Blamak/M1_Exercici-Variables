import javax.swing.JOptionPane;

public class Fase1App {

	public static void main(String[] args) {

		String nom     = "V�ctor";
		String cognom1 = "Lasheras";
		String cognom2 = "S�nchez";

		int dia = 15;
		int mes = 7;
		int any = 1974;

		JOptionPane.showMessageDialog(null, cognom1 + " " + cognom2 + ", " + nom + "\n" + dia + "/" + mes + "/" + any);
	}
}
