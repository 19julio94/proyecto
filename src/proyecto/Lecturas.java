package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
                //   System.out.println(res);
                String[] cachos = res.split("@");
//                String[] cachos2 = res.split("@");
//                String[] cachos3 = res.split("@");
//                String[] cachos4 = res.split("@");
                Pregunta.getLista().add(new Pregunta(cachos[0],cachos[1],cachos[2],cachos[3],cachos[4]));

                //System.out.println(cachos[0]+("\n") + cachos[1] + cachos[2] + cachos[3]);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("erro1 " + ex.toString());
        } finally {
            sc.close();
        }
    }
    
    

}
