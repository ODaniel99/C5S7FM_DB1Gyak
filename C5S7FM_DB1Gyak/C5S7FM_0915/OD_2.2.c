#include <stdio.h>
#include <stdlib.h>
void pelda();

int main()
{
    pelda();
    return 0;
}

void pelda(){
    FILE *fp;
    char ch;
    char fnev[50];
    printf("File name (50 characters): ");
    scanf("%s", fnev);
    fp = fopen(fnev, "w");
    printf("Message: ");
    while((ch=getchar()) != '#'){
        putc(ch, fp);
    }
    fclose(fp);

    fp = fopen(fnev, "r");
    while ((ch = getc(fp)) != EOF){
        printf("%c", ch);
    }
    fclose(fp);
}
