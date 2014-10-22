class PopulateDeleteNode{

    LinkedList firstNode;
    LinkedList traverser;

    public PopulateDeleteNode(){
    
        firstNode = null;
    
    }
    
    public void addNode(int data){
        
        
        LinkedList listVal = new LinkedList(data);

        traverser = firstNode;
        
        if(traverser == null){
        
            firstNode = listVal;           
        
        }

        else{

            while( traverser.next != null){
        
                traverser = traverser.next;
        
            }

            traverser.next = listVal;
        
        }

    }

    public void viewNodes(){
        
        traverser = firstNode;
        
        while(traverser!=null){
        
            System.out.print(traverser.getData()+" ");
            traverser = traverser.getNext(); 
        }
        
    }

    public LinkedList getHead(){
    
        
        return this.firstNode;
    
    
    }

    public void deleteNode(LinkedList node){
    
        traverser = firstNode;

        if(traverser == null){
        
            System.out.println("List is empty");
        
        }

        else if(traverser == node){
        
            firstNode = traverser.getNext();

            System.out.println("Node deleted with value: "+traverser.getData());
            traverser = null; 
        }

        else{

        
        
            LinkedList prev = firstNode;
            traverser = traverser.getNext();

            while(traverser != null){
            
                if(traverser == node){
                
                    prev.setNext(traverser.getNext());

                    System.out.println("Node deleted with value: "+traverser.getData());
                
                    traverser = null;
                    break;
                }
         
                traverser = traverser.getNext();
                prev = prev.getNext();
            }


        }
    
    }


    public void makeLinkedList(){
    
        
            addNode(1);
            addNode(3);
            addNode(4);
            addNode(0);
            addNode(10);
            addNode(6);
            addNode(4);
            addNode(1);
            addNode(8);
            addNode(9);
            addNode(8);
            addNode(8);
            viewNodes();
    
    }


}
