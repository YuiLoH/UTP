#include<stdio.h>
#include<conio.h>
#define F 3
#define X 3

void suma(int A[][X], int B[][X], int C[][X]){
    int i,j;
    for (i=0;i<F;i++){
    for (j=0;j<X;j++)
        C[i][j]=A[i][j]+B[i][j];}
}

int main(){
int A[F][X],B[F][X],C[F][X];
int i=0,j=0,num;

for (i=0;i<F;i++){
    for (j=0;j<X;j++){
    printf("introducir valor para matriz A[%i][%i]:",i+1,j+1);
    scanf("%i",&num);
     while (num<0){
            printf("solo numero entero\n");
         printf("introducir valor para matriz A[%i][%i]:",i+1,j+1);
    scanf("%i",&num);
    }
    A[i][j]=num;
    }
}
printf("******************************************\n");
for (i=0;i<F;i++){
    for (j=0;j<X;j++){
    printf("introducir valor para matriz B[%i][%i]:",i+1,j+1);
    scanf("%i",&num);
    while (num<0){
            printf("solo numero entero\n");
         printf("introducir valor para matriz B[%i][%i]:",i+1,j+1);
    scanf("%i",&num);
    }
    B[i][j]=num;
    }
}
printf("******************************************\n");
suma(A,B,C);
for (i=0;i<F;i++){
    for (j=0;j<X;j++)
        printf("matriz C[%i][%i]=%i\n",i+1,j+1,C[i][j]);
}
getch();
return 0;
}
