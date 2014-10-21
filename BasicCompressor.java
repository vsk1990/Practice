import java.lang.StringBuilder;


class BasicCompressor{



    private String  compress(String compress){

        StringBuilder strb = new StringBuilder();
            int counter = 0;
        
        for(int i = 0; i< compress.length(); i++){
         
            if(i==0){

                strb.append(compress.charAt(i));
                counter++;   
            }   
            
            else{
            
            
                if(compress.charAt(i)!= compress.charAt(i-1)){
                    strb.append(""+counter);
                    counter = 0;
                    strb.append(compress.charAt(i));
                    counter++;
                }
                else{

                    counter++;
                }

            
            
            }
            

        }
        strb.append(""+counter);
    
        return strb.toString();
    }


    public static void main(String args[]){
    
        BasicCompressor b = new BasicCompressor();
        String compressedStr = b.compress(args[0]);
        System.out.println(compressedStr);
    
    
    }


}

