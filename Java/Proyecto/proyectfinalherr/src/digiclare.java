import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class digiclare {
    public static int num,fija=0,movil=0,cable=0,inter=0,c1=0,c2=0,c3=0;
    public static ArrayList<String> ct=new ArrayList<>();
    public static ArrayList<Integer> nr=new ArrayList<>();
    public static ArrayList<String> ag1=new ArrayList<>();
    public static ArrayList<String> ag2=new ArrayList<>();
    public static ArrayList<String> ag3=new ArrayList<>();
    public static ArrayList<Integer> n1=new ArrayList<>();
    public static ArrayList<Integer> n2=new ArrayList<>();
    public static ArrayList<Integer> n3=new ArrayList<>();
    public static ArrayList<Double> t1=new ArrayList<>();
    public static ArrayList<Double> t2=new ArrayList<>();
    public static ArrayList<Double> t3=new ArrayList<>();
    public void nuevo(){
        String nom;
        num=num+1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nom=sc.nextLine();
        ct.add(nom);
        nr.add(num);
        
    }
    
   public void ope(){
       int resp,resp2,resp3,mayor;
       digiclare pt=new digiclare();
       Random r=new Random();
        Scanner sc=new Scanner(System.in);
        num=r.nextInt(99);
        do{
        System.out.println("**DIGICLARE**\n1.Nuevo cliente\n2.Agente\n3.Obtener informacion\n4.Salir");
        resp=sc.nextInt();
        while(resp<=0||resp>4){
            System.out.println("Opción no válido! Volver a intentar:");
            resp=sc.nextInt();
        }
        if(resp==1){
            pt.nuevo();
        }
        if(resp==2){
            pt.agente();
        }
        if(resp==3){
            do{
                System.out.println("_______________________________________________________\n");
            System.out.println("1.Cantidad de clientes en la cola\n2.Próximo cliente a ser atendido\n3.Cantidad de clientes antendidos\n4.Cantidad de clientes atendidos por cada agente\n5.Tiempo y clientes atendido de X agente\n6.Servicio con mayores solicitudes de atención\n7.Volver");
            resp2=sc.nextInt();
            while(resp<=0||resp>7){
            System.out.println("Opción no válido! Volver a intentar:");
            resp=sc.nextInt();
            }
            if(resp2==1){
                System.out.println("Actualmente se encuentra "+ct.size()+" personas en la fila.");
            }
            if(resp2==2){
                 if(ct.isEmpty()) System.out.println("no hay persona en la fila.");
                  else{
                System.out.println("El próximo cliente es: "+ct.get(0));
                 }
            }
            if(resp2==3){
                System.out.println("Cantidad de clientes total atendido son: "+(ag1.size()+ag2.size()+ag3.size()));
            }
            if(resp2==4){
                 System.out.println("Cantidad de clientes atendido por agente 1: "+ag1.size());
                 System.out.println("Cantidad de clientes atendido por agente 2: "+ag2.size());
                 System.out.println("Cantidad de clientes atendido por agente 3: "+ag3.size());
            }
            if(resp2==5){
                System.out.println("Cuál agente?\n1. Agente 1\n2. Agente 2\n3. Agente 3");
                resp3=sc.nextInt();
                while(resp3<=0||resp3>3){
            System.out.println("Opción no válido! Volver a intentar:");
            resp3=sc.nextInt();
            }
                if(resp3==1){
                    for(int i=0;i<ag1.size();i++){
                    System.out.println("Nombre: "+ag1.get(i)+" N° de cliente: "+n1.get(i)+" Tiempo: "+t1.get(i)+" segundos");
                    }
                }
                if(resp3==2){
                    for(int i=0;i<ag1.size();i++){
                    System.out.println("Nombre: "+ag2.get(i)+" N° de cliente: "+n2.get(i)+" Tiempo: "+t2.get(i)+" segundos");
                    }
                }
                if(resp3==3){
                   for(int i=0;i<ag1.size();i++){
                    System.out.println("Nombre: "+ag3.get(i)+" | N° de cliente: "+n3.get(i)+" | Tiempo: "+t3.get(i)+" segundos"); 
                            } 
                }
            }
            if(resp2==6){
                mayor=fija;
                if(movil>mayor) {
                    mayor=movil;
                    System.out.println("El servicio con mayor solicitud de atención es telefonía móvil, "+mayor+" cliente ecogió este servicio.");}
                if(cable>mayor) {
                    mayor=cable;
                    System.out.println("El servicio con mayor solicitud de atención es cable, "+mayor+" cliente ecogió este servicio.");}
                if(inter>mayor) {
                    mayor=inter;
                System.out.println("El servicio con mayor solicitud de atención es internet, "+mayor+" cliente ecogió este servicio.");}
                
                if(mayor==fija) System.out.println("El servicio con mayor solicitud de atención es telefonía fija, "+mayor+" cliente ecogió este servicio.");
            }
            
            }while(resp2!=7);
        }
        System.out.println("_______________________________________________________\n");
        }while(resp!=4);
   }
   public void agente(){
       int resp,resp2,serv;
        final double ns=1000000000;
        long inicio=0;
        long duracion;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("_______________________________________________________\n");
        System.out.println("***AGENTE***\n1.Agente 1\n2.Agente 2\n3.Agente 3\n4.Regresar");
         resp=sc.nextInt();
          while(resp<=0||resp>4){
            System.out.println("Opción no válido! Volver a intentar:");
            resp=sc.nextInt();
            }
          if(resp==1){
              System.out.println("***AGENTE 1***\n1.Siguiente\n2.Inicio\n3.Fin");
              resp2=sc.nextInt();
              while(resp2!=1){
            System.out.println("Opción no válido! Volver a intentar:");
            resp2=sc.nextInt();
            }
              if(resp2==1){
                  if(ct.isEmpty()) {System.out.println("no hay persona en la fila."); break;}
                  else{
                  ag1.add(ct.get(0));
                  n1.add(nr.get(0));
                  System.out.println("Entró "+ag1.get(c1));
                  ct.remove(0);
                  nr.remove(0);
                  c1++;
                  }
              }
              System.out.println("***AGENTE 1***\n1.Siguiente\n2.Inicio\n3.Fin");
              resp2=sc.nextInt();
              while(resp2!=2){
            System.out.println("Opción no válido! Volver a intentar:");
            resp2=sc.nextInt();
            }
                 inicio=System.nanoTime();
                 System.out.println("***AGENTE 1***\nCuál es el servicio que pidió el cliente?\n1.Telefonía fija\n2.Telefonía móvil\n3.Cable\n4.Internet");
                 serv=sc.nextInt();
                 if(serv==1) fija++;
                 if(serv==2) movil++;
                 if(serv==3) cable++;
                 if(serv==4) inter++;
                 System.out.println("***AGENTE 1***\n1.Siguiente\n2.Inicio\n3.Fin");
                 resp2=sc.nextInt();
                 while(resp2!=3){
            System.out.println("Opción no válido! Volver a intentar:");
            resp2=sc.nextInt();
              }
              if(resp2==3){
                  duracion=System.nanoTime()-inicio;
                  double tiempo=duracion/ns;
                  t1.add(tiempo);
              }
          }
          if(resp==2){
              System.out.println("***AGENTE 2***\n1.Siguiente\n2.Inicio\n3.Fin");
              resp2=sc.nextInt();
              while(resp2!=1){
            System.out.println("Opción no válido! Volver a intentar:");
            resp2=sc.nextInt();
            }
              if(resp2==1){
                  if(ct.isEmpty()) {System.out.println("no hay persona en la fila."); break;}
                  else{
                  ag2.add(ct.get(0));
                  n2.add(nr.get(0));
                  System.out.println("Entró "+ag2.get(c2));
                  ct.remove(0);
                  nr.remove(0);
                  c2++;
                  }
              }
              System.out.println("***AGENTE 2***\n1.Siguiente\n2.Inicio\n3.Fin");
              resp2=sc.nextInt();
              while(resp2!=2){
            System.out.println("Opción no válido! Volver a intentar:");
            resp2=sc.nextInt();
            }
                 inicio=System.nanoTime();
                 System.out.println("***AGENTE 2***\nCuál es el servicio que pidió el cliente?\n1.Telefonía fija\n2.Telefonía móvil\n3.Cable\n4.Internet");
                 serv=sc.nextInt();
                 if(serv==1) fija++;
                 if(serv==2) movil++;
                 if(serv==3) cable++;
                 if(serv==4) inter++;
                 System.out.println("***AGENTE 2***\n1.Siguiente\n2.Inicio\n3.Fin");
                 resp2=sc.nextInt();
                 while(resp2!=3){
            System.out.println("Opción no válido! Volver a intentar:");
            resp2=sc.nextInt();
            }
              
              if(resp2==3){
                  duracion=System.nanoTime()-inicio;
                  double tiempo=duracion/ns;
                  t2.add(tiempo);
              }
          }
          if(resp==3){
              System.out.println("***AGENTE 3***\n1.Siguiente\n2.Inicio\n3.Fin");
              resp2=sc.nextInt();
              while(resp2!=1){
            System.out.println("Opción no válido! Volver a intentar:");
            resp2=sc.nextInt();
            }
              if(resp2==1){
                  if(ct.isEmpty()) {System.out.println("no hay persona en la fila."); break;}
                  else{
                  ag3.add(ct.get(0));
                  n3.add(nr.get(0));
                  System.out.println("Entró "+ag3.get(c3));
                  ct.remove(0);
                  nr.remove(0);
                  c3++;
                  }
              }
              System.out.println("***AGENTE 3***\n1.Siguiente\n2.Inicio\n3.Fin");
              resp2=sc.nextInt();
              while(resp2!=2){
            System.out.println("Opción no válido! Volver a intentar:");
            resp2=sc.nextInt();
            }
                 inicio=System.nanoTime();
                 System.out.println("***AGENTE 3***\nCuál es el servicio que pidió el cliente?\n1.Telefonía fija\n2.Telefonía móvil\n3.Cable\n4.Internet");
                 serv=sc.nextInt();
                 if(serv==1) fija++;
                 if(serv==2) movil++;
                 if(serv==3) cable++;
                 if(serv==4) inter++;
                 System.out.println("***AGENTE 3***\n1.Siguiente\n2.Inicio\n3.Fin");
                 resp2=sc.nextInt();
                 while(resp2!=3){
            System.out.println("Opción no válido! Volver a intentar:");
            resp2=sc.nextInt();
            }
              
              if(resp2==3){
                  duracion=System.nanoTime()-inicio;
                  double tiempo=duracion/ns;
                  t3.add(tiempo);
              }
          }
        }while(resp!=4);
   }
    public static void main(String[] args) {
      digiclare pt=new digiclare();
      pt.ope();
    }
    
}
