package EjerciciosTablas;


public class sumaPosicion10
{

	public static void main(String[] args)
	{
		int tabla[][] = new int[10][10];
		int i, j;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				tabla[i][j] = i+j;
			}
		}
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
