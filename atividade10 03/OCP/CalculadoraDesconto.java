package OCP;

// CLASSE CORRETA 5 - CalculadoraDesconto.java
public class CalculadoraDesconto {
    private DescontoStrategy descontoStrategy;
    
    public CalculadoraDesconto(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }
    
    public double calcularDesconto(double valorCompra) {
        return descontoStrategy.calcularDesconto(valorCompra);
    }
}