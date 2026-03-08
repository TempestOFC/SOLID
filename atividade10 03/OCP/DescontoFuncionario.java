package OCP;

// CLASSE CORRETA 4 - DescontoFuncionario.java
public class DescontoFuncionario implements DescontoStrategy {
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.15;
    }
}