package Lab1;

import javax.swing.JOptionPane;

public class Entidad {
	
	//Creamos los atributos ladoA y ladoB
	private double ladoA;
	private double ladoB;

	//Metodo que pide los datos de los lados al usuario y los convierte a tipo Double
	public void ingresarDatos() {
		
		String cadena;
		
		cadena = JOptionPane.showInputDialog("Ingrese la longitud del lado A: ");
		ladoA = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog("Ingrese la longitud del lado B: ");
		ladoB = Double.parseDouble(cadena);
	}
	
	//Metodo que calcula el resultado del area de un triangulo y muestra el resultado
	public void calcularArea() {
		
		double resultado;
		
		resultado = ladoA * ladoB;
		
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
	}
	
	
}
