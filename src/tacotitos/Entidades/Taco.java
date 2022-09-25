package tacotitos.Entidades;

import java.util.List;

public class Taco {
    protected int numeroTaco;
    protected List<Ingrediente> ingredientes; 

    public Taco(int numeroTaco, List<Ingrediente> ingredientes) {
        this.numeroTaco = numeroTaco;
        this.ingredientes = ingredientes;
    }
    

    public int getNumeroTaco() {
        return numeroTaco;
    }

    public void setNumeroTaco(int numeroTaco) {
        this.numeroTaco = numeroTaco;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
