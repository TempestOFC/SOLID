package LSP;

// CLASSE CORRETA 1 - Ave.java
abstract class Ave {
    protected String nome;
    
    public Ave(String nome) {
        this.nome = nome;
    }
    
    public abstract void mover();
}