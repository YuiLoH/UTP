package bleh;
import java.util.Scanner;
public class tiendaventas {
	//Nombres: Alejandra Gonzalez, Yui Lo	Cedulas: 8-950-317, 8-929-854	1IL121 
	
	public boolean verifmes(String in) {
		boolean mes=true;
		if (in.equals("enero") || in.equals("Enero")){
			mes= true;
		}
		else if (in.equals("febrero") || in.equals("Febrero")){
			mes= true;
		}
		else if (in.equals("marzo") || in.equals("Marzo")){
			mes= true;
		}
		else if (in.equals("abril") || in.equals("Abril")){
			mes= true;
		}
		else if (in.equals("mayo") || in.equals("Mayo")){
			mes= true;
		}
		else if (in.equals("junio") || in.equals("Junio")){
			mes= true;
		}
		else if (in.equals("julio") || in.equals("Julio")){
			mes= true;
		}
		else if (in.equals("agosto") || in.equals("Agosto")){
			mes= true;
		}
		else if (in.equals("septiembre") || in.equals("Septiembre")){
			mes= true;
		}
		else if (in.equals("octubre") || in.equals("Octubre")){
			mes= true;
		}
		else if (in.equals("noviembre") || in.equals("Noviembre")){
			mes= true;
		}
		else if (in.equals("diciembre") || in.equals("Diciembre")){
			mes= true;
		}
		else {
			mes= false;
		}
		return mes;
		}
	
	public boolean verifint(String in) {
		  return in.matches(".*\\d.*");
		}
	
	public void tventas() {
	Scanner sc=new Scanner(System.in);	
	int menu, menu2, e, a, v=0, p, m, s=0, l=0;
	double sump, summ, promp, mas, menos;
	
	Double [][] ventas=new Double[4][6];
	String [] mes= new String[6];
	String [] produc=new String[4];
	
	do {
	System.out.println("\nEmperSA!");
	System.out.println("1. Productos\n2. Meses \n3. Ventas \n4. Ventas de Producto- primeros 3 meses\n5. Consultar Ventas de Mes\n6. Promedio de Ventas de Producto");
	System.out.println("7. Ventas Totales por Mes\n8. Consultar Ventas de Producto\n9. Producto mas vendido\n10. Producto menos vendido\n11. Producto por debajo del promedio \n12. Salir");
	menu=sc.nextInt();
	sc.nextLine();
	
		switch (menu) {
		
		case 1:
			do {
			System.out.println("\n1. Crear productos\n2. Modificar error \n3. Volver al menu principal");
			menu2=sc.nextInt();
			sc.nextLine();
			
				switch (menu2){
				case 1:
						if (produc[3]!=null) {
							System.out.println("Usted ya declaro sus productos. Solo puede modificarlos de ahora en adelante.");
						}
						else {
							e=0;
							while (e<4) {
								System.out.println("Ingrese el producto " +(e+1));
								produc[e]=sc.nextLine();
								
								while (verifint(produc[e]) == true) {
									  System.out.println("No estan permitidos los numeros. Ingrese un producto valido:");
									  produc[e] = sc.nextLine();
								}
								
								if (e>0) {	
									v=0;
									do {
										for (a=0;a<e;a++) {
											if (produc[e].equals(produc[a])) {
												v=0;
												System.out.println("Los productos no se pueden repetir. Introduzca otro producto: ");
												produc[e]=sc.nextLine();
												while (verifint(produc[e]) == true) {
													  System.out.println("No estan permitidos los numeros. Ingrese un producto valido:");
													  produc[e] = sc.nextLine();
												}
											}
											else {
												v=1;
											}
										}
									}while (v==0);
								}
								e=e+1;
							}
						}
						for (e=0; e<4; e++) {
							System.out.print((e+1)+". "+produc[e]+"\n");
						}
						break;
				case 2: 
						if (produc[0]==null) {
						System.out.println("No puede realizar esta accion.");
						}
						else {
							for (e=0; e<4; e++) {
									System.out.print((e+1)+". "+produc[e]+"\n");
							}	
						System.out.println("Que producto desea modificar? (1-4)");
						p=sc.nextInt();
						sc.nextLine();
						
						System.out.println("A que desea cambiarlo?");
						produc[p-1]=sc.nextLine();
						
						while (verifint(produc[p-1]) == true) {
							  System.out.println("No estan permitidos los numeros. Ingrese un producto valido:");
							  produc[p-1] = sc.nextLine();
						}
						
						do {
							for (a=0;a<4;a++) {
								if (a==(p-1)) {
									a=p-1;
								}
								else if (produc[a].equals(produc[p-1])) {
									v=0;
									System.out.println("Los productos no se pueden repetir. Introduzca otro producto: ");
									produc[p-1]=sc.nextLine();
									
									while (verifint(produc[p-1]) == true) {
										  System.out.println("No estan permitidos los numeros. Ingrese un producto valido:");
										  produc[p-1] = sc.nextLine();
									}
								}
								
								else {
									v=1;	
								}
							}
						}while (v==0);
						
						for (e=0; e<4; e++) {
							System.out.print((e+1)+". "+produc[e]+"\n");
						}
						}
						break;
				}
			}while(menu2!=3);
			break;
			
			
			
		case 2:
			do {
			System.out.println("\n1. Crear Meses\n2. Modificar error \n3. Volver al menu principal");
			menu2=sc.nextInt();
			sc.nextLine();
			
				switch (menu2) {
				case 1:
					if (mes[5]!=null) {
						System.out.println("Usted ya declaro sus meses. Solo puede modificarlos de ahora en adelante.");
					}
					else {
						a=0;
						while (a<6) {
							System.out.println("Ingrese el mes " +(a+1));
							mes[a]=sc.nextLine();
							
							while (verifint(mes[a]) == true) {
								  System.out.println("No estan permitidos los numeros. Ingrese un mes valido:");
								  mes[a] = sc.nextLine();
							}
							
							while (verifmes(mes[a]) == false) {
								  System.out.println("No es un mes. Ingrese un mes valido:");
								  mes[a] = sc.nextLine();
							}
							
							if (a>0) {	
								v=0;
								do {
									for (e=0;e<a;e++) {
										if (mes[a].equals(mes[e])) {
											v=0;
											System.out.println("Los meses no se pueden repetir. Introduzca otro mes: ");
											mes[a]=sc.nextLine();
											while (verifint(mes[a]) == true) {
												  System.out.println("No estan permitidos los numeros. Ingrese un mes valido:");
												  mes[a] = sc.nextLine();
											}
											while (verifmes(mes[a]) == false) {
												  System.out.println("No es un mes. Ingrese un mes valido:");
												  mes[a] = sc.nextLine();
											}
										}
										else {
											v=1;
										}
									}
								}while (v==0);
							}
							a=a+1;
						}
					}
					for (a=0; a<6; a++) {
						System.out.print((a+1)+". "+mes[a]+"\n");
					}
					break;
				case 2:
						if (mes[0]==null) {
						System.out.println("No puede realizar esta accion.");
						}
						else {
							for (a=0; a<6; a++) {
								System.out.print((a+1)+". "+mes[a]+"\n");
							}
							System.out.println("Que mes desea modificar? (1-6)");
							m=sc.nextInt();
							sc.nextLine();
							
							System.out.println("A que desea cambiarlo?");
							mes[m-1]=sc.nextLine();
							
							while (verifint(mes[m-1]) == true) {
								  System.out.println("No estan permitidos los numeros. Ingrese un mes valido:");
								  mes[m-1] = sc.nextLine();
							}
							
							while (verifmes(mes[m-1]) == false) {
								  System.out.println("No es un mes. Ingrese un mes valido:");
								  mes[m-1] = sc.nextLine();
							}
							do {
								for (e=0;e<6;e++) {
									if (e==(m-1)) {
										e=m-1;
									}
									else if (mes[m-1].equals(mes[e])) {
										v=0;
										System.out.println("Los meses no se pueden repetir. Introduzca otro mes: ");
										mes[m-1]=sc.nextLine();
										
										while (verifint(mes[m-1]) == true) {
											  System.out.println("No estan permitidos los numeros. Ingrese un mes valido:");
											  mes[m-1] = sc.nextLine();
										}
										while (verifmes(mes[m-1]) == false) {
											  System.out.println("No es un mes. Ingrese un mes valido:");
											  mes[m-1] = sc.nextLine();
										}
									}
									else {
										v=1;
									}
								}
							}while (v==0);
							
							for (a=0; a<6; a++) {
								System.out.print((a+1)+". "+mes[a]+"\n");
							}
						}
						break;
				}
			}while(menu2!=3);
			break;
			
			
			
		case 3:
			if (produc[0]==null || mes[0]==null) {
			System.out.println("No puede realizar esta accion.");
			}
			else {
				do {
				System.out.println("\n1. Registrar Ventas \n2. Modificar error \n3. Volver al menu principal");
				menu2=sc.nextInt();
				sc.nextLine();
				
					switch (menu2) {
						case 1:
							if (ventas[3][5]!=null) {
								System.out.println("Usted ya declaro sus ventas. Solo puede modificarlas de ahora en adelante.");
							}
							else {
								for (e=0; e<4; e++) {
									for (a=0; a<6; a++) {
									System.out.println("Ingrese la venta del producto " +produc[e]+" en el mes de " +mes[a]);
									ventas[e][a]=sc.nextDouble();
								
									}
								}
							}
							for (e=0; e<4; e++) {
								System.out.print(produc[e]+" ");
								for (a=0; a<6; a++) {
								System.out.print(ventas[e][a]+" ");
								}
								System.out.print("\n");
							}
							break;
						case 2: 
								if (ventas[0][0]==null) {
								System.out.println("No puede realizar esta accion");
								}
								else {
									for (e=0; e<4; e++) {
										System.out.print(produc[e]+" ");
										for (a=0; a<6; a++) {
											System.out.print(ventas[e][a]+" ");
										}
										System.out.print("\n");
									}
								
								for (e=0; e<4; e++) {
									System.out.print((e+1)+". "+produc[e]+"\n");
								}	
								System.out.println("Que producto desea modificar? (1-4)");
								p=sc.nextInt();
								
								for (a=0; a<6; a++) {
									System.out.print((a+1)+". "+mes[a]+"\n");
								}
								System.out.println("En que mes? (1-6)");
								m=sc.nextInt();
								
								System.out.println("A que desea cambiarlo?");
								ventas[p-1][m-1]=sc.nextDouble();
	
								for (e=0; e<4; e++) {
									System.out.print(produc[e]+" ");
									for (a=0; a<6; a++) {
									System.out.print(ventas[e][a]+" ");
									}
									System.out.print("\n");
								}
								}
								
								break;
					}
				}while(menu2!=3);
			}
			break;
			
			
			
		case 4:
			if (ventas[0][0]==null) {
				System.out.println("No puede realizar esta accion.");
				}
			else {
				for (e=0; e<4; e++) {
					System.out.print((e+1)+". "+produc[e]+"\n");
				}	
				System.out.println("Cual producto va a evaluar? 1-4");
				p=sc.nextInt();
				sump=0;
				for (a=0; a<3; a++) {
					System.out.println(mes[a]+": "+ventas[p-1][a]);
					sump= sump+ventas[p-1][a];
				}
				System.out.println("Las ventas totales de los primeros tres meses del producto "+produc[p-1]+" fueron: " +sump);
			}
			break;
			
			
			
		case 5:
			if (ventas[0][0]==null) {
				System.out.println("No puede realizar esta accion");
			}
			else {
			for (a=0; a<6; a++) {
				System.out.print((a+1)+". "+mes[a]+"\n");
			}
			System.out.println("Cual mes va a evaluar? 1-6");
			m=sc.nextInt();
			summ=0;
			for (a=0; a<4; a++) {
				System.out.println(produc[a]+": "+ventas[a][m-1]);
				summ= summ+ventas[a][m-1];
			}
			System.out.println("Las ventas totales del mes de " +mes[m-1]+ " fueron: " +summ);
			}
			break;
			
			
			
		case 6:
			if (ventas[0][0]==null) {
				System.out.println("No puede realizar esta accion");
			}
			else {
			for (e=0; e<4; e++) {
				System.out.print((e+1)+". "+produc[e]+"\n");
			}
			System.out.println("Cual producto va a evaluar? 1-4");
			p=sc.nextInt();
			sump=0;
			for (a=0; a<6; a++) {
				sump= sump+ventas[p-1][a];
			}
			promp=sump/6;
			System.out.println("El promedio de ventas del producto " +produc[p-1]+ " fue: " +promp);
			}
			break;
			
			
			
		case 7:
			if (ventas[0][0]==null) {
				System.out.println("No puede realizar esta accion");
			}
			else {
				for (e=0; e<6; e++) {
				summ=0;
					for (a=0; a<4; a++) {
						summ= summ+ventas[a][e];
					}
				System.out.println("Las ventas del mes de " +mes[e]+ " fueron: " +summ);
				}
			}
			break;
			
			
			
		case 8:
			if (ventas[0][0]==null) {
				System.out.println("No puede realizar esta accion");
				}
			else {
			for (e=0; e<4; e++) {
				System.out.print((e+1)+". "+produc[e]+"\n");
			}
			System.out.println("Cual producto va a evaluar? 1-4");
			p=sc.nextInt();
			sump=0;
			for (a=0; a<6; a++) {
				System.out.println("Mes de "+mes[a]+ ": "+ventas[p-1][a]);
				sump= sump+ventas[p-1][a];
			}
			System.out.println("La venta total: " +sump);
			}
			break;
			
			
			
		case 9:
			if (ventas[0][0]==null) {
				System.out.println("No puede realizar esta accion");
				}
			else {
				do {
				System.out.println("1. Un solo mes \n2. Todos los meses \n3. Volver al menu principal");
				menu2=sc.nextInt();
				sc.nextLine();
				
				switch (menu2){
					case 1:
						for (a=0; a<6; a++) {
							System.out.print((a+1)+". "+mes[a]+"\n");
						}
						System.out.println("Que mes desea evaluar? 1-6");
						m=sc.nextInt();
						mas=0;
						for (a=0; a<4; a++) {
							if (ventas[a][m-1]>mas) {
								mas=ventas[a][m-1];
								s=a;
							}
						} 
						System.out.println("El producto mas vendido del mes de "+mes[m-1]+" fue: "+produc[s]);
						break;
						
					case 2:
						mas=0;
						for (e=0; e<6; e++) {
							for (a=0; a<4; a++) {
								if (ventas[a][e]>mas) {
									mas=ventas[a][e];
									s=a;
								}
							} 	
						}
						System.out.println("El producto mas vendido fue: "+produc[s]);
						break;
				}
			}while(menu2!=3);
			}
			break;
			
			
			
		case 10:
			if (ventas[0][0]==null) {
				System.out.println("No puede realizar esta accion");
				}
			else {
				do {
				System.out.println("1. Un solo mes\n2. Todos los meses \n3. Volver al menu principal");
				menu2=sc.nextInt();
				sc.nextLine();
				
				switch (menu2) {
				case 1:
					for (a=0; a<6; a++) {
						System.out.print((a+1)+". "+mes[a]+"\n");
					}
					System.out.println("Que mes desea evaluar? 1-6");
					m=sc.nextInt();
					menos=100000;
					for (a=0; a<4; a++) {
						if (ventas[a][m-1]<menos) {
							menos=ventas[a][m-1];
							s=a;
						}
					} 
					System.out.println("El producto menos vendido del mes de "+mes[m-1]+" fue: "+produc[s]);
					break;
				case 2:
					menos=ventas[0][0];
					for (e=0; e<6; e++) {
						for (a=0; a<4; a++) {
							if (ventas[a][e]<menos) {
								menos=ventas[a][e];
								l=a;
							}
						} 	
					}
					System.out.println("El producto menos vendido fue: "+produc[l]);
					break;
				}
				}while(menu2!=3);
			}
			break;
			
		case 11:
			if (ventas[0][0]==null) {
				System.out.println("No puede realizar esta accion");
			}
			else {
			for (e=0; e<4; e++) {
				System.out.print((e+1)+". "+produc[e]+"\n");
			}
			System.out.println("Cual producto va a evaluar? 1-4");
			p=sc.nextInt();
			sump=0;
			for (a=0; a<6; a++) {
				sump= sump+ventas[p-1][a];
			}
			promp=sump/6;
			for (a=0; a<6; a++) {
				if (ventas[p-1][a]<promp) {
					System.out.println("El mes de "+mes[a]+" esta por debajo del promedio de ventas del producto, su venta fue de "+ventas[p-1][a]);
				}
					
			}
			
			}
			break;
			
		}
	} while (menu!=12);
	}
	
	
public static void main(String[] args) {
		
		tiendaventas tv=new tiendaventas();
		tv.tventas();
}	
}
