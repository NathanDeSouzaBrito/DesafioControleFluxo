
# DesafioControleFluxo

## 📘 Descrição

Este projeto em Java recebe dois números inteiros via terminal e imprime no console a quantidade de interações necessárias com base na diferença entre os dois.  
Se o primeiro número for **maior** que o segundo, uma exceção personalizada (`ParametrosInvalidosException`) será lançada com a mensagem apropriada.

---

## ✅ Regras de Funcionamento

- O sistema deve solicitar dois números inteiros via `Scanner`.
- Se o **primeiro número for maior** que o **segundo**, será lançada uma exceção com a mensagem:
  ```
  O segundo parâmetro deve ser maior que o primeiro
  ```
- Caso os parâmetros estejam corretos, o programa deve imprimir:
  ```
  Imprimindo o número 1
  Imprimindo o número 2
  ...
  ```

---

## 💡 Exemplo

### Entrada:
```
Digite o primeiro parâmetro:
12
Digite o segundo parâmetro:
30
```

### Saída:
```
Imprimindo o número 1
Imprimindo o número 2
...
Imprimindo o número 18
```

---

## ⚠️ Caso o primeiro número seja maior que o segundo

### Entrada:
```
Digite o primeiro parâmetro:
30
Digite o segundo parâmetro:
12
```

### Saída:
```
O segundo parâmetro deve ser maior que o primeiro
```

---

## 🧪 Como compilar e executar

Abra o terminal na pasta onde estão os arquivos `.java` e execute os comandos abaixo:

```bash
javac ParametrosInvalidosException.java Contador.java
java Contador
```

---

## 📁 Estrutura do Projeto

```
src/
├── Contador.java
├── ParametrosInvalidosException.java
README.md
```

---

## 🎯 Objetivo

Exercitar:
- Controle de fluxo com estruturas de repetição
- Leitura de dados via terminal
- Criação e uso de exceções personalizadas
