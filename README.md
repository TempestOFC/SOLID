PRINCÍPIOS SOLID EM JAVA

🎯 OBJETIVOS DA ATIVIDADE
1. Propósito Principal
Demonstrar na prática cada um dos 5 princípios SOLID

Mostrar a evolução do código: violação → solução

Criar representações visuais (UML) das estruturas de classes

Desenvolver um projeto Java organizado e profissional

2. Entregáveis
✅ Código Java funcional para cada princípio

✅ Versão incorreta (violação) e versão corrigida (solução)

✅ Diagramas UML para visualização das estruturas

✅ Projeto estruturado em packages (pastas MAIÚSCULAS)

✅ Classe Main para testes integrados

✅ Repositório GitHub com todo o código


🖼️ DIAGRAMAS UML CRIADOS
Princípio	Diagrama Incorreto	Diagrama Correto
SRP	SRP_Violacao_UML - Classe única com 3 responsabilidades	SRP_Solucao_UML - 4 classes especializadas
OCP	OCP_Violacao_UML - Classe com if/else para cada tipo	OCP_Solucao_UML - Interface + 3 implementações
LSP	LSP_Violacao_UML - Herança problemática (pinguim que voa)	LSP_Solucao_UML - Hierarquia bem definida
ISP	ISP_Violacao_UML - Interface gorda com métodos não utilizados	ISP_Solucao_UML - 3 interfaces específicas
DIP	DIP_Violacao_UML - Dependência direta de implementação	DIP_Solucao_UML - Dependência de abstração


📝 APRENDIZADOS PRINCIPAIS
✅ Benefícios do Código Correto (Aplicando SOLID)
Manutenibilidade → Código mais fácil de entender e modificar

Testabilidade → Classes com responsabilidades únicas são mais fáceis de testar

Reusabilidade → Componentes desacoplados podem ser reutilizados

Extensibilidade → Fácil adicionar novas funcionalidades

Baixo acoplamento → Mudanças em uma parte afetam menos o sistema

❌ Problemas do Código Incorreto (Violando SOLID)
Dificuldade de manutenção → Classes grandes e complexas

Testes complicados → Muitas responsabilidades em uma classe

Código rígido → Difícil estender sem modificar existente

Alto acoplamento → Mudanças propagam efeitos colaterais

Reuso limitado → Componentes muito específicos


Por fim: Este projeto demonstra na prática como aplicar cada um dos 5 princípios SOLID,
mostrando a evolução de um código problemático para uma solução elegante e profissional!
