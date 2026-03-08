package DIP;

// CLASSE CORRETA 3 - SMSService.java
public class SMSService implements ServicoMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
