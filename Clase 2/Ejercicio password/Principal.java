package ejercicios.java.advanced;

import java.util.Scanner;

import ejercicios.java.advanced.ejercicioPassword.Password;

public class Principal {

	public static void main(String[] args) 
	{
		Scanner i = new Scanner(System.in);
		int longArray = 0;
		int longContra = 0;
		Password[] contras;
		Password[] contrasCopias;
		boolean[] contrasEsFuerte;
		
		do 
		{
			try 
			{
				System.out.println("De que longitud quiere el almacen de contrase�as MIN: 0 - MAX: 100: ");
				longArray = i.nextInt();
				System.out.println("De que longitud quiere las contrase�as MIN: 0 - MAX: 50: ");
				longContra = i.nextInt();
			} catch (java.util.InputMismatchException e)
			{
				System.out.println("Solo se permiten numeros");
			}
		}while ((longArray < 0  || longArray > 100) || (longContra < 0 || longContra > 50));
		
		i.close();
		contras = new Password[longArray];
		contrasCopias = new Password[longArray];
		contrasEsFuerte = new boolean[longArray];
		
		for (int j = 0; j < contras.length; j++) 
		{
			contras[j] = new Password(longContra);
			contrasCopias[j] = new Password(contras[j]);
			contrasEsFuerte[j] = contras[j].esFuerte();
		}
		
		 for(int x = 0; x < contrasCopias.length; x++)   
         {  
             for (int j = x+1; j<contrasCopias.length; j++)  
             {  
                
                if(contrasCopias[x].getContrase�a().compareTo(contrasCopias[j].getContrase�a())>0)   
                {  
                    Password temp = contrasCopias[x];
                    contrasCopias[x] = contrasCopias[j];  
                    contrasCopias[j] = temp;  
                 }  
              }  
           }
	
		 System.out.println("Contrase�as ordenadas: ");
		 for (int j = 0; j < contrasCopias.length; j++) 
		 {
			System.out.println(contrasCopias[j].getContrase�a());
		 }
		 System.out.println("---------------------------------");
		 System.out.println("Todas las contrase�as: ");
		 for (int j = 0; j < contrasCopias.length; j++) 
		 {
			System.out.println(contras[j].getContrase�a() + "  " + contrasEsFuerte[j]);
		 }
	}

}
