package SRP;
// CLASSE CORRETA 1 - Funcionario.java
public class Funcionario {
    private String nome;
    private double salarioBase;
    private String cargo;
    
    public Funcionario(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }
    
    public String getNome() { return nome; }
    public double getSalarioBase() { return salarioBase; }
    public String getCargo() { return cargo; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
}