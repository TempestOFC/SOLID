package LSP;

// CLASSE CORRETA 4 - Pinguim.java
public class Pinguim extends Ave {
    public Pinguim() {
        super("Pinguim");
    }
    
    public void nadar() {
        System.out.println(nome + " está nadando...");
    }
    
    @Override
    public void mover() {
        nadar();
    }
}