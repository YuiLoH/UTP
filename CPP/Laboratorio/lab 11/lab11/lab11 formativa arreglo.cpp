// Yui Lo
/*ELABORE EL SIGUIENTE PROGRAMA EN C.   VALOR 30 PTS.


1.	Escriba un programa que normalice los 20 números enteros que debe leerse
y luego almacenarse en un arreglo denominado estadística. Para llevar a cabo la normalización
 se debe en primer lugar, buscar el número mayor y luego dividir cada número del arreglo  por dicho valor mayor,
  de forma que los valores resultantes estén comprendidos en el intervalo del 0 al 1.
           Imprima el arreglo original y luego  el arreglo normalizarlo. */

#include<stdio.h>
#include<conio.h>
#define T 20
int mayor(int estadistica[]){
    int i,may=0;
for (i=0;i<=T-1;i++){
if (i==0) may=estadistica[0];
if (estadistica[i]>may) may=estadistica[i];
}
return may;
}

void norm(double res[], double may){
    int i;
for (i=0; i<=T-1;i++){
    res[i]=res[i]/may;
}
}

int main (){
int estadistica[T];
double res[T];
int i,may=0;
for (i=0;i<=T-1;i++){
printf("introducir numero entero:");
scanf("%i",&estadistica[i]);
while(estadistica[i]<=0){printf("debe ser numero positivo."); scanf("%i",&estadistica[i]);}
}
may=mayor(estadistica);
printf("**arreglo original**\n");
for (i=0;i<=T-1;i++){
printf("%i\n",estadistica[i]);
}
printf("**arreglo normalizado**\n");
for (i=0;i<=T-1;i++){
        res[i]=estadistica[i];
}
norm(res,may);
for (i=0;i<=T-1;i++)
    printf("%.2lf\n",res[i]);

getch();
return 0;
}
