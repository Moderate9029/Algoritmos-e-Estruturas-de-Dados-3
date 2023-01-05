/******************************************************************************************
    @title Pilha
    @objetivo "Usando a pilha para fazer uma avaliação de expressão."
    @author Felipe Pereira Sarmento         Criado 10/03/2022 - Última Atualização ...
*******************************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Start System...");
    
        //1. Criar uma expressão matemática
            String expressao = "( [3 + 50]-3)";
        
        //2. Verificar se a expressão é bem formada
            TADPilha p = new TADPilha (100);
            int casou = 1;
        
            // Varrer a expressão. Se encontrar ( ou [ empilhe. Se ) ou ] desempilhe
                for(int i = 0; i < expressao.length(); i++){
                    char aux = expressao.charAt(i);
                    
                    if(aux == '[' || aux == '(') p.empilha(aux);
                    
                    if(aux == ']' || aux == ')'){
                        char elemento = p.desempilha();
                        if(aux == '(' && elemento != ')') casou = 0;
                        if(aux == '[' && elemento != ']') casou = 0;
                    }
                    
                }
            
            // Informar se a expressão está bem formada
            boolean bemFormada = false;
            if(p.vazia() && (casou == 1)) bemFormada = true;
            
            if(bemFormada) System.out.println("Expressão bem formada");
            else System.out.println("Expressão mal formada");
        
	}
}
