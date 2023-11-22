/**
 * Clase que nos permite evaluar la raiz en nuestra calculadora.
 */

// Clase terminada...
public class NodoRaiz extends NodoOperador {

    /**
     * Constructor de Raiz.
     * @param izq
     */
    public NodoRaiz(CompositeEA izq) {
	// Dado que esta operación solo necesita un parametro,
	// haremos que el hijo derecho sea nulo.
        super(izq, null);
	// Eso esta por verse
        precedence = 2;
    }

    /**
     * La evaluación del nodo, la raiz del hijo izquierdo.
     * @return la raiz de nuestro hijo izquierdo.
     */
    @Override
    public double evalua() {
        return Math.sqrt(izq.evalua());
    }
}
