package bleh;

import java.util.Scanner;
public class diasmes {
    private int a,m;
    public void fijarvalor(int va,int vm){
        a=va;
        m=vm;
    }
    public int proce(int d){
       
        if (m==1||m==3||m==5||m==7||m==8||m==10||m==12) d=31;
        if (m==4||m==6||m==9||m==11) d=30;
        if(m==2){
            if(a%4==0&&(a%100!=0||a%400==0)) d=29;
            else d=28;
        }
        return d;
    }
    public static void main(String[] args){
        int va,vm,d=0;
        diasmes pt=new diasmes();
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el numero de mes:");
        vm=sc.nextInt();
        System.out.println("ingrese el año:");
        va=sc.nextInt();
       pt.fijarvalor(va, vm);
       d=pt.proce(d);
       if (vm==1)
       System.out.println("el mes de Enero del año "+va+" tiene "+d+" dias");
       else if (vm==2)
       System.out.println("el mes de Febrero del año "+va+" tiene "+d+" dias");
       else if (vm==3)
       System.out.println("el mes de Marzo del año "+va+" tiene "+d+" dias");
       else if (vm==4)
       System.out.println("el mes de Abril del año "+va+" tiene "+d+" dias");
       else if (vm==5)
       System.out.println("el mes de Mayo del año "+va+" tiene "+d+" dias");
       else if (vm==6)
       System.out.println("el mes de Junio del año "+va+" tiene "+d+" dias");
       else if (vm==7)
       System.out.println("el mes de Julio del año "+va+" tiene "+d+" dias");
       else if (vm==8)
       System.out.println("el mes de Agosto del año "+va+" tiene "+d+" dias");
       else if (vm==9)
       System.out.println("el mes de Septiembre del año "+va+" tiene "+d+" dias");
       else if (vm==10)
       System.out.println("el mes de Octubre del año "+va+" tiene "+d+" dias");
       else if (vm==11)
       System.out.println("el mes de Noviembre del año "+va+" tiene "+d+" dias");
       else if (vm==12)
       System.out.println("el mes de Diciembre del año "+va+" tiene "+d+" dias");
       sc.close();
       
    }
}
