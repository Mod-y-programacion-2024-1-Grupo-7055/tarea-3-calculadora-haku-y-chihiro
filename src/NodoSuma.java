/**
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */

//Clase terminada...
public class NodoSuma extends NodoOperador {

    /**
     * Constructor de la suma.
     * @param izq
     * @param der
     */
    public NodoSuma(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 0;
    }

    /**
     * La evaluación del nodo, suma la evaluación de los hijos izquierdo y derecho
     * @return la suma entre nuestro hijo izquierdo y derecho.
     */
    @Override
    public double evalua() {
        return izq.evalua() + der.evalua();
    }
}
