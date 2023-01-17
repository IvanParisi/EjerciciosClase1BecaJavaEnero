package ejercicios.java.advanced;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) 
	{
		Scanner i = new Scanner(System.in);
		int numero = 0;
		int inver = 0;
	
		do 
		{
			try 
			{
				System.out.println("Ingrse un numero positivo");
				numero = i.nextInt();
			} catch (java.util.InputMismatchException e)
			{
				System.out.println("Solo se permiten numeros");
			}
		}while (numero < 0);
		
		if(numero > 0 && numero < 10) 
		{
			System.out.println(numero);
		}else 
		{
			while( numero > 0 ) 
			{
		         int resto = numero % 10;
		         inver = inver * 10 + resto;
		         numero /= 10;
		     }
			
			System.out.println("El numero invertido es: " + inver);
		}
		
		
			
		

	}

}
