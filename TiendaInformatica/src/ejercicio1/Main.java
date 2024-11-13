package ejercicio1;

public class Main {
	public static void main(String[] args) {
	Producto p1 = new Impresora(200, "HP", 15, 700, "Negro");
	Producto p2 = new Impresora(500, "HP", 20, 500, "Blanco");
	Producto p3 = new Computadora(5000, "MSI", 40, "Escritorio", 8, 512, false);
	Producto p4 = new Computadora(8000, "ASUS", 50, "Escritorio", 16, 512, true);
	 
	Cajero c1 = new Cajero("Maria", p1, 10);
	Cajero c2 = new Cajero("Juan", p2, 5);
	Cajero c3 = new Cajero("Hernan", p3, 3);
	Cajero c4 = new Cajero("Betina", p4, 1);
	 
	System.out.println("El precio de la venta es: " + c1.calcularPrecioFinal());
	System.out.println("El precio de la venta es: " + c2.calcularPrecioFinal());
	System.out.println("El precio de la venta es: " + c3.calcularPrecioFinal());
	System.out.println("El precio de la venta es: " + c4.calcularPrecioFinal());

	}

}
