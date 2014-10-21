class RotateImage{

    public static void main(String[] args){
    
        char[][] a = {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'}};
        System.out.println("");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4;j++){
                
                System.out.print(a[i][j]);
                System.out.print("\t");

               
            }
            System.out.println("");
        }

        for(int layer = 0; layer < 2; layer++){
        
            for(int i = 0; i<4-2*layer-1; i++){
            
                char temp = a[layer][layer+i];
                a[layer][layer+i] = a[3-layer-i][layer];
                a[3-layer-i][layer] = a[3-layer][3-layer-i];
                a[3-layer][3-layer-i] = a[layer+i][3-layer];
                a[layer+i][3-layer] = temp;


            }

        
        }


        System.out.println("");

        for(int i = 0; i<4; i++){

            for(int j = 0; j<4;j++){

                System.out.print(a[i][j]);

                System.out.print("\t");

            }

        System.out.println("");

        }

    }

}
