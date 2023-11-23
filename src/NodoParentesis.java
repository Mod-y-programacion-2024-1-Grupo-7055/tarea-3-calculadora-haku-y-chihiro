/**
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */ 

//CLASE TERMINADA
public class NodoParentesis extends NodoOperador {

    /**
     * Constructor de los parentesis
     */
    public NodoParentesis() {
        super();
        //La mayor precedencia.
        precedence = 4;
    }

    /**
     * @throws UnsupportedOperationException debido a que los parantesis
     * no tienen un valor numerico.
     */
    @Override
    public double evalua() {
        throw new UnsupportedOperationException("No se puede evaluar un parentesis");
    }

}
