/**
* Clase para poder agregar la función de Coseno
* a nuestra calculadora
*/
//CLASE FINAL
public class NodoCoseno extends NodoOperador {
    
    /**
     * Constructor.
     * @param der
     */
    public NodoCoseno(CompositeEA der) {
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
     * derecho en cos().
     * @return Valor de evaluar hijo der.
     */
    @Override
    public double evalua() {
        return Math.cos(Math.toRadians(der.evalua()));
    }
}
