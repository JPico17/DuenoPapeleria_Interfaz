package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //--------------------
    // Atributos
    //--------------------
    private JLabel lX;
    private JLabel lImagen;
    private ImageIcon iImagen;
    private JTextField TfGanancia;

    //--------------------
    // Métodos
    //--------------------

    /*Método constructor*/
    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar imagen
        iImagen = new ImageIcon(getClass().getResource("logo.png"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(40,40,128,128);
        this.add(lImagen);

        //Crear y agregar etiqueta X
        lX = new JLabel("Ingrese el valor de su compra = ");
        lX.setBounds(210, 70, 300, 40);
        this.add(lX);

        //Crear y agregar caja de texto X
        TfGanancia = new JTextField();
        TfGanancia.setBounds(290, 100, 100, 20);
        this.add(TfGanancia);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.RED);
        this.setBorder(borde);
    }

    // Métodos de acceso a la informacion
    public String getGanancia()
    {
        return TfGanancia.getText();
    }

    // Metodo borrar cajas de text
    public void borrar()
    {
        TfGanancia.setText("");
    }
}