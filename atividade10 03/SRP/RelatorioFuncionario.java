package SRP;
// CLASSE CORRETA 4 - RelatorioFuncionario.java

public class RelatorioFuncionario {
    public void gerarRelatorio(Funcionario funcionario, double salarioFinal) {
        System.out.println("=== RELATÓRIO DO FUNCIONÁRIO ===");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário Base: " + funcionario.getSalarioBase());
        System.out.println("Salário Final: " + salarioFinal);
        System.out.println("==================================");
    }
}