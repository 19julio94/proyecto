package proyecto;
import javax.swing.JOptionPane;
/**
 *
 * @author Julián
 */
public class Proyecto {

    public static void main(String[] args) {


        Datos obj1 = new Datos();
        Cronometro t = new Cronometro();
        t.iniciar();
//**************************************
        obj1.escribir_iniciales("Iniciales.txt");

        Lecturas.lerFich();
        Pregunta.preguntar();
      
        
 //*****************************************************      
        t.parar();
        
        JOptionPane.showMessageDialog(null,"Minutos " + t.getMinutos() + "\n" + "segundos " + t.getSegundos());
        Lecturas.leeriniciales();
    }
}

