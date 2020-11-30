package EjerciciosTablas;

import java.util.Scanner;

public class traspuesta12
{

	public static void main(String[] args)
	{
		final int FILAS = 3;
		final int COLUMNAS = 3;
		int tabla[][] = new int[FILAS][COLUMNAS];
		int tras[][] = new int[FILAS][COLUMNAS];
		int i, j;
		Scanner teclado = new Scanner(System.in);
		for(i=0;i<FILAS;i++) {
			for(j=0;j<COLUMNAS;j++) {
				System.out.println("Dame la posición ["+ i +"][" + j + "] = ");
				tabla[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		for(i=0;i<FILAS;i++) {
			for(j=0;j<COLUMNAS;j++) {
				tras[i][j] = tabla[j][i];
			}
		}
		System.out.println("La tabla traspuesta toma la siguiente forma: ");
		for(i=0;i<FILAS;i++) {
			for(j=0;j<COLUMNAS;j++) {
				System.out.print("\t" + tabla[i][j]);
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
		System.out.println("La tabla traspuesta toma la siguiente forma: ");
		for(i=0;i<FILAS;i++) {
			for(j=0;j<3;j++) {
				System.out.print("\t" + tras[i][j]);
			}
			System.out.println("");
		}
	}

}
