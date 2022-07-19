package bleh;
import java.util.Scanner;

public class montoadeudado {
    private double deuda, pago;
    public void fijarvalor(double vdeuda, double vpago){
        deuda=vdeuda;
        pago=vpago;
    }
    public void proce(){
        double x;
        if(pago==deuda) System.out.println("el monto aduedado:"+deuda+"\nel pago"+pago+"\nno debe");
        if(pago>deuda){
           x=pago-deuda;
           System.out.println("el monto aduedado:"+deuda+"\nel pago"+pago+"\nusted tiene un credito de:"+x);
        }
        if(pago<deuda){
            x=(deuda-pago)+(deuda-pago)/100*3;
            System.out.println("el monto aduedado:"+deuda+"\nel pago"+pago+"\nusted tiene un nuevo monto de:"+x);
        }
    }
    public static void main(String[] args){
        double vpago,vdeuda;
        montoadeudado pt= new montoadeudado();
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el monto adeudado:");
        vdeuda=sc.nextDouble();
        System.out.println("ingrese el pago de deuda:");
        vpago=sc.nextDouble();
        pt.fijarvalor(vdeuda, vpago);
        pt.proce();
        sc.close();
    }
}
