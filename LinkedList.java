class LinkedList{
    
    int data;
    LinkedList next;



    public LinkedList(int data){
    
        this.data = data;
        this.next = null;
    
    }
    

    public int getData(){

        return this.data;
    
    }
    
    public LinkedList getNext(){
        
        return this.next;

    }

    public void setNext(LinkedList list){
    
        this.next = list;

    }
}
