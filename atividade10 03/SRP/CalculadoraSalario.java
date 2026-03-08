package SRP;
// CLASSE CORRETA 2 - CalculadoraSalario.java

public class CalculadoraSalario {
    public double calcularSalario(Funcionario funcionario) {
        String cargo = funcionario.getCargo();
        double salarioBase = funcionario.getSalarioBase();
        
        if (cargo.equals("DESENVOLVEDOR")) {
            return salarioBase * 1.2;
        } else if (cargo.equals("GERENTE")) {
            return salarioBase * 1.5;
        }
        return salarioBase;
    }
}