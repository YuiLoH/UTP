package bleh;

import java.util.Scanner;
public class comp {
    private double[] tabla=new double[10];
    private static int apro=0;
    private static String numero="";
    void llenar(){
        int i;
        double tiemp;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.println("ingrese tiempo de nadador#"+(i+1));
            tiemp=sc.nextDouble();
            if (tiemp<=1.30) {
                apro=apro+1;
                numero=numero+(i+1)+",";
            }
            tabla[i]=tiemp;
        }
    }
    public double prome(double prom){
        int i;
        double tot=0;
        for(i=0;i<10;i++){
           tot=tot+tabla[i]; 
        }
        prom=tot/10;
        return prom;
    }
    public double porce(double porc){
        porc=apro*10;
        return porc;
    }
    public static void main(String[] args) {
        double min,prom=0,porc=0;
        
        comp pt=new comp();
        Scanner sc=new Scanner(System.in);
        pt.llenar();
        prom= pt.prome(prom);
        porc=pt.porce(porc);
        System.out.println("promedio general:"+prom);
        System.out.println("cantidades aprobado:"+apro+"\ncantidades reprobados:"+(10-apro));
        System.out.println("porcentaja de aprobado:"+porc+"%\nprocentaje reprobados:"+(100-porc)+"%");
        System.out.println("numero de nadadores cuyo tiempo es menor 1 minuti 30 segundo:"+numero);
    }
    
}
