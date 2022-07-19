//Yui Lo
#include<stdio.h>
#include<conio.h>


int op(int a,int b){
int r=0,i=1;
    for (i=1;i<=b;i++)
        r=r+a;
return r;
}

int main(){
    int a,b;
    printf("introducir valor entero de a y b:");
    scanf("%i %i",&a,&b);
    while (a<=0){
        printf("solo admite valor positivo, volver a introdcir valor a:");
        scanf("%i",&a);
    }
    while (b<=0){
        printf("solo admite valor positivo, volver a introdcir valor b:");
        scanf("%i",&b);
    }
    printf("la respuesta es: %i",op(a,b));
getch();
return 0;
}
