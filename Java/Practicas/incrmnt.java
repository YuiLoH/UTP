package bleh;

public class incrmnt {
		private int S=1500;
		private double I=0.1;
		public void incr(){
		int a;
		double total=S;
		for (a=1; a<7; a++) {
		total = total +(S*I);
		System.out.println("Año #" +a);
		System.out.println("Salario: " +total);
		}
		}
		public static void main(String[] args) {
		incrmnt ln=new incrmnt();
		ln.incr();
		}
	

}
