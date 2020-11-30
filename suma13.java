package EjerciciosTablas;

import java.util.Scanner;

public class suma13
{

	public static void main(String[] args)
	{
		int tabla[][] = new int[3][3];
		int tabla2[][] = new int[3][3];
		int resultado[][] = new int[3][3];
		int i, j;
		Scanner teclado = new Scanner(System.in);
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Dame la posición ["+ i +"][" + j + "] = ");
				tabla[i][j] = teclado.nextInt();
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Dame la posición ["+ i +"][" + j + "] de la tabla2= ");
				tabla2[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		//Sumo ambas tablas en una nueva
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				resultado[i][j] = tabla[i][j] + tabla2[i][j];
			}
		}
		//Muestro el resultado de la suma en una nueva matriz:
		System.out.println("El resultado de la suma de ambas tablas queda así: ");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print("\t" + " " + resultado[i][j]);
			}
			System.out.println("");
		}
	}

}
