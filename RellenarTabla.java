package EjerciciosTablas;

public class RellenarTabla
{

	public static void main(String[] args)
	{
		//Creo una tabla con 20 elementos
		int Pares[] = new int[20];
		
		//Asigno valores pares a los 20 elementos de la tabla
		for(int i=0; i<20; i++) {
				Pares[i] = (i+1) *2;
		}
		
		//Muestro los valores de la tabla
		for(int i=0;i<20;i++) {
			System.out.println(Pares[i]);
		}
	}

}
