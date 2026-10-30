# Atividade 07 — Algoritmo do Banqueiro

## Descrição

Nesta atividade, executei em Python o Algoritmo do Banqueiro. Esse algoritmo verifica se uma solicitação de recursos pode ser atendida sem colocar o sistema em uma situação insegura, evitando possíveis impasses entre os processos.

## Estado inicial

O programa utiliza cinco processos, identificados de P0 até P4, e três tipos de recursos, representados por R0, R1 e R2.

Ao analisar o estado inicial, o algoritmo verificou que o sistema estava seguro e encontrou a seguinte sequência:

```text
P1 → P3 → P0 → P2 → P4
