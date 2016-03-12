package proyecto;

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
//       Lecturas.leeriniciales();

        //*****************************************************      
        t.parar();
        System.out.println("Minutos " + t.getMinutos() + "\n" + "segundos " + t.getSegundos());

    }
}
