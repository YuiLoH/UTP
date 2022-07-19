// Yui Lo ;  Fernando Rodríguez

#include<stdio.h>
#include<stdlib.h>
#define X 3

struct salida {
char nombre[20];
int serv;
double newsalario;
};


int calcularA (int ai){
return 2018-ai;
}

double calcularS (double salario, int ai){
double nuevo=0;
if (ai>=10 && ai<=19) nuevo=salario*20/100+salario;
else if (ai>=20 && ai<=29) nuevo=salario*30/100+salario;
else if (ai>=30 && ai<=39) nuevo=salario*50/100+salario;
return nuevo;
}

double calcularP(struct salida em[]){
    int i;
double prom=0.00;
for(i=0;i<X;i++)
    prom=prom+em[i].newsalario;
return prom/X;
}

double calcularS30 (struct salida em[]){
int i;
double tots=0.00;
for (i=0;i<X;i++){
    if (em[i].serv>=30)
        tots=tots+em[i].newsalario;
}
return tots;
}

int main(){
    struct salida empe[X];
    int i=0,ai,err=0;
    double salario;
while (i<X && err+i<X){
printf("introducir nombre:");
gets(empe[i].nombre);
fflush(stdin);
printf("años de ingreso y salario:");
scanf("%i %lf",&ai,&salario); //printf("%lf\n",salario);
fflush(stdin);
while (calcularA(ai)<10 || calcularA(ai)>40 ){
    printf("este empleado no recibe aumento");
    scanf("%i",&ai); err++;
}
while (salario < 0){
    printf("salario no puede ser negativo");
    scanf("%lf",&salario);
    }
empe[i].serv=calcularA(ai);
empe[i].newsalario=calcularS(salario,calcularA(ai));

i++;
}

for (i=0;i<X;i++){
    printf("nombre:%s  años de servicio:%i  salario nuevo: B/.%.2lf\n", empe[i].nombre, empe[i].serv, empe[i].newsalario);
}

printf("\nel promedio de salario nuevo es: B/.%.2lf\n",calcularP(empe));
printf("el total de dinero al pagar por los empleado de 30+: B/.%.2lf\n",calcularS30(empe));
system("pause");
return 0;
}
