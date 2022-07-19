package bleh;

import java.util.Scanner;

public class transport {
	
	public void transport() {
	Scanner sc=new Scanner(System.in);
	String[][] tabla=new String[5][9];
	int a, e, temp, menu, sum, sum1=0, tb=0, sueld;
	double total, acum=0;
	do {
	System.out.println("1. Ingresar los datos \n2. Total de horas trabajadas \n3. Sueldo semanal de cada trabajador \n4. Total que pagara la empresa\n5. Nombre del trabajador que mas labaro el lunes\n6. Tabla completa");
	menu=sc.nextInt();
	sc.nextLine();
	
	switch (menu) {
	case 1:
		for (a=0; a<5; a++) {
		temp=0;
		sum=0; 
		sueld=0; 
		total=0;
		System.out.println("Ingrese el nombre del trabajador "+(a+1));
		tabla[a][0]=sc.nextLine();
		
		
		for (e=1; e<6; e++) {
			System.out.println("Ingrese las horas trabajadas del dia " +(e));
			tabla[a][e]=sc.nextLine();
			temp=Integer.parseInt(tabla[a][e]);
			sum = sum + temp;
			if (e==1 && temp>sum) {
				tb=a;
			}
		} 
		tabla[a][7]= Integer.toString(sum);
		
		System.out.println("Ingrese su sueldo por hora:");
		tabla[a][6]=sc.nextLine();
		sueld=Integer.parseInt(tabla[a][e]);
		total= sueld*sum;
		acum= acum +total;
		tabla[a][8]= Double.toString(total);
	}
	break;
	case 2:
		for (a=0; a<5; a++) {
			System.out.println("Las horas trabajadas del trabajador " +(a+1));
			System.out.println(" " +tabla[a][7]);
		}
	break;
	case 3:
		for (a=0; a<5; a++) {
			System.out.println("Sueldo semanal del trabajador " +(a+1));
			System.out.println(" " +tabla[a][8]);
		}
	break;
	case 4:
		System.out.println("Total que pagara la empresa:" +acum);
	break;
	case 5: 
		System.out.println("El trabajador que mas trabajo el lunes fue el trabajor " +(tb+1)+": "+tabla[tb][0]);
		System.out.println(" con " +tabla[tb][1]+ " horas");
	break;
	case 6:
		for (a=0; a<5; a++) {
			for (e=0; e<9; e++) {
				System.out.print(tabla[a][e]+" ");
		}
			System.out.print("\n");
		}
	break;
	}
	} while (menu>0 && menu<7);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		transport tp=new transport();
		tp.transport();
}
}
