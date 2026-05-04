🏦 Banking API — Spring Boot (Desafio Itaú)

API REST desenvolvida em Java com Spring Boot que simula um sistema de transações financeiras em memória, com cálculo de estatísticas em tempo real baseado em janela deslizante de 60 segundos.

Projeto focado em boas práticas de backend, performance e concorrência.

⚙️ Stack utilizada
Java 17
Spring Boot
Spring Web
Jakarta Bean Validation
Maven
Stream API
Concurrent Collections

🧠 Arquitetura
Arquitetura em camadas com separação clara de responsabilidades:
Controller → DTO → Service → Model

Foco em:
Baixo acoplamento
Responsabilidade única
Código testável e escalável


📦 Estrutura do projeto
spring.boot.desafio.itau
├── controller
│   ├── StatistcsController
│   └── TransactionController
│
├── dto
│   ├── StatisticsResponse
│   └── TransactioRequest
│
├── model
│   └── Transaction
│
├── service
│   └── TransactionService
│
└── SpringbootApplication


💰 Funcionalidades

➕ Criar transação
Recebe transações via API REST
Validação automática de payload
Rejeita:
valores ≤ 0
transações com timestamp futuro
Armazenamento em memória


📊 Estatísticas em tempo real
Cálculo baseado apenas nas transações dos últimos 60 segundos:
count
sum
avg
min
max
Implementado com DoubleSummaryStatistics + Stream API para eficiência.

🧹 Reset de estado
Endpoint para limpeza completa da memória de transações

📡 API Endpoints
➕ POST /transacao
{
  "valor": 100.50,
  "dataHora": "2026-05-03T10:15:30Z"
}

Regras de validação:

valor > 0
dataHora ≤ agora


📊 GET /estatistica
{
  "count": 10,
  "sum": 1200.50,
  "avg": 120.05,
  "min": 10.00,
  "max": 250.00
}


🗑 DELETE /transacao
Remove todas as transações armazenadas em memória.


🧩 Regras de negócio
Armazenamento em memória com ConcurrentLinkedQueue
Janela móvel de 60 segundos para estatísticas
Validação de consistência temporal (anti-fraude básico)
Operações thread-safe


🧠 Decisões técnicas (o que importa para recrutador)
ConcurrentLinkedQueue → segurança em concorrência sem bloqueios pesados
DoubleSummaryStatistics → agregações eficientes em O(n)
Stream API → filtragem funcional e legível
Separação por camadas → padrão de mercado
Bean Validation → validação declarativa no input


🚀 Diferenciais do projeto
Código thread-safe (concorrência real simulada)
Arquitetura limpa e escalável
Foco em performance de agregações
Simulação de cenário bancário real
Sem dependência de banco (memória controlada)


📌 Possíveis evoluções (nível produção)
Persistência com PostgreSQL + JPA
Cache com Redis para estatísticas
Swagger/OpenAPI documentation
Testes unitários e de integração (JUnit + Mockito)
Docker + CI/CD pipeline
Observabilidade (Actuator + Prometheus)


👨‍💻 Autor

Felipe Lopes
Backend Developer (Java | Spring Boot)

Projeto desenvolvido como desafio técnico focado em arquitetura, performance e boas práticas de backend.
