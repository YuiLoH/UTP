package bleh;

import java.util.Scanner;

public class cajero {
		private double M=0;
		public void artmon(double tot){
			M = tot + M;
		}

		public static void main(String[] args) {
		int client=1, a, f;
		double precio, total=0;
		char next;
		Scanner sc= new Scanner(System.in);
	    cajero cj= new cajero();
	    
		do {
		System.out.println("Cliente #" +client);
		System.out.println("Ingrese la cantidad de artículos que desea comprar:");
		a=sc.nextInt();
		
		for (f=0; f<a; f++) {
		System.out.println("Ingrese el precio del articulo:");
		precio=sc.nextDouble();
		total = precio + total;
		}
		System.out.println("Su total a pagar es " +total);
		cj.artmon(total);
		client = client +1;
		System.out.println("¿Siguiente cliente? 's' o 'n'.");
        next=sc.next().charAt(0);
		} while (next == 's');

		System.out.println("El total del dia de hoy ha sido: " +cj.M);
		}

}
