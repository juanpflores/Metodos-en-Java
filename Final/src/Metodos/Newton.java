package Metodos;

import java.lang.Math;
public class Newton{
	double x0, tol;
	int nIter;
	
	public void NewtonM(){
		this.calculaRaiz();
	}
	
	public Newton(double tol2, double x02,int it){
		System.out.println("\n\n-------------------------------------------");
        System.out.println("*******   Metodo de Newton-Rapshon   ******");
        System.out.println("-------------------------------------------");

        tol=tol2;

        x0=x02;

        nIter=it;
	}	
	
	private double f(double x){
		/*Ecuacion*/
		double y = x*(Math.exp(x))-5;
		/*double y = (0.01*x + 1)*Math.sin(x)- (x - 0.01)/(Math.pow(x,2) + 1) - 0.0096;*/
		return y;
	}
	
	public double calculaRaiz(){
		double x = x0, xb = x-999;
		double del_x = 0.01;
		int n=0;

		System.out.println("\nResultado Iteraciones: ");
		while(Math.abs(x-xb)>tol){
			n = n+1; 
			xb = x;
  			if(n > nIter) break;
  			double y = f(x);
  			double y_driv=(f(x+del_x) - y)/del_x;
  			x = xb - y/y_driv;
  			
  			System.out.println(" n="+n+" x= "+x+" y = "+y);
		}
                
		System.out.println("\n-------------------------------------------");
		System.out.println("\tLa raiz es: "+x);
		System.out.println("-------------------------------------------");
                return x;
	}
}