package ISP;

// CLASSE CORRETA 4 - Humano.java
public class Humano implements Trabalhador, Comedor, Dormente {
    @Override
    public void trabalhar() {
        System.out.println("Humano trabalhando...");
    }
    
    @Override
    public void comer() {
        System.out.println("Humano comendo...");
    }
    
    @Override
    public void dormir() {
        System.out.println("Humano dormindo...");
    }
}