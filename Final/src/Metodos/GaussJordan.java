package Metodos;
import java.lang.Math;
public class GaussJordan{
public double[] MetodoGaussJordan(double A[][]){
		int i,j,k,n;
		double a[][] = new double [5][6];
                double b[]= new double[3];
		double cte;
		double x[] = new double [5];
		System.out.println("-------------------------------------------");
        System.out.println("*******   Metodo de Gauss-Jordan   ******");
        System.out.println("-------------------------------------------");
		n=3;
		System.out.println("\nIngresa los coeficientes: ");
		for(i=0;i<n;i++)
		{
			System.out.println("\nRenglon "+(i+1));
			for(j=0;j<n;j++)
			{
				System.out.println("Ingrese A["+(i+1)+"]"+"["+(j+1)+"]");
				a[i][j]=A[i][j];
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
		for(i=0;i<n;i++){
			System.out.println("\nRenglon "+(i+1));
			for(j=0;j<n;j++){
				System.out.println("\n\tA["+(i+1)+"]"+"["+(j+1)+"]"+" =" +a[i][j]);
                                b[i]=a[i][j];
			}
		}
                return b;
	}
}