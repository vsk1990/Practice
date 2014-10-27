class TreeNode{


    int data;
    int key;
    
    TreeNode left;
    TreeNode right;

    public TreeNode(int key, int data){
    
        this.key = key;
        this.data = data;
        this.left = null;
        this.right = null;
    
    
    }

    public void setLeft(TreeNode node){
     
        this.left = node;
    }


    public void setRight(TreeNode node){
        
        this.right = node;
    
    }


    public TreeNode getLeft(){
    
        return this.left;    
    }


    public TreeNode getRight(){
    
        return this.right;
    }

    public void setData(int data){

        this.data = data;
    
    }

    public int getData(){
    
        return this.data;
    
    }


    public void setKey(int key){
        
        this.key = key;
    
    }

    public int getKey(){
    
        return this.key;
    
    }

}
