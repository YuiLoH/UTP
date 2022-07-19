#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
#include<iostream>
#include<windows.h>
using namespace std;

struct tabla{
char pregunta[100];
int punto;
char respuesta[2];
};


void vacio(char temp[]){
int i;
for (i=0;i<100;i++) temp[i]='\0';
}

void formular(int ordenp[],int n,int i){
    ordenp[i]=n-1;
}

int evaluar(char resp[][2], tabla lista[], int i, int n, int orden){
    int po=0;
 if (strcmp(resp[i],lista[orden].respuesta)==0) po=n;
return po;
}

int medir(int p,int c){
int pt;
pt=p/c;
return pt;
}


int main(){
    int i=0,j=0,k=0,cont=0,ch;
    int perso=0,c,x,ptotal=0,n,may,temp1,temp2;
    char letra;
FILE *f=fopen("banco.txt","r");
char temp[100];
if (f==NULL){ printf("error."); exit(1);}

 while(!feof(f)){
        fgets(temp,100,f);
        cont++;
    }//printf("%i\n",cont); // printf("%s",temp);

    struct tabla *lista;
    lista=(tabla*)calloc(cont,sizeof(tabla));
    if (lista==NULL) {printf("no hay memoria"); exit(1);}
    rewind(f);// regresar el cursor al inicio


    while (ch!=EOF){
            if(i==cont-1) break;
            vacio(temp);
        letra='0';
           for(j=0;letra!='?';j++){
            letra=fgetc(f);// printf("%c",letra); system("pause");
            if(letra!='?') temp[j]=letra; //printf("%c",temp[j]); system("pause");
    }strcpy(lista[i].pregunta,temp);
    vacio(temp);
           for(j=0;letra!='*';j++){
            letra=fgetc(f);
            if(letra!='*') temp[j]=letra;
    }lista[i].punto=atoi(temp);
    vacio(temp);
           for(j=0;letra!='\n';j++){
            letra=fgetc(f);
            if(letra!='\n') temp[j]=letra;
           }strcpy(lista[i].respuesta,temp);
   // printf("%s?\n",lista[i].pregunta);
    //printf("%i\n",lista[i].punto);
    //printf("%s\n",lista[i].respuesta);
    //printf("********%i*******\n",i);
    i++;
    }

fclose(f);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

printf("\t\\************************************************/\n");
  printf("\t\\**personal de administracion de recurso humano**/\n");
  printf("\t\\************************************************/\n");
  printf("cantidades de aspirante citados:");
  scanf("%i",&c);
  char nombre[c][20];
  char ced[c][15];
  int *numced=(int*)calloc(c,sizeof(int)); if (numced==NULL){ printf("no hay memoria."); exit(1);}
  int *po=(int*)calloc(c,sizeof(int)); if (po==NULL){ printf("no hay memoria."); exit(1);}
    while (perso<c){
        printf("\n\nintroducir la cantidad de pregunta que realizara:");
      scanf("%i",&x);
      while (x<5 || x>11){printf("no puede ser menor que 5 y mayor que 11, vuelve a introducir la cantidad:"); scanf("%i",&x);}
      char good[x][2];
      char resp[x][2];
      int newpt [x],ordenp[x];
printf("introducir los preguntas que desea para el test:");
      for(i=0;i<x;i++){
      scanf("%i",&n);
      strcpy(good[i],lista[n-1].respuesta);// printf("%s",good[i]); // lleva contenido de clave en posicion "real" al good[i]
      newpt[i]=lista[n-1].punto;// printf("%i\n",newpt[i]);   // lleva tab posicion "real" miembro punto al newpt[i]
      formular(ordenp,n,i); //printf("pregunta#%i:%i\n",i+1,ordenp[i]);
      }system("cls");

      printf("**aspirante#%i**\n\n",perso+1);
      printf("introducir su nombre:");
      scanf("%s",&nombre[perso]);
      fflush(stdin);
      printf("introducir su cedula:");
      scanf("%s",&ced[perso]);
       for(i=0;i<x;i++) {
            printf("%s?\n",lista[ordenp[i]].pregunta);
          // cout<<good[i]<<endl;
          printf("si/no?"); //printf("%s\n",good[i]);
          scanf("%s",&resp[i]);
          for(j = 0;j<2;j++) resp[i][j] = toupper(resp[i][j]);
          printf("respuesta introducido: %s, respuesta correcta: %s, punto de la pregunta: %i\n",resp[i],lista[ordenp[i]].respuesta,newpt[i]);
          po[perso]=po[perso]+evaluar(resp,lista,i,newpt[i],ordenp[i]);
          }printf("\n*****************************************\n");
           printf("\nnombre:%s\n",nombre[perso]);
      printf("cedula:%s\n",ced[perso]);
    printf("punto obtenido: %i\n",po[perso]);
      fflush(stdin);
      ptotal=ptotal+po[perso];
      perso++;
        getch();
    system("cls");
    }
    for(i=0;i<c;i++) numced[i]=i;
    for(i=0;i<c;i++){
        if (i==0) may=po[i];
        for(n=i+1;n<c;n++){
            if(po[i]<po[n]){
                temp1=po[i];
                po[i]=po[n];
                po[n]=temp1;
                temp2=numced[i];
                numced[i]=numced[n];
                numced[n]=temp2;
            }

        }
    }
     printf("promedio de los resultados: %i\n\n",medir(ptotal,c));
    for(i=0;i<c;i++) {
        if (i==0 || i==3) printf("*****************************************************\n");
          if (i<3) printf("**posicion#%i: %i puntos\tcedula:%s** pasara a la etapa de entrevista\n",i+1,*(po+i),ced[numced[i]]);
           if(i>=3) printf("posicion#%i: %i puntos\tcedula:%s\n",i+1,*(po+i),ced[numced[i]]);}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*for(i=0;i<cont;i++)
printf("%s, punto: %i\n",lista[i].pregunta, lista[i].punto);
for(i=0;i<cont;i++)
printf("respuesta#%i: %s\n",i+1,lista[i].respuesta);*/


free(numced);
free(po);
free(lista);
system("pause");
return 0;
}
