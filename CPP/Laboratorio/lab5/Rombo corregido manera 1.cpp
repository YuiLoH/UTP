#include <stdio.h>

int main(){
int num, n, espacio,x,i;
printf("Ingrese un numero impar ");
scanf("%i", &num);
if (num%2==0)
  printf("El numero es par ");
else{
 espacio=num/2;
 for(n=1; n<=num; n=n+2){
   for(x=espacio;x>=0;x--)
     printf(" ");
     espacio=espacio-1;
     for(i=1; i<=n; i++)
        printf("*");
  printf("\n");}

espacio=espacio+1;
for(n=num-2;n>=0;n=n-2){
   espacio=espacio+1;

for(x=espacio;x>=0;x--)
    printf(" ");

    for(i=1;i<=n;i++)
        printf("*");
    printf("\n");}}

 return 0;
}
