package Modelo;

import javax.swing.JOptionPane;

public class Carro {

	private String placa, referencia, marca, modelo, color;
	private double precio;
	private int cantPuertas;

	public Carro(String placa, String referencia, String marca, String modelo, String color, double precio,
			int cantPuertas) {

		this.placa = placa;
		this.referencia = referencia;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.cantPuertas = cantPuertas;
	}

	public void encender() {

		String llave = JOptionPane.showInputDialog("Ingrese *LLAVE* para encender el vehiculo");
		if (llave.equalsIgnoreCase("llave")) {
			JOptionPane.showMessageDialog(null, "Su carro ha encendido con exito!");
		} else {
			JOptionPane.showMessageDialog(null, "Ups, Hubo un error");
		}
	}

	public void avanzar() {

		String pedalArranque = JOptionPane.showInputDialog("Ingrese *ACELERAR* para que arranque el vehiculo");
		if (pedalArranque.equalsIgnoreCase("ACELERAR")) {
			JOptionPane.showMessageDialog(null, "Su carro se ha desplezado de un punto x a un y!");
		} else {
			JOptionPane.showMessageDialog(null, "Ups, Hubo un error");
		}
	}

	public void frenar() {

		String freno = JOptionPane.showInputDialog("Ingrese *FRENAR* para que frene el vehiculo");
		if (freno.equalsIgnoreCase("FRENAR")) {
			JOptionPane.showMessageDialog(null, "Su carro se ha detenido correctamente!");
		} else {
			JOptionPane.showMessageDialog(null, "Ups, Hubo un error");
		}
	}

	public void reproducirMusica() {

		String tipoMusica = JOptionPane.showInputDialog(
				"Ingrese el tipo de musica que desea escuchar: ROCK, METAL, REGUETON, TRAP, SALSA, MERENGUE");
		if (tipoMusica.equalsIgnoreCase("rock") || tipoMusica.equalsIgnoreCase("metal")
				|| tipoMusica.equalsIgnoreCase("regueton") || tipoMusica.equalsIgnoreCase("trap")
				|| tipoMusica.equalsIgnoreCase("salsa") || tipoMusica.equalsIgnoreCase("merengue")) {
			JOptionPane.showMessageDialog(null, "En un momento empezara a reproducir la musica :)");
		} else {
			JOptionPane.showMessageDialog(null, "Ups, Hubo un error");
		}
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

}
