//Yui Lo
#include<stdio.h>
#include<conio.h>

int b10(int m){
    int cant=0;
    while (m>=10){
        m-=10;
        cant++;
    }
return cant;
}
int b5(int m){
    int cant=0;
    while (m>=5){
        m-=5;
        cant++;
    }
return cant;
}
int main (){
    int monto,de10,now,de5,de1;
    printf("introducir monto:");
    scanf("%i",&monto);
     while (monto<=0){
        printf("monto debe ser positivo:\n");
        scanf("%i",&monto);}
    de10=b10(monto);
    now=monto-10*de10;
    de5=b5(now);
    now=monto-10*de10-5*de5;

printf("monto correcto es: %i\n",monto);
printf("*******************\n%i billetes de 10\n",de10);
printf("*******************\n%i billetes de 5\n",de5);
printf("*******************\n%i billetes de 1\n",now);
getch();
return 0;
}
