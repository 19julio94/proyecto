
package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;



/**
 *
 * @author Julián
 */
public class Datos {
    
    
    
//    public void iniciales(){
//      Scanner sc = new Scanner(System.in);
//      String s;
//        System.out.println("Intoduce tus iniciales");
//        s= sc.nextLine();
//    }
    
 
         public void escribir_iniciales(String nomeFich){
        File f = new File(nomeFich);
        PrintWriter escribir= null;
        try {
           
         escribir= new PrintWriter(f);
            String esc=JOptionPane.showInputDialog("Introduce tus inicinales");
            escribir.append(esc);
            escribir.append("\n");
                      
        } catch (FileNotFoundException ex) {
            System.out.println("erro escritura"+ ex.getMessage());
           }
        finally{
            escribir.close();
         
         
         
     }
     
 }   
    
    
}
