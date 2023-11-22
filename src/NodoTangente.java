/**
 * Clase que nos permite evaluar la Tangente en nuestra calculadora.
 */
public class NodoTangente extends NodoOperador {

/**
 * Constructor
 *
 * @param izq
 */        
  public NodoTangente(CompositeEA izq) {
    // Dado que esta operación solo necesita un parametro,
    // haremos que el hijo derecho sea nulo.
    super(izq, null);
    //Esto no estoy seguro aun.
    precedence = 3;
  }

/**
 * La evaluación del nodo, la tangente del hijo izquierdo.
 * @return la tangente en radianes del hijo izquierdo.
 */
  @Override
  public double evalua(){
      // La manera de resolverlo por omisión seria por radianes.
      return Math.tan(Math.toRadians(izq.evalua()));
    }    
}
  








  
}
