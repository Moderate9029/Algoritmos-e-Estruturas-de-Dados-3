/******************************************************************************************
    @title Pilha
    @objetivo "Usando a pilha para fazer uma avaliação de expressão."
    @author Felipe Pereira Sarmento         Criado 10/03/2022 - Última Atualização 28/04/2022
*******************************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("System start TADFila...");
		
		TADPilha p = new TADPilha(10);
		
		p.empilha(-2);
		p.empilha(-6);
		p.empilha(0);
		p.empilha(5);
		p.empilha(-25);
		
		System.out.println("Pilha com os valores sem modificação");
		p.imprime();
		
		p.setPositivo();
		
		System.out.println("Pilha com os valores modificados");
		p.imprime();
	}
}
