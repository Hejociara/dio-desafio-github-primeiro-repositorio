# Estrutura de decisão

### Comando Se:

É utilizada a palavra reservada se, a condição a ser testada entre parênteses e as instruções que devem ser executadas entre chaves caso o desvio seja verdadeiro.

Exemplo:

se(media≥7){

escreva(”Parabéns!! Você foi aprovado!!”)

}

Caso queiras fazer uma quebra de linha abre-se: “\n”

Ex:

se(media>=7) {
escreva("\n" + "Parabéns!!! você foi aprovado!!!")

## se-senão

Deve-se colocá-lo para dar uma condição falsa.

```
	se(media>=7) {
escreva("\n" + "Parabéns!!! você foi aprovado!!!")
}
senao{
		escreva("\n" + "Infelizmente você foi reprovado")
	}
```

## Desvio condicional - Caso

Este comando é similar aos comandos se e senão, e reduz a complexidade na escolha de diversas opções. Apesar de suas similaridades com o se, ele possui algumas diferenças. Neste comando não é possível o uso de operadores lógicos, ele apenas, ele apenas trabalha com valores definidos.