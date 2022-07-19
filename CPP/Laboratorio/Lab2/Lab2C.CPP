
/*Yui Lo - Aurelio Morales
Laboratorio #2 - Parte #3*/

#include <stdio.h>
#include <math.h>

#define area(a,b) (a*b)/2
int main() {

float base, altura, resp;

printf("-AREA DE UN TRIANGULO-\n\n");
printf("Introduzca la BASE del triangulo: ");
scanf("%f", &base);
printf("\nIntroduzca la ALTURA del triangulo: ");
scanf("%f", &altura);
resp=area(base,altura);
printf("\nEl AREA del triangulo es de: %0.3f", resp);
printf("\n");

return 0;

}
