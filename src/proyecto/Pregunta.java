
package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Julián
 */
public class Pregunta {
    private static int contador=0;
    private static ArrayList<Pregunta> lista = new ArrayList();
    private String pregunta, respuestaA, respuestaB, respuestaC,correcta;
    private int id;
    
    public Pregunta(String pregunta, String respuestaA, String respuestaB, String respuestaC,String correcta) {
        contador++;
        this.pregunta = pregunta;
        this.respuestaA = respuestaA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
        this.correcta=correcta;
        this.id=contador;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuestaA() {
        return respuestaA;
    }

    public String getRespuestaB() {
        return respuestaB;
    }

    public String getRespuestaC() {
        return respuestaC;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Pregunta> getLista() {
        return lista;
    }
    
    

    public static void preguntar(){
        for(int i=0;i<lista.size();i++){
            String respuesta;
            boolean condicion=false;
            do{
            respuesta = JOptionPane.showInputDialog(lista.get(i).getId()+ " " + lista.get(i).getPregunta()+"\n"+lista.get(i).getRespuestaA() + "\n" + lista.get(i).getRespuestaB()+"\n"+lista.get(i).getRespuestaC());
            if(respuesta.equalsIgnoreCase("a")||respuesta.equalsIgnoreCase("b")||respuesta.equalsIgnoreCase("c")){
                if(respuesta.equalsIgnoreCase(lista.get(i).correcta)){
                    System.out.println("correcto");
                    condicion=false;
                }else{
                    System.out.println("incorrecto");
                    condicion=false;
                }
            }else{
                System.out.println("Formato de respuesta incorrecto");
                condicion=true;
            }
            }while(condicion);
        }
    }
    
    

}
