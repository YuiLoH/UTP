package bleh;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

class Agent {
	  double iniciotmp;
	  double fintmp;
	  int actClient;
	  
	  ArrayList<Integer> clientnum;
	  ArrayList<Double> tiempos;
	  
	  Agent() {
	    iniciotmp = -1;
	    fintmp = -1;
	    actClient = -1;
	    
	    clientnum = new ArrayList<Integer>();
	    tiempos = new ArrayList<Double>();
	  }
	  
	  int clientesServidos() { 
		  return clientnum.size(); 
	  }
	  
	  void ClienteyTiempo() {
	    System.out.println("Lista de Clientes y Tiempos\n");
	    for(int i=0; i< clientnum.size(); i++) {
	      System.out.print("Numero de clientes:\t" + (clientnum.get(i)+1) + "\nTiempo de atencion:\t" + tiempos.get(i)/1000 + "s\n");
	    }
	  }
	  
	  int sig(int c) {
	    if(actClient != -1) {
	      System.out.println("Este agente esta ocupado. Espera a que este disponible o elija otro.\n");
	      return 0;
	    }
	    actClient = c;
	    return 1;
	  }
	  
	  void inicio() {
	    if(actClient == -1) { 
	    	System.out.println("Este agente no tenia cliente. No puedes iniciar su tiempo.\n"); 
	    	return; 
	    }
	    if(iniciotmp != -1) { 
	    	System.out.println("El agente ya ha iniciado el tiempo.\n"); 
	    	return; 
	    }
	    
	    iniciotmp = System.currentTimeMillis();
	  }
	  
	  void fin() {
	    if(actClient == -1) { 
	    	System.out.println("Este agente no tenia cliente. No puedes terminar su tiempo.\n"); 
	    	return; 
	    }
	    if(iniciotmp == -1) { 
	    	System.out.println("El agente no ha iniciado el tiempo.\n"); 
	    	return; 
	    }
	    
	    fintmp = System.currentTimeMillis() - iniciotmp;
	    clientnum.add(actClient);
	    tiempos.add(fintmp);
	    
	    iniciotmp = -1;
	    fintmp = -1;
	    actClient = -1;
	  }
	}

public class DIGICLARE_sys {
  private int cnt=0;
  Agent a1, a2, a3, act; 
  Queue<Integer> clientes; 
  int client;
  String[] services = {"Telefono Fijo", "Telefono Movil", "Cable", "Internet"};
  int [] requests; 
  
  DIGICLARE_sys() {
    a1 = new Agent();
    a2 = new Agent();
    a3 = new Agent();
    act = null;
    
    client = 0;
    
    clientes = new LinkedList<Integer>();
    requests = new int [4];
    
    for(int i=0; i<4; i++) { 
    	requests[i]=0; 
    }
  }
  
  public static void main(String[] args) {
    DIGICLARE_sys d = new DIGICLARE_sys();
    Scanner sc=new Scanner(System.in);
    
    int opc = 0;
   
    while(opc != 7) {
      System.out.println("\t    DIGICLARE\n\n1. Añadir cliente a la fila de espera\n2. Siguiente cliente en la fila\n3. Total de clientes atendidos\n4. Clientes atendidos por agente\n5. Servicio mas solicitado\n6. Agentes\n7. Salir\n");
      opc = sc.nextInt();
      
      switch(opc) {
      case 1:
        d.addClient();
        break;
      case 2:
        d.sigClient();
        break;
      case 3:
        d.servicio(); 
        break;
      case 4:
        d.getServicio();
        break;
      case 5:
        d.top();
        break;
      case 6:
        d.escAgent();
        break;
      }
    }
  }
  
  void escAgent() {
	Scanner sc=new Scanner(System.in);
	
    int opc = 0;
    
    while(opc != 4) {
      System.out.println("Que agente atendera?\n1. Agente 1\n2. Agente 2\n3. Agente 3\n4. Volver atras");
      opc = sc.nextInt();
      
      switch(opc) {
        case 1:
          act = a1;
          agentMenu();
          break;
        case 2:
          act = a2;
          agentMenu();
          break;
        case 3: 
          act = a3;
          agentMenu();
          break;
      }
    }
  }
  
  void agentMenu() {
	Scanner sc=new Scanner(System.in);
	
    int opc = 0;

    while(opc != 5) {
      System.out.println("Agente, que desea hacer:\n1. Llamar un cliente\n2. Iniciar tiempo\n3. Detener tiempo\n4. Clientes atendidos por este agente\n5. Volver atras");
      opc = sc.nextInt();
      
      switch(opc) {
      case 1:
        if(clientes.size() == 0) {
          System.out.println("No hay clientes en fila.\n");
        }
        else {
          if(act.sig(clientes.peek()) == 1) {
            clientes.remove();
            cnt = cnt-1;
          }
        }
        break;
      case 2:
        act.inicio();
        break;
      case 3:
        act.fin();
        break;
      case 4:
        act.ClienteyTiempo();
        break;  
      }
    }
  }
  
  void top() {
    int max = -1;
    
    for(int i=0; i<4; i++) {
      if(requests[i] > max) {
        max = requests[i];
      }
    }
    
    for(int i=0; i<4; i++) {
      if(requests[i] == max) {
        System.out.println("El servicio de '" + services[i] + "' tuvo " + max + " solicitudes.\n");
      }
    }
  }
  
  void getServicio() {
    System.out.println("" + a1.clientesServidos() + " clientes fueron atendidos por el agente 1.");
    System.out.println("" + a2.clientesServidos() + " clientes fueron atendidos por el agente 2.");
    System.out.println("" + a3.clientesServidos() + " clientes fueron atendidos por el agente 3.");
   
  }
  
  void servicio() {
    int served = 0;
    served = served + a1.clientesServidos();
    served = served + a2.clientesServidos();
    served = served + a3.clientesServidos();
    System.out.println("Han sido atendidos " + served + " clientes en total.\n");
  }
  
  void sigClient() {
    if(clientes.size() == 0) {
      System.out.println("No hay clientes por atender.\n");
    }
    else {
      System.out.println("El siguiente cliente es el numero " + (clientes.peek()+1) + ".\n");
    }
  }
  
  void addClient() {
	Scanner sc=new Scanner(System.in);
	
	int opc = 0;
    
    while(opc != 5) {
      System.out.println("Nuevo Cliente! Que servicio desea?\n1. Telefonia Fija\n2. Telefonia Movil\n3. Servicios de Cable\n4. Servicios de Internet\n5. No deseo ningun servicio.\n");
      opc = sc.nextInt();
      
      switch(opc) {
      case 1:
        requests[0]++;
        clientes.add(client++);
        cnt++;
        System.out.println("Hay " + cnt + " clientes en la fila de espera.");
        return;
      case 2:
        requests[1]++;
        clientes.add(client++);
        cnt++;
        System.out.println("Hay " + cnt + " clientes en la fila de espera.");
        return;
      case 3:
        requests[2]++;
        clientes.add(client++);
        cnt++;
        System.out.println("Hay " + cnt + " clientes en la fila de espera.");
        return;
      case 4:
        requests[3]++;
        clientes.add(client++);
        cnt++;
        System.out.println("Hay " + " clientes en la fila de espera.");
        return; 
      }
    }
  }
}
