/**
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */

//Clase terminada...
public class NodoMultiplicacion extends NodoOperador {

    /**
     * Construtor de la multiplicación
     * @param izq
     * @param der
     */
    public NodoMultiplicacion(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 1;
    }

    /**
     * La evaluación de los nodos. Resultado de la multiplicación entre
     * hijo izquierdo e hijo derecho.
     * @return Valor de multiplicar izq. por der.
     */
    @Override
    public double evalua() {
        return izq.evalua() * der.evalua();
    }

}
