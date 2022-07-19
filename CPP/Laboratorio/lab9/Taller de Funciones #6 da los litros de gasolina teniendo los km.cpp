#include<stdio.h>
#include<conio.h>
/*Programa que nos permita calcular el número de litros de gasolina
en un viaje dados los kilómetros recorridos.*/

double consumo(int ki){
double gastado;
double promconsu=40.00/ki; // Tomando en cuenta un consumo promedio de un auto normal de tanque de 40L // Esto es lo que consume de gasolina por cada 1 km
gastado=(promconsu*(ki-1))/10; //Multiplico lo que consume el auto en cada km por los km recorridos// Menos 0.1 porque ya tengo el valor de 1 ki. No hacer eso me adicionaria un km mas
return gastado;

}

int main (){
int ki;
printf("Por favor ingrese los kms recorridos. Se recomienda siempre usar centenas exactas\n");
scanf("%i",&ki);
while(ki<=0 || ki>400){ // Porque un tanque promedio de 40 lleno rinde alrededor de 400 km
    printf("Dato invalido\nPor favor vuelva ingresar el dato");
scanf("%i",&ki);}
printf("El consumo ha sido de: %lf Litros de gasolina",consumo(ki));

getch();
return 0;
}
