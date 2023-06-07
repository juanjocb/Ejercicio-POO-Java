package Lab2;

public class Flecha {

	// Atributos
	int longitud;
	String color;

	// Metodo constructor

	public Flecha(int longitud, String color) {
		this.longitud = longitud;
		this.color = color;
	}

	/**
	 * public Flecha() { longitud = 10; color = "negro"; }
	 */

	// Metodo que construye la flecha, dependiendo de la longitud

	public void construirFlecha() {
		for (int i = 0; i < longitud; i++) {
			imprime("-");
		}
		imprime(">");
	}

	// Metodo
	public void imprime(String simbolo) {
		if (color.equals("negro")) {
			System.out.print(simbolo);
		} else {
			System.err.print(simbolo);
		}
	}

	//Metodo que imprime un salto de linea para separar las flechas
	public void imprimirEspacio() {
		System.out.println();
	}
}