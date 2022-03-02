package com.example.atividade1

/**
 * 1.0 Sorteiar uma palavra aleatória #OK
 * 1.1 Mascarar a palavra aleatória #OK
 * 1.2 Ler string digitada #OK
 * 1.3 Função que verifica se a letra está na palavra sorteada #OK
 * 1.4 Implementar o laço #OK
 * 1.5 Implementar bonequinho da forca #OK
 * 1.6 Limpar prints #OK
 * 1.7 Adicionar histórico de tentativas #OK
 * 1.8 Modularizar #OK
 * 1.9 Adicionar regra de digitar apenas uma letra #OK
 * 2.0 Garantir que não sejam digitados números #OK
 *
 */

/*imports*/
//import java.util.Random
//import java.util.Scanner
import com.example.atividade1.Sorteio
import com.example.atividade1.Forca

fun main() {
    // instanceamento de objetos,recebendo tamanho da lista,e sorteando número da lista
    var mListaNomes = listOf("porta","colher","garfo","faca","jardim","piscina","cama","luz","cadeira","sala","eletrodomestico","estante","geladeira","microondas")
    var tamanhoLista:Int = mListaNomes.size
    var s = Sorteio()
    var numeroSorteado = s.rand(1,tamanhoLista)

    // inicio do game

    println("Bem vindo ao jogo da Forca!\nA dica é: possui em casa")
    // sorteando palavra e instanceando objeto
    var palavra = mListaNomes[numeroSorteado]
    var forca = Forca(palavra)

    // Mascarando palavra ( faca -> ____)

    print("\n${forca.mascararPalavra()}")
    var letraAtual = "start"

    // Laço de execução

    while (letraAtual != "exit"){

        // interatividade game/usuário

        print("\nDigite uma letra: ")
        letraAtual = forca.inputLetra()
        println("\nLetra digitada: ${letraAtual}")
        forca.verificarLetra(letraAtual)
        println("\nPalavra: ${forca.aux}")

        // settando condições de parada

        if (forca.aux.contains("_") == false){
            println("\nVocê venceu a palavra é ${forca.aux}")
            break
        }else if (forca.erros == 6){
            break
        }
    }

}