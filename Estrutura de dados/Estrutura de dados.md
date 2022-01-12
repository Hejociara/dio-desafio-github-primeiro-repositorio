# Estrutura de dados

Organizamos dados através de estruturas, chamadas de estrutura de dados na programação, ela é uma estrutura organizada de dados na memória de um computador ou em qualquer dispositivo de armazenamento, de forma que os dados possam ser utilizados de forma correta.

Essas estruturas encontram muitas aplicações no desenvolvimento de sistemas, sendo que algumas são altamente especializadas e utilizadas em tarefas específicas.

Usando as estruturas adequadas através de [algoritmos](https://www.notion.so/Algoritmos-e-Pseudoc-digos-0f0a2852f4ab4c43b995197483694719) 

“Um algoritmo é um conjunto de instruções estruturadas e ordenadas, seu objetivo é realizar uma tarefa ou operação específica.” São utilizados para manipulas dados nas estruturas de várias formas, como por exemplo: inserir, excluir, procurar, classificar, percorrer todos os itens e ordenar dados.

### Vetores e matrizes ou arrays

São estruturas de dados simples que podem auxiliar quando há muitas variáveis do mesmo tipo em um  algoritmo.

### Vetor

O vetor ou array uni-dimensional é uma variável que armazena várias variáveis do mesmo tipo.

É uma estrutura de dados indexada, que pode armazenar uma determinada quantidade de valores do mesmo tipo.

Busca mais lenta, pois precisa passar posição por posição até achar determinado valor.

### Matriz ou array multi-dimensional é um vetor de vetores.

Uma matriz é um vetor que possui duas ou mais dimensões. 

Usa-se dois for

um for para a linha e outra para a coluna.

Exemplo:

for (inteiro linha = 0; linha < TAMANHO; linha++)
{
for (inteiro coluna = 0; coluna < TAMANHO; coluna++)
{
matriz[linha][coluna] = u.sorteia(1, 9) 

### Registro

Enquanto arrays nos permitem armazenar vários dados de um único tipo de dados, o recurso de Registro nos permite armazenar mais de um tipo de dado.

Um registro é composto por campos que especificam cada uma das informações que o compõem.

Exemplo:

CP

![Untitled](Estrutura%20de%20dados%20267743d6a22b4d10b2836463869f66cd/Untitled.png)

Toda estrutura de registro tem um nome.

Ex: livro

Seus campos podem ser acessados por meio do uso do operador ponto(.). Por exemplo, para acessar o preço de um livro, poderíamos utilizar a seguinte declaração:

livro.preco

i = contador

### Listas

Armazena dados de um determinado tipo em uma ordem específica.

A diferença entre listas e arrays, é que as listas possuem tamanho ajustável, enquanto arrays possuem tamanho fixo.

Existem dois tipos de listas, ligadas e duplamente ligadas

**Lista ligada** - cada nó conhece o valor que está sendo armazenado em seu interior além de conhecer o elemento posterior a ele: por isso ela é chamada de “lista ligada”, pois os nós são amarrados com essa indicação de qual é o próximo nó.

Listas ligadas só sabem quem são os próximos nós e não os anteriores.

![Untitled](Estrutura%20de%20dados%20267743d6a22b4d10b2836463869f66cd/Untitled%201.png)

![Untitled](Estrutura%20de%20dados%20267743d6a22b4d10b2836463869f66cd/Untitled%202.png)

**Duplamente ligada** 

Variação da ligada, a diferença delas é que as listas duplamente ligadas para as listas ligadas é que elas são bidirecionais

Elas podem modificar o elemento anterior e o próximo.

Consegue fazer uma busca reversiva

![Untitled](Estrutura%20de%20dados%20267743d6a22b4d10b2836463869f66cd/Untitled%203.png)

### Pilhas/Stack

Estrutura de dados que serve como uma coleção de elementos, e permite o acesso a somente um item de dados armazenados.

Permite apernas acesso aos itens uma vez. Pode ser lido ou removido, um de cada vez.

Existem dois tipos de pilhas a LIFO(UEPS) ou FIFO(PEPS).

LIFO(last in first out), apresenta o seguinte critério: o primeiro elemento a ser retirado é o último que tiver sido inserido.

“último elemento a ser inserido é o primeiro que sai”. A pilha será retirada sempre do último elemento.

![Untitled](Estrutura%20de%20dados%20267743d6a22b4d10b2836463869f66cd/Untitled%204.png)

FIFO(first in first out) - o primeiro elemento a ser retirado é o primeiro que deve ser inserido.

“Primeiro que entra é o primeiro que sai.” A retirada acontece de baixo para cima. 

![Untitled](Estrutura%20de%20dados%20267743d6a22b4d10b2836463869f66cd/Untitled%205.png)

### Filas

Admite remoção e inserção de novos elementos.

Regra:

O elemento que será removido é o que se encontra há mais tempo na estrutura, ou seja, o primeiro objeto a ser inserido na fila é o primeiro a ser removido. Fifo. 

![image-20220112083143349](C:\Users\hejoc\AppData\Roaming\Typora\typora-user-images\image-20220112083143349.png)



### Árvore

É uma estrutura de dados que organiza seus elementos de forma hierárquica, onde existe um elemento que fica no topo da árvore, chamado raiz e existe os elementos subordinados a ele, nós ou folhas. Estruturas desse tipo facilitam a busca. 



### Tabelas Hash - tabela de espalhamento ou dispersão

É uma estrutura de dados especial, que associa chaves de pesquisa a valores em uma estrutura de dados.

É uma generalização da ideia de array, porém, utiliza uma função denominada hashing para espalhar elementos, fazendo com que os mesmos fiquem de forma não ordenada dentro do "array" que define a tabela.

![image-20220112084145373](C:\Users\hejoc\AppData\Roaming\Typora\typora-user-images\image-20220112084145373.png)

Para que haja a pesquisa, já que ele não está de forma ordenada, permite que nós associemos valores a chaves.

Onde valores são as posições ou índice onde o elemento se encontra.

Onde chave é a parte da informação que compõe o elemento a ser manipulado.

Espalhar facilita a busca de dados, pois a partir de uma chave podemos acessar de forma rápida uma posição array.

### Grafos

São estruturas que permitem programar a relação entre objetos.

Os objetos são vértices ou nós do grafo.

Os relacionamentos são arestas.

![image-20220112084629466](C:\Users\hejoc\AppData\Roaming\Typora\typora-user-images\image-20220112084629466.png)

