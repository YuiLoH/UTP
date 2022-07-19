package bleh;

import java.util.Scanner;
public class promed {
    
    public double promedio(double n1,double n2,double n3){
        double prom;
        prom=(n1+n2+n3)/3;
        return prom;
    }
    public String validar(double prom){
        String men;
        if (prom>60) men="aprobado";
        else men="reprobó";
        
        return men;
    }
    
    public static void main(String[] args){
        double n1,n2,n3,prom;
        String mensaje;
        promed pt=new promed();
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese nota1");
        n1=sc.nextDouble();
        System.out.println("ingrese nota2:");
        n2=sc.nextDouble();
        System.out.println("ingrese nota3:");
        n3=sc.nextDouble();
        prom=pt.promedio(n1, n2, n3);
        mensaje=pt.validar(prom);
        System.out.println("el promedio es: "+prom+"\n"+mensaje);
        sc.close();
        
    }
    
}
