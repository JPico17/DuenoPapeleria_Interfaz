package vista;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import org.w3c.dom.Text;

public class PanelResultados extends JPanel
{
    private static final Dimension Text = null;
    //--------------------
    // Atributos
    //--------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    //--------------------
    // Métodos
    //--------------------

    /*Método constructor*/
    public PanelResultados()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,460, 100);
        this.add(spResultado);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
    }

    // Metodo de acceso a la información
    public void mostrarResultado(double ganancia, double precioVenta)
    {
        taResultado.setText("El valor del producto es : " + precioVenta + " y la ganancia es de "+ganancia);
    }

    // Borrar resultados
    public void borrar()
    {
        taResultado.setText("");
    }
}
