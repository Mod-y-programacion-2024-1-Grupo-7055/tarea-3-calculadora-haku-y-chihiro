/**
 * Clase que nos permite evaluar la Tangente de un número
 * en nuestra calculadora.
 */

//Clase terminada...
public class NodoTangente extends NodoOperador {

/**
 * Constructor de la Tangente.
 * @param izq
 */        
  public NodoTangente(CompositeEA izq) {
    // Dado que esta operación solo necesita un parametro,
    // haremos que el hijo derecho sea nulo.
    super(izq, null);
    //Esto no estoy seguro aun.
    precedence = 2;
  }

/**
 * La evaluación del nodo, la tangente del hijo izquierdo.
 * @return la tangente en radianes del hijo izquierdo.
 */
  @Override
  public double evalua(){
      return Math.tan(Math.toRadians(izq.evalua()));
    }    
}
  


