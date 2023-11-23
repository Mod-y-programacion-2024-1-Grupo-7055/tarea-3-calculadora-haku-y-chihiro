/**
 * Clase que nos permite evaluar el Seno en nuestra calculadora.
 */

//Clase terminada...
public class NodoSeno extends NodoOperador {

    
    /**
     * Constructor
     * @param izq
     */
    public NodoSeno(CompositeEA der) {
	// Dado que esta operación solo necesita un parametro,
	// haremos que el hijo derecho sea nulo.
        super(null, der);
	// Eso esta por verse
        precedence = 2;
    }

     /**
     * La evaluación del nodo, el seno del hijo izquierdo.
     * @return el seno en radianes del hijo izquierdo.
     */
    @Override
    public double evalua() {
	return Math.sin(Math.toRadians(der.evalua()));
    }
}

