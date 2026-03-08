
// Imports para SRP
import SRP.Funcionario;
import SRP.CalculadoraSalario;
import SRP.FuncionarioRepository;
import SRP.RelatorioFuncionario;

// Imports para OCP
import OCP.DescontoVIP;
import OCP.CalculadoraDesconto;

// Imports para LSP
import LSP.Andorinha;
import LSP.Pinguim;

// Imports para ISP
import ISP.Humano;
import ISP.Robo;

// Imports para DIP
import DIP.EmailService;
import DIP.SMSService;
import DIP.Notificacao;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO EXEMPLOS SOLID ===\n");
        
        // Teste SRP
        System.out.println("--- TESTE SRP ---");
        Funcionario func = new Funcionario("João Silva", 5000, "DESENVOLVEDOR");
        CalculadoraSalario calcSalario = new CalculadoraSalario();
        double salarioFinal = calcSalario.calcularSalario(func);
        
        FuncionarioRepository repo = new FuncionarioRepository();
        repo.salvarNoBanco(func, salarioFinal);
        
        RelatorioFuncionario relatorio = new RelatorioFuncionario();
        relatorio.gerarRelatorio(func, salarioFinal);
        System.out.println();
        
        // Teste OCP
        System.out.println("--- TESTE OCP ---");
        CalculadoraDesconto descontoVIP = new CalculadoraDesconto(new DescontoVIP());
        double valorDesconto = descontoVIP.calcularDesconto(1000);
        System.out.println("Desconto VIP: R$" + valorDesconto);
        System.out.println();
        
        // Teste LSP
        System.out.println("--- TESTE LSP ---");
        Andorinha andorinha = new Andorinha();
        Pinguim pinguim = new Pinguim();
        
        andorinha.mover();
        pinguim.mover();
        System.out.println();
        
        // Teste ISP
        System.out.println("--- TESTE ISP ---");
        Humano humano = new Humano();
        Robo robo = new Robo();
        
        humano.trabalhar();
        humano.comer();
        robo.trabalhar();
        System.out.println();
        
        // Teste DIP
        System.out.println("--- TESTE DIP ---");
        Notificacao notificacaoEmail = new Notificacao(new EmailService());
        Notificacao notificacaoSMS = new Notificacao(new SMSService());
        
        notificacaoEmail.enviar("Olá mundo via email!");
        notificacaoSMS.enviar("Olá mundo via SMS!");
    }
}