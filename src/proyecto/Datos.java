package proyecto;
import Imp.JPANE;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Julián
 */
public class Datos {

    public void escribir_iniciales(String nomeFich) {
        FileWriter f = null;
        PrintWriter escribir = null;
        try {
            f = new FileWriter(nomeFich, true);
            escribir = new PrintWriter(f);
          // String esc= JPANE("Introduce las iniciales");
            String esc = JOptionPane.showInputDialog("Introduce tus iniciales");
            escribir.append(esc);
            escribir.append("\n");

        } catch (IOException ex) {
            System.out.println("erro escritura" + ex.getMessage());
        } finally {
            escribir.close();

        }

    }
    
    
}
