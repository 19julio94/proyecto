
package proyecto;

/**
 *
 * @author Julián
 */
public class Pregunta {

    private String pregunta, respuestaA, respuestaB, respuestaC, correct;

    public Pregunta() {
    }

    public Pregunta(String pregunta, String respuestaA, String respuestaB, String respuestaC, String correct) {
        this.pregunta = pregunta;
        this.respuestaA = respuestaA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
        this.correct = correct;
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

    public String getCorrect() {
        return correct;
    }

}
