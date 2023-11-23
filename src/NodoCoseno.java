public class NodoCoseno extends NodoOperador {

    public NodoCoseno(CompositeEA izq) {
        super(izq, null);
        precedence = 2;
    }

    @Override
    public double evalua() {
        return Math.cos(Math.toRadians(izq.evalua()));
    }
}
