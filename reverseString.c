#include<stdio.h>
#include<string.h>


int main(int argc,char *argv[]){


    printf("String = ");


    char *str = argv[1];

    int length = strlen(argv[1]);


    
    for(int i = 0; i<length; i++){

        printf("%c",str[i]);
    


    }



        printf("\n");
    for(int i = 0; i<length/2; i++ ){

    
        char temp;

        temp = str[i];
        str[i] = str[length-1-i];
        str[length -1 - i] = temp;
    
    
    }

    
    for(int i = 0; i<length; i++){

        printf("%c",str[i]);


    }
    
        printf("\n");
    

return 0;

}
