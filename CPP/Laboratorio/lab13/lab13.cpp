//Yui Lo
#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<conio.h>
int main(){
double *p,*q;
double y=8.9;
p=&y;
q=p;
y=*q+sqrt(4);
printf("contenido de q= %p\n",q);
printf("direccion de q: %p\n",&q);
printf("valor de contenido de q: %.1lf\n",*q);
printf("contenido de p= %p\n",p);
printf("valor de contenido de p: %.1lf\n",*p);
printf("direccion de p: %p\n",&p);
printf("direccion de y: %p\n",&y);

getch();
return 0;
}
