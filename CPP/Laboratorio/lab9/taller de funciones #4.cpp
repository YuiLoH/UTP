//Programa que pide dos n�meros y muestra por pantalla la sucesi�n de n�meros impares entre los dos n�meros introducidos.

#include<stdio.h>
#include<conio.h>
int suces(int num1,int num2){
int i;
for(i=num1+1;i<num2;i++)

    return i;
}

int main (){
int num1,num2,finali,i;
printf("Ingrese dos numeros enteros\n");
scanf("%i %i",&num1,&num2);
while (num1>num2||(num1<0||num2<0 )||num1==num2){
    printf("Datos no permitidos\n");
    printf("Vuelva a ingresar dos numeros\n");
    scanf("%i %i",&num1,&num2);}

finali=suces(num1,num2);
for (i=finali;i<num2;i++)
    if (i%2!=0)
printf("\nLa sucesion de impares es: %i\n",i);

getch();
return 0;
}


