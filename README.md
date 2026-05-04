<<<<<<< HEAD
🏦 Banking API — Spring Boot (Desafio Itaú)

API REST desenvolvida em Java com Spring Boot que simula um sistema de transações financeiras em memória, com cálculo de estatísticas em tempo real baseado em janela deslizante de 60 segundos.

Projeto focado em boas práticas de backend, performance e concorrência.
=======
# 🏦 Spring Boot Banking API — Backend Challenge

RESTful API desenvolvida com **Spring Boot** para simular operações bancárias em memória, incluindo transações financeiras e cálculo de estatísticas em tempo real.

Projeto focado em **boas práticas de backend, arquitetura em camadas e concorrência**.
>>>>>>> becb760 (Improve README structure)

⚙️ Stack utilizada
Java 17
Spring Boot
Spring Web
Jakarta Bean Validation
Maven
Stream API
Concurrent Collections

<<<<<<< HEAD
🧠 Arquitetura
Arquitetura em camadas com separação clara de responsabilidades:
Controller → DTO → Service → Model

Foco em:
Baixo acoplamento
Responsabilidade única
Código testável e escalável
=======
## 🎯 Objetivo

Implementar um sistema bancário backend capaz de:

- Processar transações financeiras
- Validar regras de negócio
- Manter consistência de dados em memória
- Gerar estatísticas em tempo real com base em uma janela deslizante de tempo
>>>>>>> becb760 (Improve README structure)


<<<<<<< HEAD
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

=======
## ⚙️ Stack utilizada

- Java 17
- Spring Boot
- Spring Web
- Jakarta Bean Validation
- Maven
- Stream API
- Concurrent Collections
>>>>>>> becb760 (Improve README structure)

💰 Funcionalidades

<<<<<<< HEAD
➕ Criar transação
Recebe transações via API REST
Validação automática de payload
Rejeita:
valores ≤ 0
transações com timestamp futuro
Armazenamento em memória

=======
## 🧠 Arquitetura

Projeto estruturado em camadas:

**Controller → DTO → Service → Model**

### Princípios aplicados:
- Separação de responsabilidades (SRP)
- Baixo acoplamento
- Código testável e escalável
- Validação declarativa com Bean Validation
>>>>>>> becb760 (Improve README structure)

📊 Estatísticas em tempo real
Cálculo baseado apenas nas transações dos últimos 60 segundos:
count
sum
avg
min
max
Implementado com DoubleSummaryStatistics + Stream API para eficiência.

<<<<<<< HEAD
🧹 Reset de estado
Endpoint para limpeza completa da memória de transações

📡 API Endpoints
➕ POST /transacao
{
  "valor": 100.50,
  "dataHora": "2026-05-03T10:15:30Z"
}
=======
## 💰 Funcionalidades

### ➕ Transações financeiras
- Criação de transações via API REST
- Validação de payload
- Rejeição de:
    - valores ≤ 0
    - timestamps futuros
- Armazenamento em memória
>>>>>>> becb760 (Improve README structure)

Regras de validação:

<<<<<<< HEAD
valor > 0
dataHora ≤ agora


📊 GET /estatistica
=======
### 📊 Estatísticas em tempo real
Cálculo baseado apenas nas transações dos **últimos 60 segundos**:

- count
- sum
- avg
- min
- max

Implementado com:
- Stream API
- DoubleSummaryStatistics
- Foco em performance e legibilidade

---

### 🧹 Limpeza de dados
Endpoint para remoção total das transações armazenadas em memória.

---

## 📡 Endpoints

### ➕ POST /transacao

```json
{
  "valor": 100.50,
  "dataHora": "2026-05-03T10:15:30Z"
}
```

Regras:
- valor > 0
- dataHora ≤ agora

---

### 📊 GET /estatistica

```json
>>>>>>> becb760 (Improve README structure)
{
  "count": 10,
  "sum": 1200.50,
  "avg": 120.05,
  "min": 10.00,
  "max": 250.00
}
<<<<<<< HEAD


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
=======
```

---

### 🗑 DELETE /transacao

Remove todas as transações da memória.

---

## 🧩 Regras de negócio

- Armazenamento em memória com ConcurrentLinkedQueue
- Janela móvel de 60 segundos para estatísticas
- Operações thread-safe
- Validação de consistência temporal

---

## 🚀 Destaques técnicos

- Implementação thread-safe (concorrência real simulada)
- Uso de Stream API para agregações eficientes
- Arquitetura em camadas (padrão de mercado)
- Sem dependência de banco de dados (foco em lógica e performance)

---

## 📌 Possíveis melhorias (nível produção)

- Integração com PostgreSQL + JPA
- Cache com Redis para estatísticas
- Documentação com Swagger/OpenAPI
- Testes automatizados (JUnit + Mockito)
- Docker + CI/CD
- Monitoramento com Spring Actuator

---

## 👨‍💻 Autor

Felipe Lopes  
Backend Developer | Java • Spring Boot

Projeto desenvolvido como desafio técnico com foco em **arquitetura, performance e boas práticas de backend**.
>>>>>>> becb760 (Improve README structure)
