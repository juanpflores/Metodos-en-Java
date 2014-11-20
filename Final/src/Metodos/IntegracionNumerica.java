package Metodos;

public class IntegracionNumerica {
    private double a;//limite inferior
    private double b; //limite superior
    private int n;//Particiones
    private double h;//(b-a)/h
    private double integral;//Resultado de la integral
    
    //Constructor
    public IntegracionNumerica(double a, double b, int n){
        System.out.println("-----------------------------------------------");
        System.out.println("*******    Metodo Integracion Numerica   ******");
        System.out.println("-----------------------------------------------");
        this.a=a;
        this.b=b;
        this.n=n;
        this.h=(b-a)/n;
    }
    
    
    public static double f(double x)//funcion a integrar
    {
        return 4*Math.pow(x, 3)+2*Math.pow(x, 2)+3;
    }
    
    public static double sumaPar(double a, double n,double h)
    {
        double s=0;
        for(int i = 2 ; i<=(n-2); i+=2) {
            s+=f(a+h*i);
        }
        return s;
    }
    
    public static double sumaImpar(double a, double n,double h)
    {
        double s=0;
        for(int i = 1 ; i<=(n-1); i+=2) {
            s+=f(a+h*i);
        }
        return s;
    }
    
    public double integral()
    {
        return (this.h)/3*(f(this.a)+
                4*sumaImpar(this.a,this.n,this.h)+
                2*sumaPar(this.a,this.n,this.h)+
                f(this.b));
    }
}
