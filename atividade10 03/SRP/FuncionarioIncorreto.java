package SRP;

// CLASSE INCORRETA - FuncionarioIncorreto.java
public class FuncionarioIncorreto {
    private String nome;
    private double salarioBase;
    private String cargo;
    
    public FuncionarioIncorreto(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }   
    
    // Responsabilidade 1: Regras de negócio do funcionário
    public double calcularSalario() {
        if (cargo.equals("DESENVOLVEDOR")) {
            return salarioBase * 1.2;
        } else if (cargo.equals("GERENTE")) {
            return salarioBase * 1.5;
        }
        return salarioBase;
    }
    
    // Responsabilidade 2: Persistência no banco de dados
    public void salvarNoBanco() {
        System.out.println("Conectando ao banco de dados...");
        System.out.println("Inserindo funcionário: " + nome);
        System.out.println("Salário calculado: " + calcularSalario());
        System.out.println("Funcionário salvo com sucesso!");
    }
    
    // Responsabilidade 3: Geração de relatórios
    public void gerarRelatorio() {
        System.out.println("=== RELATÓRIO DO FUNCIONÁRIO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário Final: " + calcularSalario());
        System.out.println("==================================");
    }
}

//O que fere o SRP: A classe tem três responsabilidades diferentes
// : cálculo de salário, persistência em banco de dados e geração de relatórios.