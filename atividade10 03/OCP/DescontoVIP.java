package OCP;

// CLASSE CORRETA 3 - DescontoVIP.java
public class DescontoVIP implements DescontoStrategy {
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.10;
    }
}
