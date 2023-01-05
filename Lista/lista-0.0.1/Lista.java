/******************************************************************************************
    @title Lista
    @objetivo ""
    @author Felipe Pereira Sarmento         Criado 05/05/2022 - Última Atualização ...
*******************************************************************************************/
public class Lista{
    
    No inicio;
    
    public Lista(){
        inicio = null;
    }
    
    public boolean vazia(){
        return inicio == null;
    }
    
    public void incluirNoInicio(No novo){
        // Faça o inicío da lista apontar(=) para o novo Nó
        if(vazia()){
            inicio = novo;
        }else{
            // Conecta o novo Nó ao PROXIMO DO inicío da lista
            novo.proximo = inicio;
            
            // Conecta o inicío da lista ao novo Nó
            inicio = novo;
        }
    }
    
    public void incluirNoFim(No novo){
        if(vazia()){
            inicio = novo;
        }else{
            No atual = inicio;
            while(atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }
    
    public void imprime(){
        System.out.println("Impressão da Lista");
        No atual = inicio;
            while(atual.proximo != null){
                // método imprime do Nó
                atual.imprime();
                
                // atualizar o próximo atual
                atual = atual.proximo;
            }
            atual.imprime();
    }
}