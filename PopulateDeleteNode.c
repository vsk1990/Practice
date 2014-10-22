#include<stdio.h>
#include<stdlib.h>



typedef struct node{

    int data;
    struct node *next;


}linkedlist;





linkedlist *addToList(linkedlist *list,int value){
    
    linkedlist *traverser = list;
    
    linkedlist *node;
    node = (linkedlist *)malloc(sizeof(linkedlist));
    node->data = value;
    node->next = NULL;

    if(traverser == NULL){
        
        printf("Set first Node");
        list  = node;
    
    }
    
    else{

        while(traverser->next != NULL){
            
            traverser = traverser -> next;
            
        }

        traverser->next = node;
    }

    return list;


}



void printList(linkedlist *list){

    
    linkedlist *traverser = list;
    
    while(traverser != NULL){
    
        printf("\t %d",traverser->data);
   
        traverser = traverser -> next;

    }

    printf("\n");

}


void deletelist(linkedlist *list){

   printf("\nFreed list\n");
    
    
    linkedlist *traverser = list;

    linkedlist *temp;


    if(traverser == NULL){
    
        printf("\nList is Empty\n");
    
    }



    
    while(traverser != NULL){
    
        temp = traverser;
        traverser = traverser->next;
        free(temp);
    
    
    }


}

int main(){

    linkedlist * list = NULL;

    list = addToList(list,1);
    list = addToList(list,3);
    list = addToList(list,3);
    list = addToList(list,3);
    list = addToList(list,6);
    list = addToList(list,2);
    list = addToList(list,0);
    list = addToList(list,6);
   
    printList(list);

    deletelist(list);

    return 0;

}
