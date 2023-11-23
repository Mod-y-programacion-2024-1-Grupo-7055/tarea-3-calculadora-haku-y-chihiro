/**
 * Clase que nos permite evaluar la raiz en nuestra calculadora.
 */

// CLASE TERMINADA.
public class NodoRaiz extends NodoOperador {

    /**
     * Constructor de Raiz.
     * @param der
     */
    public NodoRaiz(CompositeEA der) {
	// Necesitamos que uno de los dos parametros sea nulo,
        // pues solo requerimos uno para esta función.
        // No estamos seguros de porque no funciona si hago null el
        // hijo derecho, por eso hacemos null el hijo izq.
        super(null, der);
	// Mayor que las otra operaciones y menor que los parentesis.
        precedence = 3;
    }
	
     /**
     * La evaluación del nodo. Resultado de evaluar el hijo
     * derecho en la raiz "√".
     * @return Valor de evaluar hijo der.
     */
    @Override
    public double evalua() {
        return Math.sqrt(der.evalua());
    }
}
