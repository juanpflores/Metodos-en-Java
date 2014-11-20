package Metodos;

public class Biseccion{

   double a, b, tol, p;
   int ni;

   public double BiseccionM(){
       
      double raiz = this.calcularRaiz();
      System.out.println("\n--------------------------------------");
      System.out.println("\tLa raiz es: "+raiz);
      System.out.println("--------------------------------------");
      return raiz;
   }
   
   /******
   Constructor
   */
       public Biseccion(float a2, float b2, int ni2, float tol2){
         
         tol=tol2;
         a=a2;
         b=b2;
         ni=ni2;
         
      }
   

   /*Funci�n de la que se calcular� la ra�z*/
       private double f(double x){
        double r = x - Math.pow(2,-x);
      //  double r = 2*x*Math.cos(2*x) - (x + 1)*(x + 1);
      //  double r = x*Math.cos(x)-2*x*x + 3*x -1;
         return r;
      }
   
   
   /*Metodo private: calcularRaices*/
       public double calcularRaiz(){
           System.out.println("Entered");
         double p=a; 
         int i=1; 
         double eps=1;
      
         while(f(p)!=0 & i<=ni & eps>tol){
            double pa = p;
            p = (a+b)/2;
            if(f(p)*f(a)>0)
               a=p;
            else 
               if(f(p)*f(b)>0)
                  b=p;
            i = i + 1;
            eps = Math.abs(p-pa)/p;
         }
         return p;
      }
}