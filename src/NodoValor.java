/**
 * Clase que nos modelará a los nodos que tienen un valor aritmético.
 */

//Clase Terminada...

public class NodoValor implements CompositeEA {

    double valor;

    /**
     * Constructor del valor.   
     * @param valor
     */
    public NodoValor(double valor) {
        this.valor = valor;
    }

    /**
     * La evaluación de estos nodos comprende en únicamente devolver el valor
     * que guardan.
     * @return el valor del nodo.
     */
    @Override
    public double evalua() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + "";
    }

}
