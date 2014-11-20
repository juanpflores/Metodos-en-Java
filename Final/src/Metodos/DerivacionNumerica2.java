package Metodos;
import java.util.Scanner;
public class DerivacionNumerica2{
    
    double x[]=new double[10];
    double y[]=new double[10];
    double punto;
    
    public void Derivacion(){
        System.out.println("\n\n---------------------------------------------");
        System.out.println("   *******   Metodo Segunda Derivada ******");
        System.out.println("---------------------------------------------");
        DerivacionNumerica D=new DerivacionNumerica();
        Scanner sc= new Scanner(System.in);
        System.out.print("\nIngrese el tamaño de tu arreglo: ");
        int n=sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.println("Ingrese el dato x["+i+"]: ");
            D.x[i]=sc.nextDouble();
            System.out.println("Ingrese el dato y["+i+"]: ");
            D.y[i]=sc.nextDouble();
       
        }
        System.out.println("\tIngrese el punto a derivar: ");
        D.punto=sc.nextDouble();
       System.out.println("\nLa diferencia centrada es "+D.Centrada(D, n)+"");
       System.out.println("La diferencia Adelante es "+D.Adelante(D, n)+"");
       System.out.println("La diferencia Atras es "+D.Atras(D, n)+"");
       System.out.println("La segunda derivada  es "+D.Segunda(D, n)+"");
	}
    
        public double Centrada(DerivacionNumerica D, int n){
        double der=0;
        for(int i=0; i<n; i++){
            if(D.x[i]==D.punto){
                der=(D.y[i+1]-D.y[i-1])/(2*(D.x[1]-D.x[0]));
            }   
        }
        return der;
        }
            public double Adelante(DerivacionNumerica D, int n){
        double der=0;
        for(int i=0; i<n; i++){
            if(D.x[i]==D.punto){
                der=(D.y[i+1]-D.y[i])/(D.x[1]-D.x[0]);
            }   
        }
        return der;
        }
        public double Atras(DerivacionNumerica D, int n){
        double der=0;
        for(int i=0; i<n; i++){
            if(D.x[i]==D.punto){
                der=(D.y[i]-D.y[i-1])/(D.x[1]-D.x[0]);
            }   
        }
        return der;
        }
    
    	public double Segunda(DerivacionNumerica D, int n){
    	double der=0;
        for(int i=0; i<n; i++){
            if(D.x[i]==D.punto){
                der=(((D.y[i+1])-(2*D.y[i]))+(D.y[i-1]))/(((D.x[1])-(D.x[0]))*((D.x[1])-(D.x[0])));
            }   
        }
        return der;
    }
}
