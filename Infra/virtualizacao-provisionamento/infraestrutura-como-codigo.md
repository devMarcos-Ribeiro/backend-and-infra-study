# Infraestrutura como código

## Todas as aplicações necessitam de ambiente para:
- Serem criadas
- Testadas
- Apresentadas para o público final

Todos os ambientes devem ser iguais.

## Os ambientes físicos
- Compostos por alguns **elementos** que juntos permitem a execução da aplicação (memória, discos rígidos, bibliotecas, aplicação em si etc).
- Cada elemento requer manutenção periódica.
- Os times de operações e suporte normalmente utilizam checklists para que os ambientes sejam criados de maneira idêntica de maneira manual.
- Processos manuais são caros e arriscados.
- Hardware é caro e normalmente subutilizado pelas aplicações que roda.
- Muito tempo gasto com tarefas manuais de implementação e menos tempo para pensar em melhorias em processo de desenvolvimento etc.

## A alternativa: Virtualização
- Redução de custos com aquisição de hardware, manutenção e espaço.
- Facilita dimensionar recursos físicos.
- Exemplos: Vagrant e Docker

### Vagrant
- Se baseia na virtualização completa
- Hardware Físico -> Sistema operacional -> Monitor de VM's -> VM com hardware virtual, Sistema Operacional convidado.

### Docker
- Hardware físico -> S.O -> Docker -> Containers e aplicação
- Uso mais eficiente dos recursos físicos disponíveis

<p>Na virtualização a criação e configuração de ambientes serão <strong>salvos em arquivos</strong> e são automatizados, não mais exigindo criação manual de ambientes, remetendo à IaC (Infraestructure as code), facilitando MUITO a implementação da aplicação em nuvem.</p>