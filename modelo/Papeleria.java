package modelo;

public class Papeleria 
{
    //----------
    //Atributos
    //----------
    private double precio;
    private double ganancia;
    private double precioVenta;
    private final double COSTO1 = 0.15;
    private final double COSTO2 = 500;
    private final double COSTO3 = 0.25;


    //----------
    //metodos
    //----------

    /*metodo constructor*/
    public Papeleria(Double pPrecio)
    {
        this.precio = pPrecio;
        this.precioVenta = 0; 
        this.ganancia = 0;
    }

    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }

    public double getGanancia() 
    {
        return ganancia;
    }
    public double getPrecioVenta() 
    {
        return precioVenta;
    }

    public double getPrecio() 
    {
        return precio;
    }

    public void hallarGanacia()
    {
        if(precio < 3000)
        {
            ganancia = precio * COSTO1;
        }
        else if(precio >= 3000 && precio <= 6000)
        {
            ganancia = COSTO2;
        }
        else
        {
             ganancia = precio * COSTO3;
        }
        precioVenta= precio + ganancia;
    }

    
}