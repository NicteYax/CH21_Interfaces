public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
		
		Cuadrado c1= new Cuadrado ("Cuadrado c1", 2.0);
		Cuadrado c2= new Cuadrado ("Cuadrado c2", 4.0);
		
		Rectangulo r1= new Rectangulo ("Rectangulo r1", 10.0, 5.0, 0.0);
		Rectangulo r2= new Rectangulo ("Rectangulo r2", 8.0, 3.0, 0.0);
		
		Rombo ro1= new Rombo ("Rombo ro1", 2.0, 5.0, 3.0);
		Rombo ro2= new Rombo ("Rombo ro2", 4.0, 10.0, 8.0);
		
		Romboide rd1= new Romboide ("Romboide rd1", 2.0, 5.0, 0.0);
		Romboide rd2= new Romboide ("Romboide rd2", 4.0, 10.0, 0.0);
		
		Trapecio tr1= new Trapecio ("Trapecio tr1", 2.0, 5.0, 4.0, 2.0, 2.0, 5.0, 2.0);
		Trapecio tr2= new Trapecio ("Trapecio tr2", 4.0, 10.0, 7.0, 4.0, 4.0, 10.0, 4.0);

		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(c1); imprimirCalculo(c2);
		imprimirCalculo(r1); imprimirCalculo(r2);
		imprimirCalculo(ro1); imprimirCalculo(ro2);
		imprimirCalculo(rd1); imprimirCalculo(rd2);
		imprimirCalculo(tr1); imprimirCalculo(tr2);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Calculadora t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras