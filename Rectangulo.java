
public class Rectangulo extends Triangulo implements Calculadora {

	public Rectangulo(String name, double base, double altura, double lado) {
		super(name, base, altura, lado);
	}//constructor
	
	public double calcularArea() {
		return getBase()*getAltura();
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getBase()*2) + (getAltura()*2);
	}//calcularPerimetro

	@Override
	public String toString() {
		return "Rectangulo [getName()=" + getName() + ", getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}//toString
	
}//class Rectangulo
