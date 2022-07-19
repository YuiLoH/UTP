package bleh;
import java.util.Scanner;
public class park {
	private int A, MR=0, JR=0, NR=0, MN=0, NN=0, JN=0, T=0;
	private double tot=0, tot1=0;
	public void resident(int A, int i) {
		double precio1=0, precio2=0, precio3=0;
		if (A < 13) {
		precio1= 25-(25*0.1);
		MR= MR+1;
		}
		else if (A > 50) {
		precio2= 25-(25*0.1);
		JR=JR+1;
		}
		else if ((A>13)&& (A<50)) {
		precio3= 25;
		NR=NR+1;
		}
		
		tot= precio1+precio2+precio3;
		
	}
	public void nresident(int A, int i) {
		double pr1=0, pr2=0, pr3=0;
		if (A < 13) {
		pr1= 25-(25*0.1)+(25*0.15);
		MN= MN+1;
		}
		else if (A > 50) {
		pr2= 25-(25*0.1)+(25*0.15);
		JN=JN+1;
		}
		else if ((A>13)&& (A<50)) {
		pr3= 25+(25*0.15);
		NN=NN+1;
		}
		
		tot1= pr1+pr2+pr3;
		
		if (i==9) {
		T=NN+MN+JN;
		}
	}
	public static void main(String[] args) {
		int edad, i;
		double monto;
		char resp;
        Scanner sc= new Scanner(System.in);
        park pk= new park();
        
        for (i=0; i<10; i++) {
        System.out.println("Ingrese su edad: ");
        edad=sc.nextInt();
        System.out.println("¿Es usted residente? 's' o 'n'.");
        resp=sc.next().charAt(0);
       
        if (resp == 's')
        	pk.resident(edad, i);
        else if (resp == 'n')
        	pk.nresident(edad, i);

        i=i+1;
	   }
       
        System.out.println("Los residente menores 13 son: "+pk.MR);
        System.out.println("Los residentes jubilados son: "+pk.JR);
        System.out.println("Los extranjeros son: "+pk.T);
        System.out.println("El monto de residentes es: "+pk.tot);
        System.out.println("El monto de los extranjeros es: "+pk.tot1);

	}
}
