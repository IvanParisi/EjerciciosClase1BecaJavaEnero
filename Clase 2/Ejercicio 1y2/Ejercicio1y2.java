package ejercicios.java.advanced.ejercicio1y2;

public class Ejercicio1y2 {

	public static void main(String[] args) 
	{
		Rectangulo r1 = new Rectangulo(2,3);
		Rectangulo r2 = new Rectangulo(2,3);
		Rectangulo r3 = new Rectangulo(120,100);
		
		System.out.println(r1.compareTo(r3));
		System.out.println(r1.equals(r2));
		System.out.println();

	}

}
