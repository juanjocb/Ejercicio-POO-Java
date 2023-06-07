package Lab2;

import javax.swing.JOptionPane;

public class Principal {

	Flecha flecha1, flecha2, flecha3, flecha4;

	public static void main(String[] args) {

		new Principal();

	}

	public Principal() {

		//Creamos la flecha 1
		flecha1 = new Flecha(10, "negro");
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();

		//Creamos la flecha 2
		flecha2 = new Flecha(5, "verde");
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();

		//Creamos la flecha 3
		flecha3 = new Flecha(2, "rojo");
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
		
		//En este espacio le pedimos al usuario que contrauya su propia flecha con su color y su tamaño personalizado
		flecha4 = new Flecha(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la flecha")), JOptionPane.showInputDialog("Ingrese el color de la flecha"));
		flecha4.construirFlecha();
		flecha4.imprimirEspacio();
	}
}
