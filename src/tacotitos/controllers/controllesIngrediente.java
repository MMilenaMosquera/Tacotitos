
package tacotitos.controllers;
import tacotitos.Entidades.Ingrediente;
import tacotitos.Entidades.TipoIngrediente;

public class controllesIngrediente {
    
    public void nuevoIngrediente(String nombre, float precio, TipoIngrediente tipoIngrediente){
        Ingrediente i = new Ingrediente(nombre, precio, tipoIngrediente);
        
    }
    
    public void modificarIngrediente(String nombre, float precio, TipoIngrediente tipoIngrediente){
        
    }
    
}
