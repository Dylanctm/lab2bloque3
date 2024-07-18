
package lab.pkg2.proyect.pkg3;

public class Lab2Proyect3 {

   
    public static void main(String[] args) {
     int minicial [][] = {{5,7,9},{4,2,1},{1,1,1}};
       int mcopia [][] = new int [3][3];
       
       int fila = 2;
       int col = 2;
        for (int i = 0; i < minicial.length; i++) {
            for (int v = 0; v < minicial[0].length; v++) {
                mcopia [fila][col] = minicial[i][v];
                col --;
                
            }
            fila--;
            col = 2;
        }
      
         for (int i = 0; i < minicial.length; i++) {
            for (int v = 0; v < minicial[0].length; v++) {
                System.out.print(mcopia[i][v] + " /"); 
            
            }
             System.out.println(" ");
            }
    }
    
}

    


       
      


        
            
        
   
