import java.util.Scanner;
public class trivia {
    private static int[] respondido=new int[10];
    private static int[] punto={5,10,15,20,25,30,35,40,45,50};
    private static String[] posible={"a) 1492\nb) 1512\nc) 1903\nd) 2016","a) Aguadulce\nb) Penonomé\nc) Antón\nd) Nata","a) 600\nb) 6\nc) 60\nd) 6000","a) Costa Rica\nb) Colombia\nc) Mar Pacífico\nd) Mar Caribe","a) 1\nb) 5\nc) 3\nd) 6","a) 78\nb) 58\nc) 68\nd) 48","a) Norte\nb) Sur\nc) Este\nd) Oeste","a) Vasco Núñez de Balboa\nb) Rodrigo de Bastidas\nc) Diego de Nicuesa\nd) Cristóbal Colón","a) 1519\nb) 1529\nc) 1512\nd) 1509","a) Cristóbal Colón\nb) Vasco Núñez de Balboa\nc) Rodrigo de Bastidas\nd) Diego de Nicuesa"};
    private static String[] clave={"a","b","c","d","b","a","c","b","a","b"};
    private static String[] pregunta={"¿Año en que se descubre América?","¿Cuál es la cabecera de la provincia de Coclé?","¿Cuál es raíz cuadrada de 3600?","¿Panamá limita al norte con?","¿Cantidad de Comarcas indígena que tiene Panamá?","¿Cuántos distritos tiene la provincia de Panamá?","¿Panamá limita con Colombia al?","¿El Istmo de Panamá fue visitado por primera vez por?","¿Año en que fue fundada la ciudad de Panamá?","¿Fue el primer europeo en divisar el océano Pacífico?"};
    private static int top=10;
    private static int jugador=0;
    private static int[] puntaje=new int[5];
    private static String[] usuario=new String[5];
   public void config(){
       Scanner sc=new Scanner(System.in);
       trivia pt= new trivia();
      int resp2=0,resp3,num,i;
      String temp;
       while(resp2!=3){
       System.out.println("\tconfiguración\n1.modificar\n2.eliminar\n3.regresar al menú principal");
       resp2=sc.nextInt();
            if(resp2==1){
                System.out.println("# de pregunta que desea modificar:");
                resp3=sc.nextInt();
                sc.nextLine();
                 System.out.println("ingrese la pregunta modificada:");
                 pregunta[resp3-1]=sc.nextLine();
                  System.out.println("ingrese 4 posible respustas:");
                  posible[resp3-1]=null;
                  for( i=0;i<4;i++){
                      temp=sc.nextLine();
                     if(i==0) posible[resp3-1]="a) "+temp;
                     if(i==1) posible[resp3-1]=posible[resp3-1]+"\nb) "+temp;
                     if(i==2) posible[resp3-1]=posible[resp3-1]+"\nc) "+temp;
                     if(i==3) posible[resp3-1]=posible[resp3-1]+"\nd) "+temp;
                  }
                  System.out.println("ingrese la letra de la respuesta correcta:");
                  clave[resp3-1]=sc.nextLine();
                  System.out.println("ingrese el puntaje de la pregunta:");
                  punto[resp3-1]=sc.nextInt();
            }
            if(resp2==2){
                System.out.println("ingrese el # de pregunta que desea eliminar:");
                num=sc.nextInt();
                if(top==0) System.out.println("no hay pregunta para eliminar");
                else {
                    for(i=(num-1);i<top;i++){
                        if(i<9){pregunta[i]=pregunta[i+1];
                        posible[i]=posible[i+1];
                        clave[i]=clave[i+1];
                        punto[i]=punto[i+1];
                        }
                        if(i==9){pregunta[i]="";
                        posible[i]="";
                        clave[i]="";
                        punto[i]=0;
                        }
                    }
                    top--;
                }
                
            }
            if(resp2>3) System.out.println("opcion no válido!!\n****************************************************");     
       }
   }
   
   
    public void juego(){
        int i,puntoacum=0,num;
        String temp,ans;
        char sino='s';
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el nombre de usuario:");
        temp=sc.nextLine();
        System.out.println("***BIENVENIDO "+temp+"***");
        if(jugador<5){
        usuario[jugador]=temp;
        }else{jugador=5;
            for(i=0;i<5;i++){
                if(i<4){
                    usuario[i]=usuario[i+1];
                    puntaje[i]=puntaje[i+1];
                }
                if(i==4){
                    usuario[i]=temp;
                    puntaje[i]=puntoacum;
                }
            }
        }
        while (sino=='s'){
       for( i=0;i<top;i++){
           System.out.println((i+1)+" "+pregunta[i]);
       }
       System.out.println("elije el # de pregunta:");
       num=sc.nextInt();
       sc.nextLine();
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+pregunta[num-1]+"\n"+posible[num-1]+"\n\nseleccione la letra correcta:");
       ans=sc.nextLine();
       if(ans.equals(clave[num-1])) puntoacum=puntoacum+punto[num-1];
       System.out.println("desea continuar? s/n");
       sino=sc.nextLine().charAt(0);
        }
        puntaje[jugador]=puntoacum;
     jugador++; 
   }
     public void consult(){
         int i;
         System.out.println("\tconsulta");
         for(i=0;i<5;i++){
        System.out.println("usuario: "+usuario[i]+"\tpuntaje: "+puntaje[i]);
         }
     }
   
    public static void main(String[] args) {
        trivia pt=new trivia();
        Scanner sc=new Scanner(System.in);
        
        //for(int i=0;i<10;i++) System.out.println(pregunta[i]);
        int resp=0;
       while(resp!=4){
       System.out.println("\t*******************\n\t* juego de trivia *\n\t*******************\n\n1.configuración\n2.juego\n3.consulta de puntaje obtenido\n4.salir");
       resp=sc.nextInt();
       if (resp==1) pt.config();
       if(resp==2) pt.juego();
       if(resp==3) pt.consult();
       if(resp==4) {System.out.println("\n");}
       if(resp>4) System.out.println("opcion no válido!!\n****************************************************");
       }
    }
    
}
