package DIP;

// CLASSE CORRETA 4 - Notificacao.java
public class Notificacao {
    private ServicoMensagem servicoMensagem;
    
    public Notificacao(ServicoMensagem servicoMensagem) {
        this.servicoMensagem = servicoMensagem; // Injeção de dependência
    }
    
    public void enviar(String mensagem) {
        servicoMensagem.enviar(mensagem);
    }
}
