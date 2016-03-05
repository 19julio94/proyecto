
package proyecto;

/**
 *
 * @author Julián
 */
public class Cronometro {
    private long inicio, fim;
 
    public void iniciar(){
        inicio = System.currentTimeMillis();
    }
 
    public void parar(){
        fim = System.currentTimeMillis();
    }
 
    public long getTempo() {
        return fim-inicio;
        
    }

 
    public double getSegundos() {
        return (fim - inicio) / 1000.0;
    }
 
    public double getMinutos() {
        return (fim - inicio) / 60000.0;
    }
    
}
