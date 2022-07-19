//Yui Lo

#include<stdio.h>
#include<conio.h>

int grande(int n,int may, int i){
    if (i==1)
        may=n;
    else
        if (n>=may)
        may=n;

return may;
}
 int peque (int num, int menor, int i){
    if (i==1)
        menor=num;
    else
        if (num<=menor)
        menor =num;
 return menor;
 }

int sumar (int suma, int num){
    suma=suma+num;
return suma;
}

int media (int suma, int t){
return suma/t;
}

int main (){
    int may, menor, suma=0, num, i,n,med;
    printf("lea cantidad de numero");
    scanf("%i", &num);

    while (n<=0){
        printf("numero positivo");
        scanf("%i",&num);
    }
    for (i=1;i<=num;i++){
        printf("lea numero"); scanf("%i",&n);
        suma=sumar(suma,n);
        may=grande(n,may,i);
        menor=peque(n,menor,i);
       }
       med=media(suma,num);
    printf("suma:%i\n",suma);
    printf("mayor:%i\n",may);
    printf("menor:%i\n",menor);
    printf("media:%i\n",med);
getch();
return 0;
}
