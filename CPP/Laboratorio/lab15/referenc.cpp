#include <stdio.h>
#include <conio.h>
#include <string.h>
struct trabajador
{   char nombre[20];
    char apellidos[40];
    int edad;
    char puesto[15]; };
void visualizar( trabajador * empefijo)
{ if (strcmp (empefijo->puesto,"DOCENTE")== 0)
strcpy (empefijo->puesto, "FACILITADOR");
printf("\nNombre: %s",empefijo->nombre);
printf("\nApellidos: %s",empefijo->apellidos);
printf("\nEdad: %d",empefijo->edad);
//printf("\nPuesto: %s",empefijo->puesto);
}
main()
{
struct trabajador permanente;
printf("Nombre: ");
gets(permanente.nombre);
printf("\nApellidos: ");
scanf("%s",permanente.apellidos);
printf("\nEdad: ");
scanf("%d",&permanente.edad);
printf("\nPuesto: ");
scanf("%s",&permanente.puesto);
visualizar(&permanente);
printf("\nPuesto: %s",permanente.puesto);
getch();
return 0; }
