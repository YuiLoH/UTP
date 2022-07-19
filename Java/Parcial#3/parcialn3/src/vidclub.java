import java.util.Scanner;
public class vidclub {
    private static String[] mes={"enero","febrero","marzo","abril","mayo","junio"}; 
    private static String[] genero=new String[4];
    private static double[][] renta=new double[4][6];
    
public void op(){
    int resp,i,j,gen;
    double cant=0,mayor,prom;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese 4 genero:");
        for(i=0;i<4;i++){
            genero[i]=sc.nextLine();
        }
        for(i=0;i<4;i++){
            for(j=0;j<6;j++){
        System.out.println("ingrese la renta de "+genero[i]+" en mes de "+mes[j]+":");
            renta[i][j]=sc.nextDouble();
            }
        }
    do{
            System.out.println("\n*****************************************************************\n\tvideoclub\n1. cantidad de peliculas de genero x rentadas en el primer trimestre\n2. mes que rentaron mas peliculas de género x\n3. promedio rentadas por género\n4. salir");
        resp=sc.nextInt();
        if(resp==1){
            System.out.println("cual género?");
             for(i=0;i<4;i++){
                 System.out.println((i+1)+". "+genero[i]);
             }
             gen=sc.nextInt();
              for(i=0;i<3;i++){
                  cant=cant+renta[gen-1][i];
              }
              System.out.println("cantidad de peliculas de género "+genero[gen-1]+" rentadas en el primer trimestre:");
              for(i=0;i<3;i++){
                  System.out.println("mes de "+mes[i]+": rentaron: "+renta[gen-1][i]);
              }
              System.out.println("total de trimestre: "+cant);
        }
        if(resp==2){
            System.out.println("cual género?");
             for(i=0;i<4;i++){
                 System.out.println((i+1)+". "+genero[i]);
             }
             gen=sc.nextInt();
             mayor=renta[gen-1][0];
             for(i=0;i<6;i++){
                 if(renta[gen-1][i]>=mayor) {
                     mayor=renta[gen-1][i];
                 }
             }
             System.out.println("mes que rentaron más pelicula:");
              for(i=0;i<6;i++){
                 if(renta[gen-1][i]==mayor) {
                   System.out.println(mes[i]);
                 }
             }
        }
        if(resp==3){
            for(j=0;j<4;j++){
                for(i=0;i<6;i++){
                 cant=cant+renta[j][i];
                }
                System.out.println("promedio de peliculas rentadas de genero "+genero[j]+": "+(cant/6));
            }  
        }
        }while(resp!=4);
}
    public static void main(String[] args) {
        vidclub pt=new vidclub();
        pt.op();
    }
    
}
