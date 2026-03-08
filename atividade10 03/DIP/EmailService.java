package DIP;

// CLASSE CORRETA 2 - EmailService.java
public class EmailService implements ServicoMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}