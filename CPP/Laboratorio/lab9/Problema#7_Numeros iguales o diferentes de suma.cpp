#include<stdio.h>
#include<conio.h>

int compr(int a, int b, int c){
if(a+b==c)return 1;
else return 0;
}

int main(){
int a,b,c;
printf("Introduzca 3 numeros\n"); scanf("%i %i %i", &a,&b,&c);
if(compr(a,b,c)==1)
    printf("\nIGUALES");
else if(compr(a,b,c)==0)
    printf("\nDIFERENTES");
}
