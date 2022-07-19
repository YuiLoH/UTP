package bleh;

import java.util.Scanner;
public class spa {
    private int tipo,edad;
    public void fijarvalor(int vedad, int vtipo){
        tipo=vtipo;
        edad=vedad;
    }
    public double op(){
        double prec=0;
        if (tipo==1){
            prec=700;
            if (edad>60) prec=700-(700/100*25);
            if (edad<25) prec=700-(700/100*15);
        }
        if(tipo==2){
            prec=850;
            if (edad>60) prec=850-(850/100*25);
            if (edad<25) prec=850-(850/100*15);
            
        }
        if (tipo==3){
            prec=1500;
            if (edad>60) prec=1500-(1500/100*25);
            if (edad<25) prec=1500-(1500/100*15);           
        }
        if (tipo==4){
            prec=1800;
            if (edad>60) prec=1800-(1800/100*25);
            if (edad<25) prec=1800-(1800/100*15);
        }
        return prec;
    }
    public static void main(String[] args){
        int vedad,vtipo;
        double precio;
        spa pt=new spa();
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese su edad:");
        vedad=sc.nextInt();
        System.out.println("ingrese el tipo de tratamiento");
        vtipo=sc.nextInt();
        pt.fijarvalor(vedad, vtipo);
        precio=pt.op();
        System.out.println("el precio con descuento es de: "+precio);
        sc.close();
    }
    
}

