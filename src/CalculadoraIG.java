
// Importación de paquetes que nos hará mas facil la creación de la calculadora.

//Proporciona una ventana en la pantalla.
import javax.swing.JFrame;
//Un contenedor que puede almacenar un grupo de componentes.
import javax.swing.JPanel;
//Permite editar una línea de texto. Sera donde el usuario meta la operación.
import javax.swing.JTextField;
//Creación de los botones.
import javax.swing.JButton;
//Ventana para los errores
import javax.swing.JOptionPane;
//Acomodado para nuestros botones y lugar de trabajo.
import java.awt.BorderLayout;
//Cantidad de columnas y filas para los botones.
import java.awt.GridLayout;
//Encargado de la cola de eventos.
import java.awt.EventQueue;
// Puente para nuestra hacer uso de nuestra calculadora.
import java.awt.event.ActionListener;

import java.util.StringTokenizer;

public class CalculadoraIG extends JFrame {
    
    private JTextField textF;
    private Compilador comp;

    /**
     * Constructor para que arranque nuestra calculadora.
     */
    public CalculadoraIG() {
        comp = new Compilador();
        iniciarCalculadora();
    }

    //Donde ocurre la magia...
    private void iniciarCalculadora() {
        setTitle("Calculadora Ghibli");
	//Cierre de la calculadora.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//En que parte de la pantalla va a aparecer.
        setBounds(400, 200, 450, 300);


        JPanel panel = new JPanel();
	//Permite añadir objetos. Estamos poniendo los botones en el centro.
        getContentPane().add(panel, BorderLayout.CENTER);
	//Cantidad de filas, columnas y espacio entre ellos.
        panel.setLayout(new GridLayout(0, 4, 10, 10));

        textF = new JTextField(50);
	//Nuestro linea de texto ira al norte.
        getContentPane().add(textF, BorderLayout.NORTH);

        // Agregar botones

	// Botones con texto personalizado para las fun. trigonometricas.
	// y la raiz cuadrada.
	agregarBotonPerz(panel, "sin", "sin");
	agregarBotonPerz(panel, "cos", "cos");
	agregarBotonPerz(panel, "tan", "tan");
	agregarBotonPerz(panel, "√", "√");

	//Los primeros dos botones serán para borrar.
	// "C" borra todo lo que se encuentra en la línea de texto.
	// "CE" borra solo un elemento de la línea de texto.
	agregarBotonAct(panel, "C", e -> textF.setText(""));
	agregarBotonAct(panel, "CE", e -> textF.setText(textF.getText().substring(0, textF.getText().length() - 1)));
	agregarBoton(panel, "(");
	agregarBoton(panel, ")");

	agregarBoton(panel, "7");
	agregarBoton(panel, "8");
	agregarBoton(panel, "9");
	agregarBoton(panel, "/");

	agregarBoton(panel, "4");
	agregarBoton(panel, "5");
	agregarBoton(panel, "6");
	agregarBoton(panel, "*");

	agregarBoton(panel, "1");
	agregarBoton(panel, "2");
	agregarBoton(panel, "3");
	agregarBoton(panel, "-");

	// Botón para obtener el resultado de la operación
	agregarBotonAct(panel, "=", e -> calcular());
	agregarBoton(panel, "0");
	agregarBoton(panel, ".");
	agregarBoton(panel, "+");

        // Botón para salir de la calculadora.
	agregarBotonAct(panel, "Cerrar", e -> System.exit(0));

	//Ajusta el tamaño de la ventana con los botones.
        pack();
    }

    
    /**
     * Método para agregar los botones menos complicados.
     * @param panel
     * @param text
     */
    private void agregarBoton(JPanel panel, String str) {
        agregarBotonAct(panel, str, e -> textF.setText(textF.getText() + str));
    }

    /**
     * Método para agregar los botones personalizados para las funciones
     * trigonometricas y la raiz.
     * @param panel
     * @param buttonText
     * @param textToAdd
     */
    private void agregarBotonPerz(JPanel panel, String str, String añadir) {
        JButton button = new JButton(str);
        button.addActionListener(e -> textF.setText(textF.getText() + añadir));
        panel.add(button);
    }

    /**
     * Método para agregar los botones que borraran y el igual.
     * @param panel
     * @param text
     * @param action
     */
    private void agregarBotonAct(JPanel panel, String str, ActionListener act) {
        JButton button = new JButton(str);
        button.addActionListener(act);
        panel.add(button);
    }

    /**
     * Método para calcular la operación que se ingreso en la calculadora
     */
    private void calcular() {
        try {
            StringTokenizer tokenizer = comp.analisisLexico(textF.getText());
            CompositeEA resultado = comp.arbolDeAnalisisSintactico(tokenizer);
            textF.setText(String.valueOf(resultado.evalua()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método main para abrirNuestraCalculadora
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CalculadoraIG frame = new CalculadoraIG();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

