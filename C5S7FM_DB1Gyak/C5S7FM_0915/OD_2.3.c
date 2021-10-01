#include <stdio.h>
#include <stdlib.h>
void pelda();

int main()
{
    pelda();
    return 0;
}

void pelda(){
    FILE *fp1, *fp2;
    char ch;
    char fnev[50];
    printf("Olvasas fajlneve (50 karakter): ");
    scanf("%s", fnev);
    fp1 = fopen(fnev, "r");

    if(!fp1){
        printf("Error!");
        exit(0);
    }

    printf("Iras fajlneve (50 karakter): ");
    scanf("%s", fnev);
    fp2 = fopen(fnev, "w");
    while ((ch = getc(fp1)) != EOF){
        printf(ch, fp2);
    }
    printf("Kesz.");
    fclose(fp1);
    fclose(fp2);
}
