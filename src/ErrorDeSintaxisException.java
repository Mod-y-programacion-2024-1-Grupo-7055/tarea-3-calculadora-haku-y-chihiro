/**
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
public class ErrorDeSintaxisException extends Exception {

    /**
     * @param error
     */
    public ErrorDeSintaxisException(String error) {
        super("Error de sintaxis: " + error);
    }
    
}
