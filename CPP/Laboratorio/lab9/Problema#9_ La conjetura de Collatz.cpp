#include<stdio.h>
#include<conio.h>

int par(int N){
return N/2;}

int impar(int N){
return (N*3)+1;}

int vali(int N){
if(N<0)return 0;else return 1;}

int tipon(int N){
if(N%2==0)return 0;
else if(N%2==1)return 1;}

int main(){
int N;
printf("Introduzca un numero positivo mayor a 1: "); scanf("%i",&N);
while(vali(N)==0){ printf("\nDebe ser positivo, de otro numero: "); scanf("%i",&N);}
if(N==1 ||N==0)printf("\nEl proceso ha terminado, para apreciarlo mejor, la proxima vez introduzca un numero mayor");
else if(N>1){printf("%i ",N);
    do{
       if(tipon(N)==0){
        N=par(N);printf("%i ",N);}

       else if(tipon(N)==1){
        N=impar(N);printf("%i ",N);}}
        while(N!=1);}
printf("\nA esta secuencia se le conoce como La conjetura de Collatz.\n");
getch();
return 0;


}
