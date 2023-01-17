package ejercicios.java.advanced.ejercicio4;

import java.util.Iterator;

public class Ejercicio4 
{
	public static void dibujarRombo() 
	{
		int d1 = 4;
		int d2 = 10;
		String[] exagono = new String[(d2-d1) + 1];
		
		for (int i = 0; i < exagono.length; i++) 
		{
			exagono[i] = " ";
			if(d1 <= d2) 
			{
				for (int j = 0; j < (d2-d1)/2; j++) 
				{
					
					exagono[i] += " ";
				}
				for (int j = 0; j < d1; j++) 
				{
					
					exagono[i] += "*";
				}
				
			}else
			{
				d2 -= 2;
				for (int j = 0; j < (d1-d2)/4; j++) 
				{
					
					exagono[i] += " ";
				}
				for (int j = 0; j < d2; j++) 
				{
					
					exagono[i] += "*";
				}
				exagono[i] += " ";
			}
			d1 += 2;
			if(d2 == 2) 
			{
				break;
			}
		}
	
		for (int i = 0; i < exagono.length; i++) 
		{
			System.out.println(exagono[i]);
		}
		
		
	}
	
	public static void dibujarRombo(int d1, int d2) 
	{
		if(d1 > d2 || d2 <  d1) 
		{
			System.out.println("Error en bibujar el exagono");
		}
	}
}
