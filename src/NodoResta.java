/** 
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */

//Clase terminada...
public class NodoResta extends NodoOperador {
    
    /**
     * Constructor de la resta.
     * @param izq
     * @param der
     */
    public NodoResta(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 0;
    }

    /**
     * * La evaluación del nodo, resta la evaluación de los hijos izquierdo y derecho.
     * @return El resultado de la resta entre nuestro hijo izquierdo menos el hijo derecho.
     * Si el hijo izquierdo es nulo, regresaremos el valor negativo del hijo derecho.
     */
    @Override
    public double evalua() {
        if (izq == null) 
            return -der.evalua();
        return izq.evalua() - der.evalua();
    }
}
