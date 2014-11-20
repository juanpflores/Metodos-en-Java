package Metodos;
import java.lang.Math;
public class GaussSeidel{
public void MetodoGaussSeidel(){
		double x0,x1,x2,tol,e;
		int i,j;
		double a[][]=new double [3][4];
		System.out.println("\n\n------------------------------------------------------");
        System.out.println("*******         Metodo de Gauss-Seidel    ******");
        System.out.println("------------------------------------------------------");
		System.out.println("Ingrese tolerancia:");
		tol=Leer.datoInt();
		System.out.println("\nIngrese coeficientes:");
		for(i=0;i<3;i++)
		{
			System.out.println("\nRenglon "+(i+1)+"");
			for(j=0;j<=3;j++)
			{
				System.out.println("Ingrese A ["+(i+1)+"]"+"["+(j+1)+"]"); 
				a[i][j]=Leer.datoDouble();
			}
		}
		x1=0.0;
		x2=0.0;
		do{
			e=x1;
			x0=(a[0][3]-x1*a[0][1]-x2*a[0][2])/a[0][0];
			x1=(a[1][3]-x0*a[1][0]-x2*a[1][2])/a[1][1];
			x2=(a[2][3]-x0*a[2][0]-x1*a[2][1])/a[2][2];
		}while(Math.abs(e-x1)>tol);
		System.out.println("x1= "+x0+" \nx2= " +x1+" \nx3= " +x2);
		}
}