package ejercicios.java.advanced.ejercicioPassword;

import java.util.Iterator;
import java.util.Random;

public class Password
{
	int longitud = 8;
	String contrase�a; 
	
	public Password() 
	{
		this.contrase�a = generarPassword();
	}
	
	public Password(int longi) 
	{
		this.longitud = longi;
		this.contrase�a = generarPassword();
	}
	
	public Password(Password x) 
	{
		this.longitud = x.longitud;
		this.contrase�a = x.contrase�a;
	}
	
	
	
	public boolean esFuerte() 
	{
		int mayus = 0;
		int mins = 0;
		int nums = 0;
		
		char[] passChar = contrase�a.toCharArray();
		
		for (int i = 0; i < passChar.length; i++) 
		{

			if(Character.isUpperCase(passChar[i])) 
			{
				mayus ++;
			}else if (Character.isLowerCase(passChar[i])) 
			{
				mins ++;
			}else if (Character.isDigit(passChar[i])) 
			{
				nums ++;
			}
		}
		
		if(mayus >= 2 && mins >=1 && nums >=5) 
		{
			return true;
		}
		
		return false;
	}
	
	public String generarPassword() 
	{
		String pws = "";
		String charGenerado;
		Random rnd = new Random();
		boolean charB = false;
		for (int i = 0; i < longitud; i++) 
		{
			if(!charB) 
			{	
				do 
				{
					charGenerado = "";
					charGenerado += (char)(rnd.nextInt(57) + 65);
				}while(charGenerado.matches("[a-zA-Z]*") == false);
				pws += charGenerado;
				charB = true;
			}else 
			{
				pws += rnd.nextInt(9);
				charB = false;
			}
			
		}
		
		return pws;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}
}
