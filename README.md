# 🏦 Spring Boot Banking API — Backend Challenge

RESTful API desenvolvida com **Spring Boot** para simular operações bancárias em memória, incluindo transações financeiras e cálculo de estatísticas em tempo real.

Projeto focado em **boas práticas de backend, arquitetura em camadas, performance e concorrência**.

---

## 🎯 Objetivo

Implementar um sistema bancário backend capaz de:

- Processar transações financeiras
- Validar regras de negócio
- Manter consistência de dados em memória
- Gerar estatísticas em tempo real com janela deslizante de 60 segundos

---

## ⚙️ Stack utilizada

- Java 17
- Spring Boot
- Spring Web
- Jakarta Bean Validation
- Maven
- Stream API
- Concurrent Collections

---

## 🧠 Arquitetura

Arquitetura em camadas com separação clara de responsabilidades:

**Controller → DTO → Service → Model**

### Princípios aplicados:
- Baixo acoplamento
- Responsabilidade única (SRP)
- Código limpo e testável
- Estrutura escalável

---

## 💰 Funcionalidades

### ➕ Transações financeiras
- Criação de transações via API REST
- Validação automática de payload
- Rejeição de:
  - valores ≤ 0
  - timestamps futuros
- Armazenamento em memória

---

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

---

### 🧹 Limpeza de dados
Endpoint para remoção completa das transações armazenadas em memória.

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
{
  "count": 10,
  "sum": 1200.50,
  "avg": 120.05,
  "min": 10.00,
  "max": 250.00
}
```

---

### 🗑 DELETE /transacao

Remove todas as transações da memória.

---

## 🧩 Regras de negócio

- Armazenamento em memória com `ConcurrentLinkedQueue`
- Janela móvel de 60 segundos para estatísticas
- Operações thread-safe
- Validação de consistência temporal

---

## 🚀 Destaques técnicos

- Código thread-safe (concorrência real simulada)
- Arquitetura em camadas (padrão de mercado)
- Uso de Stream API para agregações eficientes
- Foco em performance e legibilidade
- Sistema sem dependência de banco de dados

---

## 📌 Possíveis melhorias (nível produção)

- Persistência com PostgreSQL + JPA
- Cache com Redis
- Documentação com Swagger/OpenAPI
- Testes unitários (JUnit + Mockito)
- Docker + CI/CD pipeline
- Monitoramento com Spring Actuator

---

## 👨‍💻 Autor

Felipe Lopes  
Backend Developer | Java • Spring Boot

Projeto desenvolvido como desafio técnico com foco em **arquitetura, performance e boas práticas de backend**.