package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //--------------------
    // Atributos
    //--------------------
    public JButton btHallar;
    public JButton btBorrar;
    public JButton btSalir;

    //--------------------
    // Métodos
    //--------------------

    /*Método constructor*/
    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agrear boton Hallar
        btHallar = new JButton("Hallar");
        btHallar.setBounds(45, 40, 100, 20);
        this.add(btHallar);
        btHallar.setBackground(Color.pink);
        btHallar.setActionCommand("hallar");

        //Crear y agrear boton Borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(190, 40, 100, 20);
        this.add(btBorrar);
        btBorrar.setBackground(Color.pink);
        btBorrar.setActionCommand("borrar");

        //Crear y agrear boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(335, 40, 100, 20);
        this.add(btSalir);
        btSalir.setBackground(Color.pink);
        btSalir.setActionCommand("salir");

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }
}
