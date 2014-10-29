import java.util.Stack;


class TreeTraversal{


    TreeNode root;

    public TreeTraversal(){
    
        root = null;
    
    }



    public void addNode(TreeNode node, TreeNode parent){
    


            if(node.getKey() < parent.getKey()){
        
                
                
                if(parent.getLeft() != null){
                
                    addNode(node,parent.getLeft());
                }
                else{
                
                    parent.setLeft(node);
                
                }

            }


            else{
            
                if(parent.getRight() != null){
                    
                    addNode(node,parent.getRight());
                
                }

                else{
                
                    parent.setRight(node);

                }

            
            } 
    
    }

    public void createTree(int key, int data){
    
        TreeNode node = new TreeNode(key,data);
        
        if(this.root == null){
            
            this.root = node;
            this.root.setLeft(null);
            this.root.setRight(null);
        }
        
        else{
            addNode(node, this.root); 
        }
    }


    public void makeTree(){
    

        createTree(6,6);
        //createTree(7,7);
        createTree(9,9);
        //createTree(12,12);
        //createTree(13,13);
        //createTree(0,0);
        createTree(8,8);
        //createTree(5,5);
        createTree(2,2);
        createTree(1,1);
        createTree(4,4);
        createTree(15,15);
        //createTree(16,16);
        
        
    }


    public TreeNode getRoot(){
    

        return this.root;

    
    }

    
    public void inOrderPrint(TreeNode node){
    
        if(node == null){
        
            return;
        
        }
        else{
        
            inOrderPrint(node.getLeft());
            System.out.println(node.getData());
            inOrderPrint(node.getRight());
        
        }

    }

    public void preOrderPrint(TreeNode node){
        
        if(node == null){
            
            return;
        }
        else{
            
            System.out.println(node.getData());
            preOrderPrint(node.getLeft());
            preOrderPrint(node.getRight());
        
        }
    }


    public void postOrderPrint(TreeNode node){
    
        if(node == null){
        
            return;
        
        }
        else{
        
            postOrderPrint(node.getLeft());
            postOrderPrint(node.getRight());
            System.out.println(node.getData());

        }
    
    }


    public void postOrderPrintI(TreeNode node){
        
        if(node == null){
        
            return;
        
        }

        TreeNode visitedNode = null;
        TreeNode myNode = node;

        Stack<TreeNode> post = new Stack<TreeNode>();
        
        post.push(myNode);

        while(true){
        
        while( myNode.getLeft() != null &&  myNode.getRight() != visitedNode &&  myNode.getLeft() != visitedNode){

                post.push(myNode.getLeft());
                myNode = myNode.getLeft();
                
                visitedNode = myNode; 
            
            

        }

        
        if( myNode.getRight() != null ){
            
            
            if(myNode.getRight() != visitedNode){
            
            myNode = myNode.getRight();
            post.push(myNode);
            visitedNode = myNode;
            }
            
        }
        if((myNode.getRight() == null && (myNode.getLeft() == visitedNode || myNode.getLeft() == null)) || (myNode.getRight() == visitedNode)){
            visitedNode = post.pop();
            System.out.println(visitedNode.getData());
        
        }

        if(post.empty()){
        
            break;
        }

        myNode = post.peek();
        
        }
    

    }




    public static void main(String[] args){
    
            
       TreeTraversal tree = new TreeTraversal();
       tree.makeTree();
       tree.inOrderPrint(tree.getRoot());

       System.out.println();
        
       System.out.println();
       System.out.println();

       tree.preOrderPrint(tree.getRoot());

       
       System.out.println();
       System.out.println();
       System.out.println();
       tree.postOrderPrint(tree.getRoot());
       System.out.println();
       System.out.println();
       System.out.println();
       tree.postOrderPrintI(tree.getRoot());

       CheckBalanced cb = new CheckBalanced();
       int ret = cb.checkBalanced(tree.getRoot());
       if(ret == -1){
        System.out.println("Not Balanced");
       }
       else{
        System.out.println("Balanced");
       
       }
    
    }




}
