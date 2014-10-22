import java.util.HashMap;


class RemoveDuplicates{

    private HashMap<Integer, Boolean> hm;
    

    void findAndRemoveDuplicates(PopulateDeleteNode list){
        
        
        
        hm = new HashMap<Integer, Boolean>();
        
        
        LinkedList traverser = list.getHead();

              LinkedList prev = traverser;
             

            if(prev!=null){
            
              hm.put(traverser.getData(),true);
              traverser = traverser.getNext();
  
              while(traverser != null){
    
                if(hm.containsKey(traverser.getData())){
                           
                    prev.setNext(traverser.getNext());
                    LinkedList delNode = traverser;
                    traverser = traverser.getNext();
                    delNode = null;    

                }

                else{
              
                  hm.put(traverser.getData(),true);  
                  traverser = traverser.getNext();
                  prev = prev.getNext();
                
                }
              }
            }
            else{
            
                System.out.println("Empty List");
            }
  
        hm.clear();
    }


    void findAndRemoveDuplicatesInPlace(PopulateDeleteNode list){


        LinkedList parentTraverser = list.getHead();

        while(parentTraverser!=null){
        
        
            LinkedList prev = parentTraverser;
            LinkedList temp;

            LinkedList childTraverser = parentTraverser.getNext();

            while(childTraverser != null){
            
             
             if(parentTraverser.getData() == childTraverser.getData()){
            
                    prev.setNext(childTraverser.getNext());
                    temp = childTraverser;
                    childTraverser = childTraverser.getNext();
                    temp = null;
            
             }
             else{
            
                    childTraverser = childTraverser.getNext();
                    prev= prev.getNext();
                
             }
            
            }
        
            parentTraverser=parentTraverser.getNext();
        
        
        }

        System.out.println("Done Dona Done Done");
        
    

    }


    public static void main(String args[]){

        PopulateDeleteNode p = new PopulateDeleteNode();
        p.makeLinkedList();
       // p.viewNodes();
        System.out.println();

        RemoveDuplicates r = new RemoveDuplicates();
       // r.findAndRemoveDuplicates(p);
       
        r.findAndRemoveDuplicatesInPlace(p);
        p.viewNodes();
        
    
    }
    
    
}
