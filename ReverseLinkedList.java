class ReverseLinkedList {

    PopulateDeleteNode  reverseLinkedList(PopulateDeleteNode list){
    
    
                LinkedList tag1;
                LinkedList tag2;
                LinkedList tag3;

                if(list.getHead()==null){
                
                    System.out.println("Empty List");
                
                }
                else if(list.getHead().getNext() == null){
                    
                    return list;
                                
                }

                else{
                    tag1 = list.getHead();
                    tag2 = list.getHead().getNext();
                    tag3 = list.getHead().getNext().getNext();
                
                   while(tag3 != null){ 
                        tag2.setNext(tag1);
                        
                        if(tag1 == list.getHead()){
                            tag1.setNext(null); 
                        }
                        tag1 = tag2;
                        tag2 = tag3;
                        tag3 = tag3.getNext();
                   
                   }
                    tag2.setNext(tag1);
            
    
                list.setHead(tag2);    
    
                }
    
    return list;
    
    }


    public static void main(String args[]){


     PopulateDeleteNode pop = new PopulateDeleteNode();
     pop.makeLinkedList();
    
     //pop.viewNodes();  
     ReverseLinkedList r = new ReverseLinkedList();
    
     pop = r.reverseLinkedList(pop);
     System.out.println();
     pop.viewNodes();
    
    }
}
