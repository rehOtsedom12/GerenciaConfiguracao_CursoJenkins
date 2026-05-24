# 🌡️ Temperature Converter — Jenkins

Projeto desenvolvido para a disciplina de **Gerência de Configuração** da UFAM.  
Demonstra a configuração de um pipeline de build e testes automatizados utilizando **Jenkins** integrado ao **GitHub**.

---

## 📋 Sobre o projeto

Implementação de um conversor de temperaturas em Java com testes automatizados (JUnit 5), utilizado como projeto-base para demonstrar os principais cenários de integração contínua com Jenkins.

### Métodos implementados

| Método | Fórmula |
|--------|---------|
| `celsiusParaFahrenheit(double celsius)` | `F = (C × 9/5) + 32` |
| `fahrenheitParaCelsius(double fahrenheit)` | `C = (F - 32) × 5/9` |

### Casos de teste (JUnit 5)

| Teste | Entrada | Esperado |
|-------|---------|----------|
| Ponto de congelamento | 0°C | 32°F |
| Ponto de ebulição | 100°C | 212°F |
| Temperatura corporal | 37°C | 98.6°F |
| Ponto de equivalência | -40°C | -40°F |
| Ponto de congelamento (inverso) | 32°F | 0°C |
| Ponto de ebulição (inverso) | 212°F | 100°C |
| Temperatura corporal (inverso) | 98.6°F | 37°C |
| Ponto de equivalência (inverso) | -40°F | -40°C |

---

## 🛠️ Tecnologias utilizadas

- **Java 21**
- **Maven 3.8+**
- **JUnit 5.10**
- **JaCoCo 0.8.11** — cobertura de código
- **Jenkins** — servidor de integração contínua

---

## 📁 Estrutura do projeto

```
temperature-converter/
├── pom.xml
└── src/
    ├── main/java/com/example/
    │   └── ConversorTemperatura.java
    └── test/java/com/example/
        └── ConversorTemperaturaTest.java
```

---

## ▶️ Como executar localmente

**Pré-requisitos:** Java 21 e Maven instalados.

# Clonar o repositório
```bash
git clone https://github.com/rehOtsedom12/GerenciaConfiguracao_CursoJenkins.git
cd temperature-converter
```
---

## ⚙️ Configuração do Jenkins

### Pré-requisitos
- Jenkins instalado localmente (porta 8080)
- Plugin **Maven Integration** instalado
- Plugin **JaCoCo** instalado

### Configuração do Job

1. Criar novo job do tipo **Maven project**
2. Em **Source Code Management** → Git → informar a URL deste repositório
3. Em **Build** → Goals: `test`
4. Em **Post-build Actions** → adicionar **Record JaCoCo coverage report**

---

## 🎬 Cenários demonstrados

| Cenário | Descrição | Resultado esperado |
|---------|-----------|-------------------|
| 1 | Build e testes executados com sucesso | ✅ Stable |
| 2 | Falha durante a compilação dos fontes | ❌ Failure |
| 3 | Build bem-sucedido, mas testes falham | ⚠️ Unstable |
| 4 | Build agendado executado automaticamente | ✅ Stable |
| Bônus | Cobertura de código com JaCoCo ativada | ✅ Stable + relatório |

---

## 📊 Cobertura de código

Com os 8 casos de teste implementados, a cobertura de código atinge aproximadamente **100%** dos métodos e linhas da classe `ConversorTemperatura`.

---

## 👤 Autora

Desenvolvido por RENATA MODESTO FERNANDES — Turma de Gerência de Configuração, UFAM.
