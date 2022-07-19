package pa1;
import java.util.Scanner;
public class poliza {
	private int edad,p1,p2,p3;
	public void fijarvalor(int vedad,int vp1, int vp2,int vp3){
		edad=vedad;
		p1=vp1;
		p2=vp2;
		p3=vp3;
	}

	public double ope(int plan){
		double costo=0;
		if (plan==1){
			if(edad>40){ costo=450+(450/100*20);
			if(p1==1) costo=costo+(costo/100*10);
			if(p2==1) costo=costo+(costo/100*5);
			if(p3==1) costo=costo+(costo/100*5);}
			if(edad<40){ costo=450+(450/100*10);
			if(p1==1) costo=costo+(costo/100*10);
			if(p2==1) costo=costo+(costo/100*5);
			if(p3==1) costo=costo+(costo/100*5);}
			}
		
		if(plan==2){
			if(edad>40){ costo=150+(150/100*20);
			if(p1==1) costo=costo+(costo/100*10);
			if(p2==1) costo=costo+(costo/100*5);
			if(p3==1) costo=costo+(costo/100*5);}
			if(edad<40){ costo=150+(150/100*10);
			if(p1==1) costo=costo+(costo/100*10);
			if(p2==1) costo=costo+(costo/100*5);
			if(p3==1) costo=costo+(costo/100*5);}
		}
		return costo;
		
	}
	public static void main(String[] args) {
		int vedad,vp1,vp2,vp3,plan;
		double costo;
		poliza pt= new poliza();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.plan A\n2.plan B");
		plan=sc.nextInt();
		System.out.println("ingrese su edad:");
		vedad=sc.nextInt();
		System.out.println("eres alcoholico?\n1.si\n2.no");
		vp1=sc.nextInt();
		System.out.println("usa lente?\n1.si\n2.no");
		vp2=sc.nextInt();
		System.out.println("tienes algun enfermedad?\n1.si\n2.no");
		vp3=sc.nextInt();
		pt.fijarvalor(vedad,vp1,vp2,vp3);
		costo=pt.ope(plan);
		System.out.println("el costo total es:"+costo);
		sc.close();
	}

}
