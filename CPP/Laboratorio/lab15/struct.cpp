/* Paso de una estructura por valor. */
#include <stdio.h>
#include <conio.h>
struct trabajador
{
char nombre[20];
char apellidos[40];
int edad;
char puesto[10];
};
void visualizar( trabajador *empefijo)
{
printf("Nombre: %s",empefijo->nombre);
printf("\nApellidos: %s",empefijo->apellidos);
printf("\nEdad: %d",empefijo->edad);
empefijo->edad+=1;
printf("\nPuesto: %s",empefijo->puesto);
}
int main()
{
struct trabajador permanente;
printf("Nombre: ");
scanf("%s",permanente.nombre);
printf("\nApellidos: ");
scanf("%s",permanente.apellidos);
printf("\nEdad: ");
scanf("%d",&permanente.edad);
printf("\nPuesto: ");
scanf("%s",permanente.puesto);
visualizar(&permanente);
printf("\nnuevo edad: %i",permanente.edad);
getch();
return 0;
}
