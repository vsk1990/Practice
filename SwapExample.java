import java.util.*;

class SwapExample{
 
    public void  swap(Integer a, Integer b){
    
        Integer temp = a;
        a = b;
        b = temp;
        


    
    }
    public static void main(String[] str){
    
        
        SwapExample s = new SwapExample();
        Integer a = 1;
        Integer b = 2;
        s.swap(a,b);
        System.out.println(a);
        System.out.println(b);
    
    }

 }
