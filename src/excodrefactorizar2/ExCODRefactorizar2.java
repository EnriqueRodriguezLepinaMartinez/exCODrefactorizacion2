/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excodrefactorizar2;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class ExCODRefactorizar2 {

    /**
     * @param args the command line arguments
     */
    
    /**Método que averigua el numero*/
    public static void ElBuenBucle(int h, int k, int i){
           if (h == 0)
k = 1;
   else
   {
k = 1;
for (i = h; i >= 1; i--)
{
    k = k * i;
}
   }    
  
     System.out.println(k); 

    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
   /**Datos introducidos para averiguar el numero*/
        
    int hache = 8;
    int ka = 0;
    int ii = 0;
    
    ElBuenBucle(hache,ka,ii);
    

    }
    
}
