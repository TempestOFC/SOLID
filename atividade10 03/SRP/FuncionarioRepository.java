package SRP;
// CLASSE CORRETA 3 - FuncionarioRepository.java

public class FuncionarioRepository {
    public void salvarNoBanco(Funcionario funcionario, double salarioFinal) {
        System.out.println("Conectando ao banco de dados...");
        System.out.println("Inserindo funcionário: " + funcionario.getNome());
        System.out.println("Salário calculado: " + salarioFinal);
        System.out.println("Funcionário salvo com sucesso!");
    }
}