package ejercicios.java.advanced;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) 
	{
		Scanner i = new Scanner(System.in);
		int n = 1;
		int contN = 0;
		int contC = 0;
		
		do 
		{
			System.out.println("Ingrese un numero (cuando quiera terminar ingrese -25): ");
			try 
			{
				n = i.nextInt();
				if(n < 0) 
				{
					contN++;
				}else if (n == 0)
				{
					contC++;
				}
			} catch (java.util.InputMismatchException e) 
			{
				System.out.println("Solo se permiten numeros");
			}
			 
		}while (n != -25);
		
		System.out.println("Ingreso tantos ceros: " + contC + " -- Ingreso tantos numeros negativos: " + contN);

	}

}
