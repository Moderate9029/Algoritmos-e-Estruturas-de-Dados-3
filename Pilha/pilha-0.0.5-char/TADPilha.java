/************************************************************************************************
    @title Pilha
    @objetivo "Funções da PILHA"
    @author Felipe Pereira Sarmento         Criado 24/02/2022 - Última Atualização 10/03/2022
*************************************************************************************************/
/*
    Descrição 
    TAD - Tipo de dados abstratos
    Métodos
    Atributos
    Construtores
*/
public class TADPilha{
    
    // Atributos = variaveis da classe 
    char dados []; // tipo (int,char)
    int topo;
    int capacidade;
    
    // Método Construtor - mesmo nome da classe
    public TADPilha (int tamanho){
        topo = -1;
        capacidade = tamanho;
        dados = new char [capacidade];
    }
    
    // Métodos = operações sobre os Atributos
    public void imprime(){
        if(topo == -1){
            System.out.println("A Pilha está vazia!!!");
        }else{
            for(int i = 0; i <= topo; i++){
                System.out.println(dados[i]);
            }
        }
    }
    
    public void imprimeAoContrario(){
        if(topo == -1){
            System.out.println("A Pilha está vazia!!!");
        }else{
            for(int i = topo; i >= 0; i--){
                System.out.println(dados[i]);
            }
        }
    }
    
    public void empilha(char valor){
        // if(cheia())  return 0;
  
        topo++;
        dados[topo] = valor;
        // return 1;
    }
    
    public char desempilha(){
        if(vazia() == false){ // !vazia()
        topo--;
        return dados[topo + 1];
        }
        //return -1;// um número aleatorio qualquer
        return '5';
    }
    
    public boolean vazia(){
        /*retorno = 0;//não vazia
        if(topo == -1){
            retorno = 1;//vazia
        }*/
        return (topo==-1);
    }
    
    public boolean cheia(){
        return (topo+1 == capacidade);
    }
    
}