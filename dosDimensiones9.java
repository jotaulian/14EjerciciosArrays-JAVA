package EjerciciosTablas;

import java.util.Scanner;

public class dosDimensiones9
{

	public static void main(String[] args)
	{
		final int FILAS = 3;
		final int COLUMNAS = 4;
		char tabla[][]= new char[FILAS][COLUMNAS];
		int i,j;
		Scanner teclado = new Scanner(System.in);
		//Recorrido para rellenar la tabla
		for(i=0;i<FILAS;i++) {
			for(j=0;j<COLUMNAS;j++) {
				System.out.println("Dame el valor de la posicion[" + i + "][" + j + "]");
				tabla[i][j] = teclado.nextLine().charAt(0); 
			}
		}
		
		teclado.close();
		for(i=0;i<FILAS;i++) {
			for(j=0;j<COLUMNAS;j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
