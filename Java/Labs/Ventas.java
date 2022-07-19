package bleh;
import java.util.Scanner;

public class Ventas {
    private double venta, v1=0, v2=0, v3=0, v4=0, tot;
    private int code;
    public void fijar (double ventas, double venta1, double venta2, double venta3, double venta4, int codigo){
        venta=ventas;
        code=codigo;
    }
    public void s(double venta){
        switch(code){
            case 1: 
                v1=venta+v1; //subtotal
                break;
            case 2: 
                v2=venta+v2;
                break;
            case 3: 
                v3=venta+v3;   
                break;
            case 4:
                v4=venta+v4;
                break;
            default:
                    break;
        }
    }
    public double t(int code){
        double tot=0;
        switch(code){
            case 1: 
                tot=v1+(0.07*v1);
                break;
            case 2:
                tot=v2+(0.07*v2);
                break;
            case 3:
                tot=v3+(0.07*v3);
                break;
            case 4:
                tot=v4+(0.07*v4);
                break;
            default:
                    break;
                
        }
        return tot;
    }
    public static void main(String[] args) {
        int codigo, i=1;
        double ventas,  venta1=0, venta2=0, venta3=0, venta4=0, total;
        char resp;
        Scanner sc= new Scanner(System.in);
        Ventas ven= new Ventas();
        
       do{
        System.out.println("¿Cual es el código de vendedor?");
        codigo=sc.nextInt();
        System.out.println("Ingrese su venta");
        ventas=sc.nextDouble();
        ven.fijar(ventas, venta1, venta2, venta3, venta4, codigo);
        ven.s(ventas);
        
           System.out.println("¿Desea ingresar otra venta?");
           resp=sc.next().charAt(0);
       }while(resp=='s' || resp=='S');
       
    do{ 
    total=0;
    total= ven.t(i);
    if (i==1){
        System.out.println("El subtotal de las ventas de Luis Morán es: "+ven.v1);
        System.out.println("El total de las ventas de Luis Morán es: "+total);
    }
    else if (i==2){
        System.out.println("El subtotal de las ventas de Maria Perez es: "+ven.v2);
        System.out.println("El total de las ventas de Maria Perez es: "+total);
    }
    else if (i==3){
        System.out.println("El subtotal de las ventas de Luisa Carrion es: "+ven.v3);
        System.out.println("El total de las ventas de Luisa Carrion es: "+total);
    }
    else if (i==4){
        System.out.println("El subtotal de las ventas de Juan Medina es: "+ven.v4);
        System.out.println("El total de las ventas de Juan Medina es: "+total);
    }
    i=i+1;
} while(i<=4);
    
    } 
}
