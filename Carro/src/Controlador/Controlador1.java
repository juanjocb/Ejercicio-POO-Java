package Controlador;

import java.util.HashMap;

import javax.swing.JOptionPane;

import Modelo.Carro;

public class Controlador1 {

	HashMap<String, Carro> mapCarros = new HashMap<>();
	Carro miCarro;

	public void crearMenu(int opc) {

		switch (opc) {
		case 1:
			ingresarDatos();
			break;
		case 2:
			if (validarLlenado()) {
				buscarCarro();
			}
			break;
		case 3:
			if (validarLlenado()) {
				listaCarros();
			}
			break;
		case 4:
			if (validarLlenado()) {
				eliminarCarro();
			}
			break;
		case 5:
			if (validarLlenado()) {
				actualizarInfo();
			}
			break;
		case 6:
			if (validarLlenado()) {
				miCarro.encender();
			}
			break;
		case 7:
			if (validarLlenado()) {
				miCarro.avanzar();
			}
			break;
		case 8:
			if (validarLlenado()) {
				miCarro.frenar();
			}
			break;
		case 9:
			if (validarLlenado()) {
				miCarro.reproducirMusica();
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Error de codigo");
			break;
		}

	}

	private boolean validarLlenado() {
		if (!mapCarros.isEmpty()) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Error, tienes que ingresar carros");
			return false;
		}
	}

	public void ingresarDatos() {

		String placa = "", referencia = "", marca = "", modelo = "", color = "";
		double precio = 0;
		int cantPuertas = 0;

		String str = "";

		do {

			miCarro = new Carro(placa, referencia, marca, modelo, color, precio, cantPuertas);
			placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
			miCarro.setPlaca(placa);
			referencia = JOptionPane.showInputDialog("Ingrese la referencia del vehiculo");
			miCarro.setReferencia(referencia);
			marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
			miCarro.setMarca(marca);
			modelo = JOptionPane.showInputDialog("Ingrese la modelo del vehiculo");
			miCarro.setModelo(modelo);
			color = JOptionPane.showInputDialog("Ingrese la color del vehiculo");
			miCarro.setColor(color);
			precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la precio del vehiculo"));
			miCarro.setPrecio(precio);
			cantPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas del vehiculo"));
			miCarro.setCantPuertas(cantPuertas);
			str = JOptionPane.showInputDialog("¿Quiere ingresar otro coche? Si/No");
			mapCarros.put(placa, miCarro);

		} while (str.equalsIgnoreCase("si"));
	}

	public void buscarCarro() {

		String placa = JOptionPane.showInputDialog("Ingrese la placa del carro que desea buscar");
		String mensaje = "";

		for (String element : mapCarros.keySet()) {
			if (element.equalsIgnoreCase(placa)) {
				for (Carro valores : mapCarros.values()) {
					mensaje += valores.getPlaca() + "\n";
					mensaje += valores.getMarca() + "\n";
					mensaje += valores.getReferencia() + "\n";
					mensaje += valores.getModelo() + "\n";
					mensaje += valores.getColor() + "\n";
					mensaje += valores.getPrecio() + "\n";
					mensaje += valores.getCantPuertas() + "\n";
				}
				JOptionPane.showMessageDialog(null, mensaje);
			}
		}
	}

	public void listaCarros() {

		String mensaje = "";
		String carros = "";

		for (Carro valores : mapCarros.values()) {
			mensaje += valores.getPlaca() + ", ";
			mensaje += valores.getMarca() + ", ";
			mensaje += valores.getReferencia() + ", ";
			mensaje += valores.getModelo() + ", ";
			mensaje += valores.getColor() + ", ";
			mensaje += valores.getPrecio() + ", ";
			mensaje += valores.getCantPuertas() + "\n";
		}
		
		carros += mensaje;

		JOptionPane.showMessageDialog(null, carros);
	}

	public void eliminarCarro() {

		String carro = JOptionPane
				.showInputDialog("Ingrese la placa del carro para eliminarlo de nuestra base de datos");

		for (String placa : mapCarros.keySet()) {
			if (placa.equalsIgnoreCase(carro)) {
				mapCarros.remove(placa);
				JOptionPane.showMessageDialog(null, "Eliminado con exito!");
			}
		}
	}

	public void actualizarInfo() {

		String carro = JOptionPane
				.showInputDialog("Ingrese la placa del carro para actualizarlo de nuestra base de datos");

		String referencia, marca, modelo, color;
		double precio;
		int cantPuertas;
		String act = "";

		for (String clave : mapCarros.keySet()) {
			if (clave.equalsIgnoreCase(carro)) {

				act = JOptionPane.showInputDialog(
						"Ingrese que le desea actualizar al vehiculo. referencia, marca, modelo, color, precio o cantidadPuertas:");

				switch (act) {
				case "referencia":
					referencia = JOptionPane.showInputDialog("Ingrese la nueva referencia");
					mapCarros.get(clave).setReferencia(referencia);
					break;
				case "marca":
					marca = JOptionPane.showInputDialog("Ingrese la nueva marca");
					mapCarros.get(clave).setMarca(marca);
					break;
				case "modelo":
					modelo = JOptionPane.showInputDialog("Ingrese el nuevo modelo");
					mapCarros.get(clave).setModelo(modelo);
					break;
				case "color":
					color = JOptionPane.showInputDialog("Ingrese el nuevo color");
					mapCarros.get(clave).setColor(color);
					break;
				case "precio":
					precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio"));
					mapCarros.get(clave).setPrecio(precio);
					break;
				case "cantidadPuertas":
					cantPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas"));
					mapCarros.get(clave).setCantPuertas(cantPuertas);
					break;
				default:
					break;
				}

			}
		}
	}

}
