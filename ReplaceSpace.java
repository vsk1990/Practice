class ReplaceSpace{

    

    public static void main(String[] args){
    

        char[] myArray = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
        int totStrLength = myArray.length;
        int strLen = 13;
        int swapindex =totStrLength - 1;

        for(int i = strLen-1; i >= 0; i-- ){
        
            if(myArray[i]!=' '){
            
                char temp = myArray[swapindex];
                myArray[swapindex]= myArray[i];
                myArray[i] = temp;
                swapindex--;
            
            }
            else{
            
                myArray[swapindex--]='0';
                myArray[swapindex--]='2';
                myArray[swapindex--]='%';
            
            }

        
        }
        for(int i = 0; i < totStrLength;i++){


            System.out.print(myArray[i]);
        }
    
    }



}
