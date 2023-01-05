/************************************************************************************************
    @title TADFila - Tipo Abstrato de Dados Fila em JAVA
    @objetivo "Funções da FILA"
    @author Felipe Pereira Sarmento         Criado 24/03/2022 - Última Atualização 31/03      /2022
*************************************************************************************************/
public class TADFila{
    
    // ATRIBUTOS
    private int capacidade;
    private int fim;
    private int inicio;
    private TPessoa dados[];
    
    // CONSTRUTOR
    public TADFila(int tamanho){
        capacidade = tamanho;
        fim = -1;
        inicio = -1;
        dados = new TPessoa [capacidade];
    }
    
    // MÉTODOS
    public boolean enfileira(TPessoa p){
        if(cheia()) return false;
        
        fim++;
        dados[fim] = p;
        return true;
    }
    
    public TPessoa desenfileira(){
        if(vazia()) return null;
        
        inicio++;
        return dados[inicio];
    }
    
    public void imprime(){
        for(int i = 0; i <= fim; i++){
            System.out.println("Nome: "  + dados[i].nome);
            System.out.println("Idade: " + dados[i].idade);
            System.out.println("Sexo: "  + dados[i].sexo + "\n");
        }
    }
    
    public boolean cheia(){
        return (fim==capacidade-1);
    }
    
    public boolean vazia(){
        return (inicio==fim);
    }
}