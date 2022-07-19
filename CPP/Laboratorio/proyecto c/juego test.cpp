#include <stdio.h>
#include<stdlib.h>
#include<time.h>
#include<conio.h>
#include<windows.h>


int ramrst (int i)
{
    int num;
    srand(time(NULL));
    num=rand()%i;
    return num;
}

int sigch (int i){
    int op;
    if (i==1){
    srand(time(NULL));
    op=rand()%4;}
    else op=rand()%4;
    return op;
}
void ope (int a, int b, int o){
    int re;
    if (o==0) printf("%i + %i = ?\n",a,b); //re=a+b;
     if (o==1) printf("%i - %i = ?\n",a,b); //re=a-b;
      if (o==2) printf("%i * %i = ?\n",a,b); //re=a*b;
       if (o==3) printf("%i / %i = ?\n",a,b); //re=a/b;
}
void ope2 (int a, int b, int o){
    int re;
    if (o==0) printf("%i + ? = %i\n",a,b); //re=a+b;
     if (o==1) printf("%i - ? = %i\n",a,b); //re=a-b;
      if (o==2) printf("%i * ? = %i\n",a,b); //re=a*b;
       if (o==3) printf("%i / ? = %i\n",a,b); //re=a/b;
}
int calc(){
int good=0,bad=0,i,op=0,a,b,o,re,ans;
char resp='n';

    while (op<7){
                     o=sigch(1);

                    if (o==0) {a=ramrst(100); b=ramrst(100-10); ope(a,b,o);
                            printf("? ="); scanf("%i",&ans); re=a+b;// printf("%i\n",re);
                    while (ans!=re){ope(a,b,o);re=a+b;
                            printf("? ="); scanf("%i",&ans); bad++;
                             //printf("%i\n",re);
                             }
                        }
                     if (o==1) {a=ramrst(100); b=ramrst(100-10); ope(a,b,o);
                         printf("? ="); scanf("%i",&ans); re=a-b;//printf("%i\n",re);
                         while (ans!=re){ope(a,b,o);re=a-b;
                            printf("? ="); scanf("%i",&ans); bad++;
                           // printf("%i\n",re);
                            }
                     }
                      if (o==2) {a=ramrst(100); b=ramrst(10); ope(a,b,o);
                          printf("? ="); scanf("%i",&ans); re=a*b;//printf("%i\n",re);
                          while (ans!=re){ope(a,b,o);re=a*b;
                            printf("? ="); scanf("%i",&ans); bad++;
                            //printf("%i\n",re);
                            }
                      }
                    if (o==3){a=ramrst(100); b=ramrst(10); ope(a,b,o);
                        printf("? ="); scanf("%i",&ans); re=a/b;//printf("%i\n",re);
                        while (ans!=re){ope(a,b,o);re=a/b;
                            printf("? ="); scanf("%i",&ans); bad++;
                            //printf("%i\n",re);
                            }
                    }

                    if (ans==re) good++;

      op=op+1;
  } printf("******************\n* correcto: %i  *\n",good); printf("* incorrecto: %i *\n******************\n",bad);
}

int quest(){
    int resp,op,i=0;
    char respue[10];
    op=sigch(1);
    if (op==0){
        printf("largo, largo, su cuello es\ny tiene manchas en la piel.\nsi te digo mas,\nsabras quien es\n");
            while (i<=2){
                    if (i>0) printf("intente de nuevo...");
                printf("\nrespues="); gets(respue);
                if (strcmp(respue,"jirafa")!=0) i++;
                else i=i+5;
            } if (strcmp(respue,"jirafa")!=0) {printf("******************game over******************\n\n"); resp=0;}
            else resp=1;

    }

    if (op==1){
        printf("vuelo entre las flores,\nvivo en la colmena\nfabrico alli la miel\ny tambien la cera.\n");
            while (i<=2){
                    if (i>0) printf("intente de nuevo...");
                printf("\nrespues="); gets(respue);
                if (strcmp(respue,"abeja")!=0) i++;
                else i=i+5;
            } if (strcmp(respue,"abeja")!=0) {printf("******************game over******************\n\n"); resp=0;}
            else resp=1;

    }

    if (op==2){
        printf("!GUAU! de noche,\n!GUAU! de dia.\ncazo y ladro.\nquien seria\n");
           while (i<=2){
                if (i>0) printf("intente de nuevo...");
                printf("\nrespues="); gets(respue);
                if (strcmp(respue,"perro")!=0) i++;
                else i=i+5;
            }if (strcmp(respue,"perro")!=0) {printf("******************game over******************\n\n"); resp=0;}
            else resp=1;

    }

    if (op==3){
        printf("verde por fuera\nrojo por dentro\ny con muchas semillas adentro.\nque es\n");
            while (i<=2){
                    if (i>0) printf("intente de nuevo...");
                printf("\nrespues="); gets(respue);
                if (strcmp(respue,"sandia")!=0) i++;
                else i=i+5;
            }if (strcmp(respue,"sandia")!=0) {printf("******************game over******************\n\n"); resp=0;}
            else resp=1;

    }
return resp;
}
void adiv(){
    int good=0,bad=0,i=0,op=0,a,b,o,re,ans;
char resp='s';

    while (resp=='s'){
                     o=sigch(1);

                    if (o==0) {a=ramrst(100); b=ramrst(100-10); ope2(a,b,o);
                    while (i<=2){  if(i>0){ope2(a,b,o);re=b-a;}
                            printf("? ="); scanf("%i",&ans); re=b-a; //printf("%i\n",re);
                   /* while (ans!=re){ope2(a,b,o);re=b-a;
                            printf("? ="); scanf("%i",&ans); bad++;
                             //printf("%i\n",re);*/
                             if (ans!=re) {i++; bad++;}
                             else i=i+5;
                             }if (ans!=re){printf("******************game over******************\n\n"); op=0;} else op=1;
                    }fflush(stdin);
                      //  }
                     if (o==1) {a=ramrst(100); b=ramrst(100-10); ope2(a,b,o);
                     while (i<=2){ if(i>0){ope2(a,b,o);re=a-b;}
                         printf("? ="); scanf("%i",&ans); re=a-b;//printf("%i\n",re);
                       /*  while (ans!=re){ope2(a,b,o);re=a-b;
                            printf("? ="); scanf("%i",&ans); bad++;
                           // printf("%i\n",re);*/
                             if (ans!=re) {i++; bad++;}
                             else i=i+5;
                             }if (ans!=re){printf("******************game over******************\n\n"); op=0;} else op=1;
                            }fflush(stdin);
                   //  }
                      if (o==2) {a=1+ramrst(10); b=ramrst(100); ope2(a,b,o);
                      while (i<=2){ if(i>0){ope2(a,b,o);re=b/a;}
                          printf("? ="); scanf("%i",&ans); re=b/a;//printf("%i\n",re);
                        /*  while (ans!=re){ope2(a,b,o);re=b/a;
                            printf("? ="); scanf("%i",&ans); bad++;
                            //printf("%i\n",re);*/
                              if (ans!=re) {i++; bad++;}
                             else i=i+5;
                             }if (ans!=re){printf("******************game over******************\n\n"); op=0;} else op=1;
                            }fflush(stdin);
                     // }
                    if (o==3){a=ramrst(100); b=ramrst(10); ope2(a,b,o);
                    while (i<=2){ if(i>0) {ope2(a,b,o);re=a/b;}
                        printf("? ="); scanf("%i",&ans); re=a/b;//printf("%i\n",re);
                       /* while (ans!=re){ope2(a,b,o);re=a/b;
                            printf("? ="); scanf("%i",&ans); bad++;
                            //printf("%i\n",re);*/
                              if (ans!=re) {i++; bad++;}
                             else i=i+5;
                             }if (ans!=re){printf("******************game over******************\n\n"); op=0;} else op=1;
                            }fflush(stdin);
                  //  }

                    if (ans==re) good++;
            fflush(stdin); i=0;
     if(op==1) {printf("desea continuar? s/n");
      scanf("%c",&resp);}
      else resp='n';
  } printf("******************\n* correcto: %i  *\n",good); printf("* incorrecto: %i *\n******************\n",bad);



}
int tiempo(float a){
    int i,minut=0;
    for(i=60;i<=a;i=i+60)
        minut++;
return minut;
}
int main(){
    int num,resp,pro;
    long int start,fin;
    printf("BINEVENIDO AL MUNDO DE LAS OPERACIONES ARITMETICAS\n");
    printf("RESPONDA LO SIGUIENTE:\n");
    pro=quest(); //printf("%i\n",pro);
    if (pro==1){
    printf("1. CALCULOS MENTALES\n2. ADIVINA SI PUEDES\n3. SALIR\n");
    printf("INTRODUZCA SU OPCION:");
    scanf("%i",&resp);
    time(&start);
    if (resp==1)
        calc();
        if (resp==2)
            adiv();
        if (resp==3) {
                printf("Chao. ^.^");
            Sleep(750);
            exit(-1);}
time(&fin);
 tiempo(difftime(fin,start));
    printf("timepo: %i minutos %.0f segundos", tiempo(difftime(fin,start)),difftime(fin,start)-60*tiempo(difftime(fin,start)));
    }

getch();
return 0;
}
