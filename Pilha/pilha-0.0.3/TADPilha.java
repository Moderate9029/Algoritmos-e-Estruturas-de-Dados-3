/******************************************************************************
    @title Pilha
    @objetivo "Funções da PILHA"
    @author Felipe Pereira Sarmento         24/02/2022
*******************************************************************************/
/*
    Descrição 
    TAD - Tipo de dados abstratos
    Métodos
    Atributos
    Construtores
*/
public class TADPilha{
    
    // Atributos = variaveis da classe 
    int dados [];
    int topo;
    int capacidade;
    
    // Método Construtor - mesmo nome da classe
    public TADPilha (int tamanho){
        topo = -1;
        capacidade = tamanho;
        dados = new int [capacidade];
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
    
    public void empilha(int valor){
        if(cheia() == true){
            System.out.println("A pilha está cheia!!!");
        }else{
            topo++;
            dados[topo] = valor;
        }
    }
    
    public int desempilha(){
        if(vazia() == false){ // !vazia()
        topo--;
        return dados[topo + 1];
        }
        return -1;// um número aleatorio qualquer
    }
    
    public boolean vazia(){
        /*retorno = 0;//não vazia
        if(topo == -1){
            retorno = 1;//vazia
        }*/
        return (topo==-1);
    }
    
}