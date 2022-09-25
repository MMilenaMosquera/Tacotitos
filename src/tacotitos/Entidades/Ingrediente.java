
package tacotitos.Entidades;

public class Ingrediente {
    protected String nombreIngrediente;
    protected float precio;
    protected TipoIngrediente tipoIngrediente;

    
    /*Constructures*/
     public Ingrediente(String nombreIngrediente, float precio, TipoIngrediente tipoIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
        this.precio = precio;
        this.tipoIngrediente = tipoIngrediente;
    }

    public Ingrediente(String nombreIngrediente, float precio) {
        this.nombreIngrediente = nombreIngrediente;
        this.precio = precio;
    }
    
    /*geters and setters*/
    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public TipoIngrediente getTipoIngrediente() {
        return tipoIngrediente;
    }

    public void setTipoIngrediente(TipoIngrediente tipoIngrediente) {
        this.tipoIngrediente = tipoIngrediente;
    }

    
    
    /*toString*/
    @Override
    public String toString() {
        return "Ingrediente{" + "tipoIngrediente=" + tipoIngrediente + ", precio=" + precio + ", nombreIngrediente=" + nombreIngrediente  + '}';
    }

   
    
    
    
}
