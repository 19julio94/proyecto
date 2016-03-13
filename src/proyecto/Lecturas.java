package proyecto;
import Imp.JPANE;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
       
/**
 *
 * @author Julián
 */
public class Lecturas {

    public static void lerFich() {
        Scanner sc = null;
        try {
            File f = new File("build/classes/proyecto/videojuegos.txt");
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String res = sc.nextLine();

                String[] cachos = res.split("@");

                Pregunta.getLista().add(new Pregunta(cachos[0], cachos[1], cachos[2], cachos[3], cachos[4]));

            }

        } catch (FileNotFoundException ex) {
            System.out.println("erro1 " + ex.toString());
        } finally {
            sc.close();
        }
    }
    
    
      public static void leeriniciales() {
        Scanner Scan = null;
        try {
            File fi = new File("Iniciales.txt");
            Scan = new Scanner(fi);
            while (Scan.hasNextLine()) {
                String resp = Scan.next();
                JOptionPane.showMessageDialog(null, resp);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("erro1 " + ex.toString());
        } finally {
            Scan.close();
        }
    }


    

}
