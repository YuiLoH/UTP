package pa1;
import java.util.Scanner;
public class hosp {
private double t1=25; double t2=16; double t3=20; double t4=32;
private int dia;int tipo;int edad;
	public void fijarvalor(int vdia,int vtipo, int vedad){
		dia=vdia;
		tipo=vtipo;
		edad=vedad;
	}
	public double ope(){
		double costo=0;
		if (tipo==1) costo=t1*dia;
		if (tipo==2) costo=t2*dia;
		if (tipo==3) costo=t3*dia;
		if (tipo==4) costo=t4*dia;
		if (edad>14 && edad <22) costo=costo+(costo/100*10);
		return costo;
	}
	
	public static void main(String[] args) {
		int vdia,vtipo,vedad;
		double costo;
		hosp pt=new hosp();
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese su edad:");
		vedad=sc.nextInt();
		System.out.println("ingrese el tipo de enfermedad:");
		vtipo=sc.nextInt();
		System.out.println("ingrese dias de ser operado:");
		vdia=sc.nextInt();
		pt.fijarvalor(vdia, vtipo, vedad);
		costo=pt.ope();
		System.out.println("el costo total es:"+costo);
		sc.close();
	}

}
