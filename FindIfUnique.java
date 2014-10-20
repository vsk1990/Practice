import java.util.*;

class FindIfUnique{

    private HashMap<Character,Boolean> storeHouse = new HashMap<Character,Boolean>();

    public int check(String s){
  


        long time1 = System.nanoTime();
        for(int i = 0; i< s.length(); i++){
        
             char c = s.charAt(i);
             if(storeHouse.containsKey(c)){
        
        long time2 = System.nanoTime();
                
        
        System.out.println("Time: "+(time2-time1));
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

    public int check(String s){
    
       

       
        int length = s.length();
        int result = 0;
        Integer[] c = new Integer[length];
        
        long time1 = System.nanoTime();
        //Quick sort and traverse
        
        for(int i = 0; i< length; i++){
       
            c[i] = Character.getNumericValue(s.charAt(i));
        
        }

        QuickSort q = new QuickSort();
        
        q.sort(c,0,length-1);

        for(int i = 1; i< length; i++){
            
            if(c[i]==c[i-1]){
            
                result = -1;
            
            }
        }



        long time2 = System.nanoTime();
        
        System.out.println("Time: "+(time2-time1));
        return result;
            
    
    }

}


class MainClass{

    public static void main(String[] args){
    

        FindIfUniqueInPlace findObj = new FindIfUniqueInPlace();
        
        //FindIfUnique findObj = new FindIfUnique();
        int i = findObj.check("Helo");
        if(i==0){
            
            System.out.println("String is unique");
        
        }
        else{
            
            System.out.println("String is not unique");
        
        }

    }

}
