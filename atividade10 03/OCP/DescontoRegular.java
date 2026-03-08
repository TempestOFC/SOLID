package OCP;

// CLASSE CORRETA 2 - DescontoRegular.java
public class DescontoRegular implements DescontoStrategy {
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.05;
    }
}