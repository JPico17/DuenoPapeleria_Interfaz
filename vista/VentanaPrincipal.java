package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    // Atributos
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    //Métodos

    // Método costructor
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        //Crear y agregar PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480, 200);
        this.add(miPanelEntradaDatos);

        //Crear y agregar PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,215,480, 100);
        this.add(miPanelOperaciones);

        //Crear y agregar PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,320,480, 130);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("DUEÑO PAPELERIA");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}