/**
 *Clase que nos permite evaluar el Coseno en nuestra calculadora.
 */

//Clase terminada...
public class NodoCoseno extends NodoOperador {

  
    /**
     * Constructor del coseno
     * @param izq
     */
    public NodoCoseno(CompositeEA izq) {
      	// Dado que esta operación solo necesita un parametro,
	      // haremos que el hijo derecho sea nulo.
        super(izq, null);
        // Eso esta por verse
        precedence = 2;
    }

   /**
    * La evaluación del nodo, el Coseno del hijo izquierdo.
    * @return el coseno en radianes del hijo izquierdo.
    */
    @Override
    public double evalua() {
        return Math.cos(Math.toRadians(izq.evalua()));
    }
}
