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
            File f = new File("videojuegos.txt");
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String res = sc.nextLine();
                //   System.out.println(res);
                String[] cachos = res.split("@");
//                String[] cachos2 = res.split("@");
//                String[] cachos3 = res.split("@");
//                String[] cachos4 = res.split("@");
                

                System.out.println(cachos[1]+("\n") + cachos[2] + cachos[3] + cachos[4]);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("erro1 " + ex.toString());
        } finally {
            sc.close();
        }
    }

}
