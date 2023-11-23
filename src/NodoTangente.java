/**
 * Clase que nos permite evaluar la Tangente de un número
 * en nuestra calculadora.
 */

//CLASE TERMINADA
public class NodoTangente extends NodoOperador {

/**
 * Constructor de la Tangente.
 * @param izq
 */        
  public NodoTangente(CompositeEA der) {
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
   * derecho en tan().
   * @return Valor de evaluar hijo der.
   */
  @Override
  public double evalua(){
      return Math.tan(Math.toRadians(der.evalua()));
    }    
}
  


