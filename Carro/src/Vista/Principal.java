package Vista;

import javax.swing.JOptionPane;

import Controlador.Controlador1;

public class Principal {

	public static void main(String[] args) {
		
		Controlador1 iniciar = new Controlador1();

		String menu = "MENU\n";
		menu = "1.Ingresar carro\n";
		menu += "2.Consultar Carro\n";
		menu += "3.Mostrar todos los carros\n";
		menu += "4.Eliminar carro\n";
		menu += "5.Actualizar información carro \n";
		menu += "6.Encender coche\n";
		menu += "7.Avanzar coche\n";
		menu += "8.Frenar coche\n";
		menu += "9.Reproducir musica\n";
		menu += "10.Salir\n";

		int opc = 0;

		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
			iniciar.crearMenu(opc);
		} while (opc != 10);
	}



	

}
