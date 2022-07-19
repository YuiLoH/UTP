package bleh;
import java.util.Scanner;
public class asig2 {
    private double sueldo;
    public void fijarvalor(double vsueldo){
        sueldo=vsueldo;
    }
    public void proce(String nom){
        double ns;
        if(sueldo<1000) {ns=sueldo+(sueldo/100*15);
        System.out.println("nombre:"+nom+ "\nel nuevo sueldo es:"+ns);
        }
        else System.out.println("no hay aumento.");
      
    }
    public static void main(String[] args) {
        double vsueldo,ns;
        String nom;
        asig2 pt= new asig2();
        Scanner sc=new Scanner(System.in);
       System.out.println("ingrese su nombre:");
       nom=sc.nextLine();
       System.out.println("ingrese su sueldo:");
       vsueldo=sc.nextDouble();
       pt.fijarvalor(vsueldo);
       pt.proce(nom);
       sc.close();
    }
}
