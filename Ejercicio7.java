package ejercicios.java.advanced;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) 
	{
		Scanner i = new Scanner(System.in);
		int hora = 0;
		int minutos = 0;
		int segundos = 0;
		
		try 
		{
			System.out.print("Ingrese la hora ");
			hora =  i.nextInt();
			System.out.print("Ingrese los minutos ");
			minutos =  i.nextInt();
			System.out.print("Ingrese los segundos ");
			segundos =  i.nextInt();
			i.close();
		} catch (java.util.InputMismatchException e) 
		{
			System.out.println("Solo se permiten numeros");
		}
		
		if((hora >= 0 && hora < 24) && (minutos >= 0 && minutos <= 59) && (segundos >= 0 && segundos <= 59))
		{
			System.out.println("Hora valida: " + hora + ":" + minutos + ":" + segundos );
		}else 
		{
			System.out.println("Hora invalida");
		}

	}

}
