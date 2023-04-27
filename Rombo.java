
public class Rombo extends Cuadrado implements Calculadora {
	private double diagonalMenor;
	private double diagonalMayor;
	
	

	public Rombo(String name, double lado, double diagonalMenor, double diagonalMayor) {
		super(name, lado);
		this.diagonalMenor= diagonalMenor;
		this.diagonalMayor= diagonalMayor;
	}//constructor

	public double calcularArea() {
		return (getDiagonalMenor()*getDiagonalMayor())/2;
	}//calcularArea
	
	public double calcularPerimetro() {
		return getLado()*4;
		
	}// calcularPerimetro

	public double getDiagonalMenor() {
		return diagonalMenor;
	}//getDiagonalMenor

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}//setDiagonalMenor

	public double getDiagonalMayor() {
		return diagonalMayor;
	}//getDiagonalMayor

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}//setDiagonalMayor

	@Override
	public String toString() {
		return "Rombo [diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor + ", getName()=" + getName()
				+ ", getLado()=" + getLado() + "]";
	}//toString

	
	
}//class Rombo
