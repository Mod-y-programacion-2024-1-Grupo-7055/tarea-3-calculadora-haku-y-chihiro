/**
 *
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
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
     * @throws NullPointerException si alguna de los hijos es nulo.
     */
    @Override
    public double evalua() {
        if (izq == null || der == null)
            throw new NullPointerException("Error en la suma. Uno de los valores es nulo.");
        return izq.evalua() + der.evalua();
    }
}
