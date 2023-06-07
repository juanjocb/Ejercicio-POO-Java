package Lab1;

public class Aplicacion {

	public static void main (String args[]) {

	//Declaramos un nuevo objeto entidad llamado rectangulo
	Entidad rectangulo;

	//Inicializamos el new objeto
	rectangulo = new Entidad();

	//Llamamos los metodos ingresar datos y calcular area para el nuevo objeto
	rectangulo.ingresarDatos();
	rectangulo.calcularArea();

}
}