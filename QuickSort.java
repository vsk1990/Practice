import java.util.*;
import java.lang.*;


class QuickSort{

    
    
    int spliter( Integer[] a, int lo, int hi){
    

        int pivot = lo;
        int i = lo + 1;
        int j = hi;

        

        while(true){
            while(i <= j){

                if(a[i] < a[pivot]){
                    i++;
                 }
                else{ 
                
                    break;
                }
            }
        while(j > i){
        
            if(a[j]>=a[pivot]){
                j--;        
            
            }
            else{
            
                break;
            
            }

        }

        if(i>=j){

            break;
        }

            Integer temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        
        }

        
        Integer temp = a[lo];
        a[lo] = a[i-1];
        a[i-1] = temp;
        return (i-1);
    
        
    
    }
   



    void  sort(Integer[] a, int lo, int hi){
        if(lo >= hi){
        
            return;

        }
       int splitIndex = spliter(a,lo,hi);
        
       //recursively do this for for all split arrays
       sort(a,lo,(splitIndex-1));
       sort(a,(splitIndex+1),hi);
    }
    
    
    
    
    public static void main(String[] args){
    
        Integer[] a = {1,5,18,88,9,3,2};
       
        QuickSort qs = new QuickSort();

        qs.sort(a,0,a.length-1);
        
    
       
       for(int i = 0; i< a.length; i++){
        
                System.out.print(a[i]+"  ");
            
        }

       System.out.println("");
        
    } 
}


