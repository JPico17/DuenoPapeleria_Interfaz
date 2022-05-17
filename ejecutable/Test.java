package ejecutable;

import controlador.Controlador;
import modelo.Papeleria;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Papeleria miModelo = new Papeleria((double) 0);
        //miModelo.setPrecio(2000);
        //miModelo.hallarGanacia();
        //System.out.println("Precio: " + miModelo.getPrecio());
        //System.out.println("Ganancia: " + miModelo.getGanancia());
        //System.out.println("Precio venta: " + miModelo.getPrecioVenta());

        Controlador miControlador = new Controlador(miVentana, miModelo);
        
    }
    
}
