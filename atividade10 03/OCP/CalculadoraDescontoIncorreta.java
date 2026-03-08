package OCP;

// CLASSE INCORRETA - CalculadoraDescontoIncorreta.java
public class CalculadoraDescontoIncorreta {
    public double calcularDesconto(String tipoCliente, double valorCompra) {
        if (tipoCliente.equals("REGULAR")) {
            return valorCompra * 0.05;
        } else if (tipoCliente.equals("VIP")) {
            return valorCompra * 0.10;
        } else if (tipoCliente.equals("FUNCIONARIO")) {
            return valorCompra * 0.15;
        }
        // Para adicionar novo tipo, preciso modificar esta classe
        return 0;
    }
}

//O que fere o OCP
// : Para adicionar um novo tipo de cliente, preciso modificar a classe existente.