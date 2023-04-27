
public class Cuadrado implements Calculadora{
	
	private String name;
	private double lado;
	
	public Cuadrado(String name, double lado) {
		this.name = name;
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return getLado() * getLado();
	}// CalcularArea
	
	public double calcularPerimetro() {
		return getLado()*4;
		
	}// CalcularPerimetro

	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}//toString
	
}//class Cuadrado
