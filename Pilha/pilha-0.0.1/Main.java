/*------------------------------------------                      
    @title: Pilha 
    @objetivo: Primeira Versão da Classe Pilha 0.0.1
    @autor: Felipe Pereira Sarmento     17/02/2022
--------------------------------------------*/
/*
    Todo programa JAVA é uma Classe
    public class Xxxxx{ .... }

    Você deve gravar o programa como Xxxx.java

    O seu programa JAVA conterá:
    variáveis (ATRIBUTOS)
    funções (MÉTODOS)
*/
public class Pilha
{
    // ATRIBUTOS - "variáveis da Classe"
    int dados[] = new dados[10]; // comteúdo da pilha
    int topo; // posição do ultimo elemento da pilha
    int capacidade; // qtos elementos a pilha pode ter
    
    // MÉTODOS - Operações que podemos fazer com a Classe
    void empilha(int valor){
        topo++;
        dados[topo] = valor;
    }
    int desempilha(){
        topo--;
        return dados[topo + 1];
    }
    void imprime(){
        if(topo == -1){
            System.out.println("A Pilha está vazia!!!");
        }else{
            for(int i = 0; i <= topo; i++){
                System.out.println(dados[i]);
            }
        }
    }
	public static void main(String[] args) {
		
	}
}



