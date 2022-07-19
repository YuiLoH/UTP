package bleh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Triv {

	/*public int[] punto= new int[10];
	public String[] pregunta= new String[10];
	public String[][] posible= new String[10][4];
	public String[] clave= new String[10];
	*/
	public int [] punto={5,10,15,20,25,30,35,40,45,50};
    public String[][] posible={{"1492","1512","1903", "2016"}, {"Aguadulce","Penonome","Anton","Nata"},{"600","6","60","6000"},{"Costa Rica","Colombia","Mar Pacifico","Mar Caribe"},{"1","5","3","6"},{"78","58","68","48"},{"Norte","Sur","Este","Oeste"},{"Vasco Nu~ez de Balboa","Rodrigo de Bastidas","Diego de Nicuesa","Cristobal Colon"},{"1519","1529","1512","1509"},{"Cristobal Colon","Vasco Nu~ez de Balboa","Rodrigo de Bastidas","Diego de Nicuesa"}};
    public String[] clave={"a","b","c","d","b","a","c","b","a","b"};
    public String[] pregunta={"¿A~o en que se descubre America?","¿Cual es la cabecera de la provincia de Cocle?","¿Cual es raiz cuadrada de 3600?","¿Panama limita al norte con?","¿Cantidad de Comarcas Indigenas que tiene Panama?","¿Cuantos distritos tiene la provincia de Panama?","¿Panama limita con Colombia al?","¿El Istmo de Panama fue visitado por primera vez por?","¿A~o en que fue fundada la ciudad de Panama?","¿Fue el primer europeo en divisar el Oceano Pacifico?"};
    
	
	private static String[] letras={"a","b","c","d"};
	public int[][] prgdone= new int[5][10];
	
    private static int top=10;
    private static int jugador=-1;
    private static int[] puntaje=new int[5];
    private static String[] usuario=new String[5];
    public int e, v, a, mnu, c=0, resp2=0, def=0;
    
   public void config(){
       Scanner sc=new Scanner(System.in);
       //Triv pt= new Triv();
       int resp3,num,i;
       while(resp2!=5){
       System.out.println("\tConfiguracion\n1. Ingresar Preguntas\n2. Modificar\n3. Eliminar\n4. Default Questions\n5. Regresar al Menu Principal ");
       resp2=sc.nextInt();
       sc.nextLine();
       		if (resp2==1) {
       			e=0;
				while (e<10) {
					System.out.println("\nIngrese la pregunta " +(e+1));
					pregunta[e]=sc.nextLine();
					
					if (e>0) {	
						v=0;
						do {
							for (a=0;a<e;a++) {
								if (pregunta[e].equals(pregunta[a])) {
									v=0;
									System.out.println("Esta pregunta ya existe! Introduzca otro pregunta: ");
									pregunta[e]=sc.nextLine();
								}
								else {
									v=1;
								}
							}
						}while (v==0);
					}
					
					System.out.println("Ingrese las posibles respuestas: ");
					for (a=0; a<4; a++) {
					System.out.println("Opcion "+letras[a]);
					posible[e][a]=sc.nextLine();
					}
					
					System.out.println("Ingrese la letra de la respuesta correcta: ");
					clave[e]=sc.nextLine();
					
					System.out.println("Ingrese el puntaje de la respuesta correcta: ");
					punto[e]=sc.nextInt();
					sc.nextLine();
					e=e+1;
				}
				def=1;
       		}
       		
            if(resp2==2){
            	if(pregunta[0]==null || def==0) {
            		System.out.println("\nNo has ingresado preguntas.\n");
            	}
            	else {
	                System.out.println("Numero de pregunta que desea modificar: (1-10)");
	                resp3=sc.nextInt();
	                sc.nextLine();
	                
	                 System.out.println("Ingrese la pregunta modificada:");
	                 pregunta[resp3-1]=sc.nextLine();
	                 
	                  System.out.println("Ingrese las posibles respuestas:");
	                  for( i=0;i<4;i++){
	                	  System.out.println("Opcion "+letras[i]);
	                	  posible[resp3-1][i]=sc.nextLine();
	                  }
	                  
	                  System.out.println("Ingrese la letra de la respuesta correcta:");
	                  clave[resp3-1]=sc.nextLine();
	                  
	                  System.out.println("Ingrese el puntaje de la respuesta correcta:");
	                  punto[resp3-1]=sc.nextInt();
	                  sc.nextLine();
            	}
            }
            
            if(resp2==3){
            	if(pregunta[0]==null || def==0) {
            		System.out.println("\nNo has ingresado preguntas.\n");
            	}
            	
            	else {
	                System.out.println("Ingrese el numero de pregunta que desea eliminar: (1-10)");
	                num=sc.nextInt();
	                sc.nextLine();
	                
	                if(top==0) System.out.println("No hay mas preguntas para eliminar.");
	                
	                else {
	                    //for(i=(num-1);i<top;i++){
		                      	/*pregunta[i]=pregunta[i+1];
		                        posible[i]=posible[i+1];
		                        clave[i]=clave[i+1];
		                        punto[i]=punto[i+1];*/
	                        	pregunta[num-1]=null; 
	                    //}
	                    top--;
	                } 
            	}
            }
            
            if (resp2==4) {
				System.out.println("\nHemos preparado unas preguntas para ti! Diviertete!\n");
				def=1;
            }
            
            if(resp2>5) System.out.println("Opcion No Valida!!\n****************************************************");     
       }
   }
   
   
    public void juego(){
        int i, puntoacum=0, num;
        String temp,ans;
        char sino='s';
        Scanner sc=new Scanner(System.in);
        	
        if (pregunta[0]==null || def==0) {
			System.out.println("\n\nNo puedes jugar sin tus preguntas! Ingresalas.\n\n");
		}
        
        else {
	        System.out.println("Ingrese el nombre de usuario:");
	        temp=sc.nextLine();
	        jugador++; 
	        do {
	        System.out.println("***BIENVENIDO "+temp+"***");
	        System.out.println("\n1. Jugar\n2. Salir");
	        mnu=sc.nextInt();
	        sc.nextLine();
	        
		      switch (mnu) {
		      case 1:
			        if(jugador<5){
			        usuario[jugador]=temp;
			        }
//			        else{jugador=5;
//			            for(i=0;i<5;i++){
//			                if(i<4){
//			                    usuario[i]=usuario[i+1];
//			                    puntaje[i]=puntaje[i+1];
//			                }
//			                if(i==4){
//			                    usuario[i]=temp;
//			                    puntaje[i]=puntoacum;
//			                }
//			            }
//			        }
			       if (sino=='n' || prgdone[jugador][top-1]!='\0') {
			    	   System.out.println("\nTu partida ha terminado! Puedes consultar tu puntaje en Consulta!\n\n");
			       }
			       else {
				       while (sino=='s'){
					       for( i=0;i<10;i++){
						       if (pregunta[i]==null) {
						    	   System.out.println((i+1)+" Esta pregunta fue eliminada del juego.");
						       }
					    	   else {
						           System.out.println((i+1)+" "+pregunta[i]);
						       }
					       }
					       System.out.println("\nElije el numero de pregunta que deseas responder:");
					       num=sc.nextInt();
					       sc.nextLine();
					       
					       if (pregunta[num-1]==null) {
					    	   System.out.println("No puedes responder esta pregunta! Escoge otra.\n\n");
					    	   v=1;
					    	   sino='s';
					       }
					       else {
						   for (i=0;i<10;i++) {
						    	   
						    	if (prgdone[jugador][i]==num) {
						    		System.out.println("No puedes responder esta pregunta! Escoge otra.\n\n");
						    		   v=1;
						    		   sino='s';
						    		   break;
						    	   }
						    	   else {
						    		   v=0;
						    	   }
						       }
					       }
				
					       if (v!=1) {
					    	   prgdone[jugador][c]=num;
						       System.out.println("\n\n\n\n\n"+pregunta[num-1]);
						       System.out.println("a. "+posible[num-1][0]);
						       System.out.println("b. "+posible[num-1][1]);
						       System.out.println("c. "+posible[num-1][2]);
						       System.out.println("d. "+posible[num-1][3]);
						       System.out.println("\n\nSeleccione su respuesta: ");
						       ans=sc.nextLine();
						       if(ans.equals(clave[num-1])) {
						    	   puntoacum=puntoacum+punto[num-1];
						    	   System.out.println("Respuesta correcta! Obtuvistes "+punto[num-1]+" puntos!\n\n");
						    	   System.out.println("Tu puntaje acumulado es "+puntoacum+"!\n\n");
						       }
						       else {
						    	   System.out.println("Oh no, respuesta incorrecta! La respuesta correcta era "+clave[num-1]+". No obtienes puntos.\n\n");
						    	   System.out.println("Tu puntaje acumulado es "+puntoacum+"\n\n");
						       }
						       
						       System.out.println("Desea continuar? s/n");
						       sino=sc.nextLine().charAt(0);
						       c=c+1;
					       }
					       
					       if (prgdone[jugador][top-1]!='\0') {
					    	   System.out.println("\nRespondistes todas las preguntas! Mira tu puntaje en Consulta!\n");
					    	   c=0;
					    	   break;
					       }
				       }
				       puntaje[jugador]=puntoacum;
			       }
			    }
	        }while(mnu!=2);
        }
    }
    
    
    public void consult(){
        int i;
        System.out.println("\tConsulta");
        if (jugador==-1) {
       	 System.out.println("No hay registro de jugadores.\n\n"); 
        }
        else {
          try {
           FileWriter out = new FileWriter("out.txt");
           for(int j=0; j<=jugador; j++) {
             out.write(usuario[j]);
             out.write(" ");
             out.write(Integer.toString(puntaje[j]));
             out.write(" \n");
           }
           out.close();
         } catch (IOException e) {
           System.out.println("Sugar-Honey-Iced-Tea! Couldn't print!");
         }
          
       	 System.out.println("Usuario: "+usuario[0]+"\tPuntaje: "+puntaje[0]);
		    if (jugador>0) {
       	 	for(i=1;i<=jugador;i++){
		        	System.out.println("Usuario: "+usuario[i]+"\tPuntaje: "+puntaje[i]);
		         }
		       }
		     System.out.println("\n\n\n");
       }
    }
     
   
    public static void main(String[] args) {
        Triv pt=new Triv();
        Scanner sc=new Scanner(System.in);
        
       int resp=0;
       while(resp!=4){
       System.out.println("\t*******************\n\t* Juego de Trivia *\n\t*******************\n\n1. Configuracion\n2. Juego\n3. Consulta de Puntaje Obtenido\n4. Salir");
       resp=sc.nextInt();
       if (resp==1) pt.config();
       if(resp==2) pt.juego();
       if(resp==3) pt.consult();
       if(resp==4) {System.out.println("\n");}
       if(resp>4) System.out.println("Opcion No Valida!!\n****************************************************");
       }
    }
    
}
