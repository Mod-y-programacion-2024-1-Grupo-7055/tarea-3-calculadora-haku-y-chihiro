public class NodoCoseno extends NodoOperador {

    public NodoCoseno(CompositeEA der) {
        super(null, der);
        precedence = 2;
    }

    @Override
    public double evalua() {
        return Math.cos(Math.toRadians(der.evalua()));
    }
}
