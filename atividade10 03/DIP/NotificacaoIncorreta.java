package DIP;

// CLASSE INCORRETA - NotificacaoIncorreta.java
class EmailServiceIncorreto {
    public void enviarEmail(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}

class NotificacaoIncorreta {
    private EmailServiceIncorreto emailService;
    
    public NotificacaoIncorreta() {
        this.emailService = new EmailServiceIncorreto(); // Dependência concreta
    }
    
    public void enviar(String mensagem) {
        emailService.enviarEmail(mensagem);
    }
}

//O que fere o DIP: Classe de alto nível depende de classe de baixo nível concreta.