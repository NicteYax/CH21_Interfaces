
public class Trapecio extends Triangulo implements Calculadora{
	
	private double lado2;
	private double lado3;
	private double lado4;
	private double baseMayor;
	
	public Trapecio(String name, double base, double baseMayor, double altura, double lado, double lado2, double lado3, double lado4) {
		super(name, base, altura, lado);
		this.lado2= lado2;
		this.lado3= lado3;
		this.lado4= lado4;
		this.baseMayor= baseMayor;	
	}//construtor
	
	public double calcularArea() {
		return (getAltura()*(getBase()+getBaseMayor()))/2;
	}//calcularArea
	
	public double calcularPerimetro() {
		return getLado()+getLado2()+getLado3()+getLado4();
	}//calcularPerimetro

	public double getLado2() {
		return lado2;
	}//getLado2

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}//setLado2

	public double getLado3() {
		return lado3;
	}//getLado3

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}//setLado3

	public double getLado4() {
		return lado4;
	}//getLado4

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}//setLado4

	public double getBaseMayor() {
		return baseMayor;
	}//getBaseMayor

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}//getBaseMayor

	@Override
	public String toString() {
		return "Trapecio [lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + ", baseMayor=" + baseMayor
				+ ", getName()=" + getName() + ", getBase()=" + getBase() + ", getAltura()=" + getAltura()
				+ ", getLado()=" + getLado() + "]";
	}
	
	

}//Trapecia
