package EjerciciosTablas;

import java.util.Scanner;

public class PosicionMaximo8
{

	public static void main(String[] args)
	{
		
			int tabla[] = new int[10];
			//Al principio le asigno a maximo y minimo el primer valor de la tabla
			int maximo = tabla[0];
			int pos = 0;
			Scanner teclado = new Scanner(System.in);
			
			//Pido los numero de la tabla
			for (int i = 0; i < 10; i++){
				System.out.println("Dame la posicion " + i);
				tabla[i] = teclado.nextInt();
			}
			
			//Calculo maximo de la tabla, comparo el primer valor con los demas.
			for (int i = 0; i < 10; i++){
				if (maximo < tabla[i]) {
					maximo = tabla[i];
					pos = i;					
				}
			
			}
			//Muestro los valores
			System.out.println("El maximo es " + maximo + " y se encuentra en la posición " + pos);
			
			for (int i = 0; i < 10; i++){
				if (maximo == tabla[i]) {
					System.out.println("Tambien aparece en la posicion " + i);					
				}
			}
			
			teclado.close();
		}

}
