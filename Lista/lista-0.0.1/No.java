/******************************************************************************************
    @title Nó
    @objetivo ""
    @author Felipe Pereira Sarmento         Criado 05/05/2022 - Última Atualização ...
*******************************************************************************************/
public class No{
    
    String dado;
    No proximo;
    
    public No(String novo){
        dado = novo;
        proximo = null;
    }
    
    public void imprime(){
        System.out.println("Dado: " + dado);
        
        //if(proximo != null)
        //    System.out.println(proximo);
    }
}