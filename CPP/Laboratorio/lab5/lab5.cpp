//enrique y tatis
#include <stdio.h>
#include <conio.h>

int main (){
    int i,n,star=1,k,j;
    bool maxi=false;
    printf("lea linea de estrella");
    scanf("%i",&n);
    while (n%2==0){
        printf("debe ser impar");
        scanf("%i",&n);
    }
   for (i=1;i<=n;i++){
    for (j=1;j<=(n-star)/2;j++)printf(" ");
    for (k=1;k<=star;k++)printf("*");
    printf("\n");
    if (star<n && maxi ==false)star+=2;
    else {
        star-=2;
        maxi=true;
    }

   }
getchar();
getchar();
return 0;


}
