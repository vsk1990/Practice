import java.util.*;

class FindIfUnique{

    private HashMap<Character,Boolean> storeHouse = new HashMap<Character,Boolean>();

    public int check(String s){
   
        for(int i = 0; i< s.length(); i++){
        
             char c = s.charAt(i);
             if(storeHouse.containsKey(c)){
        
                return -1;
        
             }
             else{

                    storeHouse.put(c,true);
    
             }
    

        }
    
        return 0;
    }

}

class FindIfUniqueInPlace{

    public int check(){
    
        //Quick sort and traverse
        return 0;
    
    
    }

}


class MainClass{

    public static void main(String[] args){
    
        FindIfUnique findObj = new FindIfUnique();
        
        int i = findObj.check("Helo");
        if(i==0){
            
            System.out.println("String is unique");
        
        }
        else{
            
            System.out.println("String is not unique");
        
        }

    }

}


