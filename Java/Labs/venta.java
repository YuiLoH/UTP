package bleh;
import java.util.Scanner;
public class venta {
public static void main(String[] args) {
	char vent='s';
	double precio;
	double p1=0,p2=0,p3=0,k1=0,k2=0,k3=0;
	 Scanner sc= new Scanner(System.in);
     venta vt= new venta();
     
	while (vent=='s') {
		System.out.println("precio de venta");
		precio=sc.nextDouble();
		if(precio<=500) {p1=p1+precio; k1=k1+1;}
		if(precio>500 && precio<=1000) {p2=p2+precio; k2=k2+1;}
		if(precio<1000) {p3=p3+precio; k3=k3+1;}
		System.out.println("hay mas venta? s/n");
		vent=sc.next().charAt(0);	
	}
	System.out.printf("cantidades menores igual 500: %d",k1,"montos: %f",p1);
	System.out.printf("cantidades mayores que 500 menores igual 1000: %d",k2,"montos: %f",p2);
	System.out.printf("cantidades menores que 1000: %d",k3,"montos: %f",p3);
	System.out.printf("monto global: %f",p1+p2+p3);
	
}


}
