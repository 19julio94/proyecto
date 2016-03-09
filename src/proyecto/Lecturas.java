package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julián
 */
public class Lecturas {

    ArrayList<Pregunta> lista = new ArrayList();

   

    public void lerFich() {
        Scanner sc = null;
        try {
            File f = new File();
            sc = new Scanner(f);
            // tamen : sc = new Scanner(new File(nomeFich));
            while (sc.hasNextLine()) {
                String res = sc.nextLine();
                System.out.println(res);
                // tamen:  System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("erro1 " + ex.toString());
        } finally {
            sc.close();
        }
    }

}
