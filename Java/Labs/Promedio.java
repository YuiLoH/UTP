package bleh;

import java.util.Scanner;

public class Promedio {
		public void prmdo() {
			int a, sum=0;
			double prom;
			int [ ] num =new int [20]; 
			Scanner sc=new Scanner(System.in);
			
			for (a=0; a<20; a++){
			System.out.println("Ingrese un numero: "); 
			num[a]=sc.nextInt();
			}
			for (a=1; a<20; a+=2){
			sum= sum + num[a];
			}
			prom = sum/10;
			sum=0;
			for (a=0; a<20; a+=2){
			sum= sum + num[a];
			}
			System.out.println("El promedio de las posiciones Pares es: " +prom);
			System.out.println("La sumatoria de las posiciones impares es: " +sum);
		}
	public static void main(String[] args) {
		Promedio pr=new Promedio();
		pr.prmdo();
	}
}