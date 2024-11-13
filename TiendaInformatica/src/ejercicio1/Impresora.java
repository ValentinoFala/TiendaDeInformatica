package ejercicio1;

public class Impresora extends Producto{

	private int velocidad;
	private String color;
	
	public Impresora(double precio, String marca, int stock, int velocidad, String color) {
		super(precio, marca, stock);
		this.velocidad = velocidad;
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double calcularPrecioU() {
		return super.getPrecio();
	}
	
	
	
	
	
	
}
