# Exchanges

- Exchanges são entidades no protocolo AMQP nas quais as mensagens são enviadas para o Message Broker.

- Exchanges pegam uma mensagem e depois encaminham para uma ou mais filas.

- O tipo de roteamento depende do tipo de Exchange utilizado e suas diferentes regras chamadas de bindings.

- RabbitMQ fornece quatro tipos diferentes de trocas: <strong>Direct Exchanges</strong> <strong>Fanout Exchanges</strong> <strong>Topic Exchanges</strong> <strong>Header Exchanges</strong>

- Atributos de uma Exchange: Name (Seu nome), Durability (Persistir ou não as mensagens no disco caso o servidor reinicie ou saia do ar), "Auto-Delete" (Deletar as mensagens quando todas as filas terminarem de utiliza-la), Arguments (Dependem do message-broker.)

- Os message-brokers possuem uma Exchange Direta (Direct Exchange) criada por padrão sem nome