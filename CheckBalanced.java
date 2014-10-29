class CheckBalanced{


public int checkBalanced(TreeNode node){
    int returnVal = 0;

    if(node == null){
    
        returnVal = 0;
    }

    else {
    
        int left = checkBalanced(node.getLeft());
        int right = checkBalanced(node.getRight());

        if(left == -1 || right == -1 || Math.abs(left-right) > 1){
            
            returnVal = -1;
        
        }

        else{
            
            returnVal = left > right? left +1: right+1;
        
        }

    }

    return returnVal;
    


}


}
