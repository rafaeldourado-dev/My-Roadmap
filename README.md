
### Pilar 1: Estruturas de Dados e Algoritmos (A Base Técnica)
Esta é a área mais densa. A ordem abaixo representa uma progressão lógica de estudo.

A. Fundamentos Essenciais
Análise de Complexidade:

Big O Notation (Complexidade de Tempo e Espaço) - O mais importante.

Big Omega (Ω) e Big Theta (Θ) - Bom saber a diferença.

Análise de algoritmos iterativos e recursivos.

B. Estruturas de Dados (As Ferramentas)
Arrays e Strings:

Arrays estáticos vs. dinâmicos.

Operações comuns (busca, inserção, remoção) e sua complexidade.

Hash Tables (Mapas, Dicionários, Sets):

Conceito mais importante para entrevistas.

Funções de Hashing.

Tratamento de Colisões (Encadeamento e Endereçamento Aberto).

Linked Lists (Listas Ligadas):

Lista Simplesmente Ligada.

Lista Duplamente Ligada.

Detecção de Ciclos (Algoritmo de Floyd - Tartaruga e Lebre).

Stacks (Pilhas) e Queues (Filas):

Princípios LIFO (Last-In, First-Out) e FIFO (First-In, First-Out).

Implementação com Arrays e Listas Ligadas.

Deque (Fila de Dupla Extremidade).

Trees (Árvores):

Conceitos: Nó, Raiz, Folha, Altura, Profundidade, Subárvore.

Árvores Binárias e Árvores Binárias de Busca (BST - Binary Search Trees).

Travessias: Pre-order, In-order, Post-order (DFS) e Level-order (BFS).

Árvores Balanceadas (conceitos de AVL e Red-Black Tree).

Tries (Árvores de Prefixo): Estrutura de dados especializada para strings.

Heaps (Filas de Prioridade):

Max-Heap e Min-Heap.

Operações: insert, extract_max/min, heapify.

Aplicações: Encontrar os "Top K" elementos, Mediana em um fluxo de dados.

Graphs (Grafos):

Representações: Lista de Adjacência vs. Matriz de Adjacência.

Tipos: Direcionado vs. Não-direcionado, Ponderado vs. Não-ponderado.

Algoritmos de Travessia: BFS (Busca em Largura) e DFS (Busca em Profundidade).

C. Padrões de Algoritmos (As Técnicas)
Busca e Ordenação:

Busca Binária (Binary Search): Essencial.

Merge Sort, Quick Sort e Heap Sort: Entenda como funcionam e sua complexidade.

Técnicas com Ponteiros:

Two Pointers (Dois Ponteiros).

Sliding Window (Janela Deslizante).

Recursão e Backtracking:

Problemas de Permutações, Combinações e Subconjuntos.

Resolução de labirintos, Sudoku.

Grafos:

BFS e DFS (aplicados como algoritmos).

Ordenação Topológica (Topological Sort): Para grafos acíclicos direcionados (DAGs).

Algoritmos de Caminho Mínimo: Dijkstra, Bellman-Ford.

Detecção de Ciclos em grafos.

Greedy Algorithms (Algoritmos Gulosos):

Entender a lógica de fazer a escolha localmente ótima.

Problemas clássicos (Troco, Agendamento de Intervalos).

Programação Dinâmica (DP):

Tópico avançado, mas crucial para se destacar.

Memoization (Top-Down) vs. Tabulation (Bottom-Up).

Padrões: Sequências (Fibonacci), Subsequência Comum Mais Longa, problemas da Mochila (Knapsack).

### Pilar 2: System Design (A Visão Arquitetural)
A. Conceitos Fundamentais
Métricas: Latência, Throughput, Disponibilidade (Availability), Consistência (Consistency).

Princípios: Escalabilidade (Horizontal vs. Vertical), Confiabilidade (Reliability), Tolerância a Falhas.

Teorema CAP: Consistency, Availability, Partition Tolerance.

B. Componentes e Blocos de Construção
Load Balancers:

Tipos de algoritmos (Round Robin, Least Connections).

L4 vs. L7.

Caching:

Padrões: Cache-Aside, Read-Through, Write-Through, Write-Back.

Onde colocar o cache: Lado do cliente, CDN, Servidor, Banco de Dados.

Bancos de Dados:

SQL vs. NoSQL (quando usar cada um).

Indexação, Sharding (Particionamento), Replicação (Primário-Secundário).

Comunicação:

APIs: REST, RPC (gRPC), GraphQL.

Protocolos: HTTP, TCP/IP.

Mensageria (Message Queues) e Streams:

Comunicação Síncrona vs. Assíncrona.

Conceitos de Fila (Queue) e Tópico (Topic).

Exemplos: RabbitMQ, Kafka, AWS SQS.

Outros: CDN (Content Delivery Network), API Gateway, Service Discovery, Proxies.

C. Padrões de Arquitetura e Estudos de Caso
Arquiteturas: Monolítica, Microserviços, Arquitetura Orientada a Eventos.

Estudos de Caso (pesquise por "System Design Interview"):

Projetar um Encurtador de URL (TinyURL).

Projetar um Feed de Notícias (Twitter, Instagram).

Projetar um Sistema de Streaming (Netflix, YouTube).

Projetar um App de Transporte (Uber, Lyft).

Projetar um Editor de Texto Colaborativo (Google Docs).

### Pilar 3: Behavioral (As Habilidades Humanas)
A. O Método
STAR (Situação, Tarefa, Ação, Resultado): Estruture TODAS as suas respostas usando este método.

B. Tópicos-Chave para suas Histórias
Prepare de 5 a 7 histórias detalhadas sobre sua experiência que possam ser adaptadas para responder perguntas sobre estes temas:

Liderança e Proatividade:

"Me fale sobre uma vez que você tomou a iniciativa em um projeto."

"Descreva uma situação onde você foi além das suas responsabilidades."

Trabalho em Equipe e Colaboração:

"Qual foi sua maior contribuição para um projeto em equipe?"

"Descreva um projeto onde você trabalhou com pessoas de outras áreas."

Conflito e Desacordo Técnico:

"Me fale sobre uma vez que você discordou de um colega ou gerente. O que você fez?"

"Como você lida com feedbacks negativos ou críticas ao seu código?"

Falha, Erro e Aprendizado:

"Qual foi o maior erro técnico que você cometeu? O que você aprendeu?"

"Descreva uma situação onde um projeto falhou ou não saiu como o planejado."

Ambiguidade e Desafios Técnicos:

"Qual foi o problema mais difícil que você já resolveu?"

"Me fale sobre uma vez que você teve que trabalhar em um projeto com requisitos pouco claros."

Impacto e Orgulho:

"Qual o projeto que você mais se orgulha de ter participado? Por quê?"
