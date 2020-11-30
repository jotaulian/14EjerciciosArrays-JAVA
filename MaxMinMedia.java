package EjerciciosTablas;

import java.util.Scanner;

public class MaxMinMedia
{

	public static void main(String[] args)
	{
		
			int tabla[] = new int[10];
			int suma=0;
			//Al principio le asigno a maximo y minimo el primer valor de la tabla
			int maximo = tabla[0];
			int minimo = tabla[0];
			Scanner teclado = new Scanner(System.in);
			
			//Pido los numero de la tabla
			for (int i = 0; i < 10; i++){
				System.out.println("Dame la posicion " + i);
				tabla[i] = teclado.nextInt();
			}
			
			//Calculo maximo y minimo de la tabla, comparo el primer valor con los demas.
			for (int i = 0; i < 10; i++){
				suma = suma + tabla[i];
				if (maximo < tabla[i])
					maximo = tabla[i];
				if (minimo > tabla[i])
					minimo = tabla[i];
			}
			
			//Muestro los valores
			System.out.println("El maximo es " + maximo);
			System.out.println("El valor minimo es " + minimo);
			
			//calculo la media de la tabla
			System.out.println("La media de " + suma + " es " + ((float)suma/(float)10));
			teclado.close();
		}

}
