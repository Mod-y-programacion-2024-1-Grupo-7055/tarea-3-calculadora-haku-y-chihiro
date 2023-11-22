/**
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
public class ErrorAritmeticoException extends Exception{
    
    /**
     * @param error
     */
    public ErrorAritmeticoException(String error) {
        super("Error aritmético: " + error);
    }
    
    
}
