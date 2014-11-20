package Metodos;

import java.lang.Math;
public class Lagrange{
public double MetodoLagrange(double x1,double x2, double x3, double x4,
         double y4, double y3, double y2, double y1, double it){
		int n,i;
		double x,y=0;
		double a[][] = new double [4][2];
		System.out.println("\n\n------------------------------------------------------");
        System.out.println("*******   Metodo de Interpolacion de Lagrange   ******");
        System.out.println("------------------------------------------------------");
		
		n=4;	
		a[0][0]=x1;
                a[0][1]=y1;
                a[1][0]=x2;
                a[1][1]=y2;
                a[2][0]=x3;
                a[2][1]=y3;
                a[3][0]=x4;
                a[3][1]=y4;

		System.out.println("\nIngrese el valor a interpolar:");
		x=it;
		switch(n){
			case 2:
			y=(((((x-a[1][0])*a[0][1])/(a[0][0]-a[1][0]))+(((x-a[0][0])*a[1][1])/(a[1][0]-a[0][0]))));
			System.out.println("\n\nf(x) en ese punto es: "+y);
			break;
			case 3:
			y=((x-a[1][0])*(x-a[2][0])*a[0][1])/((a[0][0]-a[1][0])*(a[0][0]-a[2][0]))+((x-a[0][0])*(x-a[2][0])*a[1][1])/((a[1][0]-a[0][0])*(a[1][0]-a[2][0]))+((x-a[1][0])*((x-a[0][0])*a[2][1])/((a[2][0]-a[0][0])*(a[2][0]-a[1][0])));
			System.out.println("f(x) en ese punto es: "+y);
			break;
			case 4:
			y=((x-a[1][0])*(x-a[3][0])*(x-a[2][0])*a[0][1])/((a[0][0]-a[1][0])*(a[0][0]-a[2][0])*(a[0][0]-a[3][0]))+((x-a[0][0])*(x-a[2][0])*(x-a[3][0])*a[1][1])/((a[1][0]-a[0][0])*(a[1][0]-a[2][0])*(a[1][0]-a[3][0]))+((x-a[0][0])*(x-a[1][0])*((x-a[3][0])*a[2][1])/((a[2][0]-a[0][0])*(a[2][0]-a[1][0])*(a[2][0]-a[3][0]))+((x-a[0][0])*(x-a[1][0])*((x-a[2][0])*a[
3][1])/((a[3][0]-a[0][0])*(a[3][0]-a[1][0])*(a[3][0]-a[2][0]))));
			System.out.println("f(x) en ese punto es: "+y);
                        
			break;
			default:
			System.out.println("\nNVALIDO");
			break;	
                }
                return y;
	}
}