package bleh;
	import java.util.Scanner;
	public class cantid {
			private int E;

	    public void fijar(int estus) {
	    	E= estus;
	    }

	  	public double prome(double A){
		double rest;
		rest= A/E;
		return rest;
		}
		
	    public static void main(String[] args) {
	      double estat, peso, restf=0, restm=0, rpesof=0, rpesom=0;
	      int estus,cof=1, fs=0, ms=0;
	      char sexo;
	      Scanner sc= new Scanner(System.in);
	      cantid ct= new cantid();

	      System.out.printf("Ingrese la cantidad de estudiantes en el salon: ");
	      estus= sc.nextInt();
	      ct.fijar(estus);

	      while (cof<=estus) {
	      System.out.printf("Ingrese el genero del estudiante ('f' o 'm'): ");
	      sexo= sc.next().charAt(0); 
	      System.out.printf("Ingrese la estatura del estudiante en metros: ");
	      estat= sc.nextDouble();
	      System.out.printf("Ingrese el peso del estudiante en libras: ");
	      peso= sc.nextDouble();

		  if ((sexo == 'f') || (sexo == 'F')) {
		  	fs= fs+1;
	 		restf= restf + estat;
			rpesof= rpesof + peso;
		  }
		  else if ((sexo == 'm') || (sexo == 'M')){
		  	ms= ms+1;
			restm= restm + estat;
			rpesom= rpesom + peso;
		  }
		  cof = cof+1;
	      }
	      
	      restf= ct.prome(restf);
		  restm= ct.prome(restm);
		  rpesof= ct.prome(rpesof);
		  rpesom= ct.prome(rpesom);
		  
		  System.out.printf("La cantidad de estudiantes: %d\n", estus);
		  System.out.printf("Las estudiantes de género femenino: %d\n", fs);
		  System.out.printf("Los estudiantes de género masculino: %d\n", ms);
		  System.out.printf("El promedio de la estatura femenina: %.2f\n", restf);
		  System.out.printf("El promedio de la estatura masculina: %.2f\n", restm);
		  System.out.printf("El promedio del peso femenino: %.2f\n", rpesof);
		  System.out.printf("El promedio del peso masculino: %.2f\n", rpesom);

	    }

}
