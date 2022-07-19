/*programa que lee el porcentaje de alcohol en sangre y te devuelve
 si eres apto o no para conducir. DATO: la tasa de alcohol permitida es de 0.5*/



#include<stdio.h>
#include<conio.h>

 int apto (int porce){
 int permit=5;
 if (porce<=permit)
return 0;
else if(porce>permit)
 return 1;
 }


 int main(){
 int porce,determ;
 printf("Por favor ingrese su porcentaje de alcohol\n");
 scanf("%f",&porce);
 determ=apto(porce);

 if (determ==0)
    printf("Usted es apto para conducir.");
 else
    printf("Usted esta ebrio. No debe conducir.");


    getch();
    return 0;
 }
