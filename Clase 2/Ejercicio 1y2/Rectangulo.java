package ejercicios.java.advanced.ejercicio1y2;

public class Rectangulo 
{
	int alto;
	int ancho;
	
	public Rectangulo(int al,int an) 
	{
		alto = al;
		ancho = an;
	}
	
	public boolean equals(Rectangulo x) 
	{
		
		return this.alto == x.alto && this.ancho == x.ancho;
	}
	
	public boolean compareTo(Rectangulo x) 
	{
		
		return false;
	}
}
