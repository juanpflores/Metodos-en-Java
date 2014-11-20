package Metodos;
public class DerivacionNumerica{
    
    double x[]=new double[10];
    double y[]=new double[10];
    double punto;
    
    public double[] Derivacion(double x1,double x2, double x3, double x4,double x5,
         double y5, double y4, double y3, double y2, double y1, double it){
        
        System.out.println("\n\n---------------------------------------------");
        System.out.println("*******   Metodo Derivacion Numerica   ******");
        System.out.println("---------------------------------------------");
        DerivacionNumerica D=new DerivacionNumerica();
        int n=5;
        
                D.x[0]=x1;
                D.x[1]=x2;
                D.x[2]=x3;
                D.x[3]=x4;
                D.x[4]=x5;
                
                D.y[0]=y1;
                D.y[1]=y2;
                D.y[2]=y3;
                D.y[3]=y4;
                D.y[4]=y5;
                
                D.punto=it;
       //Flag
       
       System.out.println("\nLa diferencia centrada es "+D.Centrada(D, n)+"");
       System.out.println("La diferencia Adelante es "+D.Adelante(D, n)+"");
       System.out.println("La diferencia Atras es "+D.Atras(D, n)+"");
       
       double[] ans={D.Centrada(D, n),D.Adelante(D, n),D.Atras(D, n)};
       return ans;
    }
    
        public double Centrada(DerivacionNumerica D, int n){
        double der=0;
        System.out.println(D.y[0]+" "+D.x[0]+"\n "+D.y[1]+" "+D.x[1]+"\n "+D.punto);
        for(int i=0; i<n; i++){
            if(D.x[i]==D.punto){
                der=(D.y[i+1]-D.y[i-1])/(2*(D.x[1]-D.x[0]));
                System.out.println(der);
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
    
    
}
