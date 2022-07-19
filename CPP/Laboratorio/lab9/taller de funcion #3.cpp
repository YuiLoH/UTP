//Yui Lo
#include <stdio.h>
#include<conio.h>


int co(int a, int b){
 int cant=0;
    while (a>=b){
        a=a-b;
        cant++;}
return cant;
}


int main(){
    int a,b;
    printf("introducir dividendo y divisor:");
    scanf("%i %i",&a,&b);
     while (a<=0){
        printf("solo admite valor positivo, volver a introdcir valor a:");
        scanf("%i",&a);
    }
     while (b<=0){
        printf("solo admite valor positivo, volver a introdcir valor b:");
        scanf("%i",&b);
    }
    printf("el cociente es: %i\n",co(a,b));
    printf("el residuo es: %i",a-co(a,b)*b);
getch();
return 0;
}
