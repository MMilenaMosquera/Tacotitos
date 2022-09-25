
package tacotitos.Entidades;

public class TipoIngrediente {
    protected String detalle;
    protected int cantidadMax;

    /*contructor*/
    public TipoIngrediente(String detalle, int cantidadMax) {
        this.detalle = detalle;
        this.cantidadMax = cantidadMax;
    }   
    
   /*geters and seters*/
    
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    @Override
    public String toString() {
        return "TipoIngrediente{" + "detalle=" + detalle + ", cantidadMax=" + cantidadMax + '}';
    }
    
}
