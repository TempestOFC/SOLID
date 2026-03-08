package LSP;

// CLASSE CORRETA 2 - AveVoadora.java
abstract class AveVoadora extends Ave {
    public AveVoadora(String nome) {
        super(nome);
    }
    
    public void voar() {
        System.out.println(nome + " está voando...");
    }
}