package EjerciciosTablas;

import java.util.Scanner;

public class Cuadrados
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero;
		int tabla[]= new int[10];
		System.out.println("Dame un numero");
		numero = teclado.nextInt();
		teclado.close();
		for(int i=0; i<10;i++) {
			tabla[i] = i+(numero+1);
		}
		for(int i=0; i<10;i++) {
			tabla[i] = tabla[i]*tabla[i] ;
		}
		for(int i=0; i<10;i++) {
			System.out.println(tabla[i]);
		}
	}

}
