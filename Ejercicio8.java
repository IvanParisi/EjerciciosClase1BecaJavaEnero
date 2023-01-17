package ejercicios.java.advanced;
import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) 
	{
		Scanner i = new Scanner(System.in);
		YearMonth yearMonthObject;
		int mes =  0;
		String[] meses = new String[]{null,"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre",
				"Noviembre","Diciembre"};
		try 
		{
			System.out.print("Ingrese un mes");
			mes =  i.nextInt();

			i.close();
		} catch (java.util.InputMismatchException e) 
		{
			System.out.println("Solo se permiten numeros");
		}
		
		if(mes > 0 && mes <= 12) 
		{
			yearMonthObject = YearMonth.of(Year.now().getValue(), mes);
			System.out.println("El mes es: " + meses[mes] + " y tiene tantos dias: " + 	yearMonthObject.lengthOfMonth());
			
		}else 
		{
			System.out.println("Es un mes incorrecto");
		}
		
		
	}

}
