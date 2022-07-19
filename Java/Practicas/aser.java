package bleh;
import java.util.Scanner;
public class aser {
    
    public double ciudad(){
        int vt,i,vn,j,vc;
        double sumciu=0,sumtie=0;
        aser pt=new aser();
        Scanner sc=new Scanner(System.in);
            System.out.println("ingrese la cantidad de ciudades");
            vc=sc.nextInt();
            for (i=0;i<vc;i++) {
            System.out.println("ingrese la cantidad de tienda de ciudad "+(i+1));
            vt=sc.nextInt();
            sumtie=pt.tienda(vt);
            System.out.println("la venta de tienda de ciudad "+sumtie);
            sumciu=sumciu+sumtie; 
           }
       return sumciu;
    }
    
       public double tienda(int vt){
           int i,vn,j,ve;
           double sumn=0,sumt=0,pe,pt;
            Scanner sc=new Scanner(System.in);
           for (j=0;j<vt;j++){
            System.out.println("ingrese la cantidad de empleados de la tienda"+(j+1));
            ve=sc.nextInt();
            for (i=0;i<ve;i++) {
            System.out.println("ingrese la venta de empleado "+(i+1));
             pe=sc.nextDouble();
           sumn=sumn+pe;
            }
            System.out.println("la venta de tienda"+sumn);
            sumt=sumt+sumn;
       }
       return sumt;  
       }
    
    public static void main(String[] args) {
       double total;
       Scanner sc=new Scanner(System.in);
       aser pt=new aser();
       total=pt.ciudad();
       System.out.println("la cadena total: "+total);
    }
    
}
