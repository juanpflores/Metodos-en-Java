package Metodos;

import java.lang.Math;
public class GaussEliminacion{
public void GaussE(){
		int i,j,k,n;
		double a[][] = new double [5][6];
		double cte,x1,x2,x3;
		double x[] = new double [5];
		System.out.println("--------------------------------------------------");
        System.out.println("*******   Metodo de Eliminacion Gaussiana   ******");
        System.out.println("--------------------------------------------------");
        System.out.println("\n*Numero de incongnitas debe se igual a numero de ecuaciones");
		System.out.println("Ingrese el numero de incognitas (maximo 5): ");
		n=Leer.datoInt();
		System.out.println("\nIngrese coeficientes:");
		for(i=0;i<n;i++)
		{
			System.out.println("\nRenglon "+(i+1));
			for(j=0;j<=n;j++)
			{
				System.out.println("Ingrese A["+(i+1)+"]"+"["+(j+1)+"]");
				a[i][j]=Leer.datoDouble();
			}
		}
		for(i=0;i<n-1;i++){
		  for(j=i+1;j<=n;j++){
			 cte=(-a[j][i])/(a[i][i]);
		      for(k=i;k<n+1;k++){
			 	a[j][k]=((a[i][k])*cte)+a[j][k];
			 }
		   }
		}

	 	x3=(a[n-1][n])/(a[n-1][n-1]);
	 	x2=((a[n-2][n]-x3)*(a[n-2][n-1]))/(a[n-2][n-2]);
	 	x1=((a[n-3][n]-x2*a[n-3][n-2]-x3)*(a[n-3][n-1]))/(a[n-3][n-3]);
	 	System.out.println("\n\nValores encontrados: ");
		System.out.println("\nx0= "+x1+" \nx1= " +x2+" \nx2= " +x3);
	}
}