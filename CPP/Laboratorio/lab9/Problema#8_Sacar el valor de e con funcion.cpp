#include<stdio.h>
#include<conio.h>

double fact(double z){
double fac=1,j;
for(j=1;j<=z;j++)
    fac*=j;
return fac;
}
double divisor(double i){
double divi,z=i;
divi=fact(z);
return divi;
}
double ope(double N){
double e=1, i;
for(i=1;i<=N;i++)
e+=1/divisor(i);
return e;
}

double vali(double N){
if(N<=0)return 0;
else return 1;
}

int main(){
double N, resp;
printf("Introduzca un numero positivo: ");scanf("%lf", &N);
while(vali(N)==0){printf("\nDebe ser un numero positivo, ingrese de nuevo: ");scanf("%lf", &N);}
resp=ope(N);
printf("\nEl resultado es: %lf", resp);
getch();
return 0;

}
