//Yui Lo
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

void totalizador(int *totr, double zona){
if (zona<0.04)
    *totr=*totr+1;
}

int main(){
int totl=0,totr=0;
double zona;
char resp='s';
while (resp=='s' || resp=='S'){
printf("valor de zonas:");
scanf("%lf",&zona);
totalizador(&totr,zona);
fflush(stdin);
totl+=1;
printf("continua..?");
scanf("%c",&resp);
}
printf("total de zonas de riesgo:%i\n",totr);
printf("total de zonas leido:%i\n",totl);
getch();
return 0;
}
