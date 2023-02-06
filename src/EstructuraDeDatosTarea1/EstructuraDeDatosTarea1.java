
package EstructuraDeDatosTarea1;

public class EstructuraDeDatosTarea1 {

   

    public static void main(String[] args) {
  
   
       int[][] matriz = new int[3][3];
        int derecha = 0;
        int izquierda = 0;
         while (true) {
             int rd =  (int) (Math.random()*20+1); 
         
        for (int i = 0; i < 3; i++) 
        {  // fila
            for (int j = 0; j < 3; j++)
            {  // columna
              
                  
                if (i==0&&j==0)   {  
                    matriz[0][0] = rd*2+1;
                    
                } else if(i==1&&j==1){
                    matriz[1][1] = rd*3+5;
                     } else if(i==2&&j==2){
                     matriz[2][2] = rd*7+2;
                     
                     }
                     else if(i==0&&j==2)   {  
                    matriz[0][2] = rd*6+3;
                    
                } else if(i==1&&j==1){
                    matriz[1][1] = rd*8+5;
                     } else if(i==2&&j==0){
                     matriz[2][0] = rd*11+5;
                     
                }else{
           matriz[i][j]=rd;
              
                     }
         

           System.out.print(matriz[i][j] + "  ");
                izquierda=matriz[0][0]+matriz[1][1]+matriz[2][2];
derecha=matriz[0][2]+matriz[1][1]+matriz[2][ 0];
            }
            System.out.println("");
           
        }
         System.out.println("El total de la diagonal izquierda es: "  + izquierda);
           System.out.println("El total de la diagonal derecho es: "  + derecha);
     break;
    }
   
      
}

    
}
            