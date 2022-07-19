package bleh;

import java.util.Scanner;
public class prom {
    private int x;
    
    public void fijarvalor(int vx){
        x=vx;    
    }
    public void proce() {
        int i,j;
        char letra='F';
        String nom;
        double notatotal=0,nota,prome;
        Scanner sc=new Scanner(System.in);
        for (i=0; i<x;i++){
            notatotal=0;
            System.out.printf("ingrese mombre de estudiante# %d:\n", i+1);
            if (i>0) sc.nextLine();
            nom=sc.nextLine();
            for(j=0;j<4;j++){
            System.out.printf("nota#%d:",j+1);
            nota=sc.nextDouble();
            notatotal=notatotal+nota;
            }
            prome=notatotal/4;
            if (prome>90 && prome<=100) letra='A';
            if (prome>80 && prome<=90) letra='B';
            if (prome>70 && prome<=80) letra='C';
            if (prome>60 && prome<=70) letra='D';
            if (prome<=60) letra='F';
            System.out.println("nombre:"+nom+"\npromedio: "+prome+"\nliteral: "+letra);
        }
    }
    public static void main(String[] args) {
       int vx;
       prom pt=new prom();
       Scanner sc=new Scanner(System.in);
       System.out.println("ingrese cantidad de estudiante:");
       vx=sc.nextInt();
       pt.fijarvalor(vx);
       pt.proce();
       
    }

}
