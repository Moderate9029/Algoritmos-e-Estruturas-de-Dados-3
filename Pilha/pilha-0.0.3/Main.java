/******************************************************************************
    @title Pilha
    @objetivo "Construindo uma PILHA"
    @author Felipe Pereira Sarmento         24/02/2022
*******************************************************************************/
/*
    Uso do TAD no Main
    - Como criar
    - Como acionar o construtor
    - Como chamar os métodos
    
    Instanciar uma classe  = criar um obj
*/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Load System...");
		// Instanciar uma classe = criar um obj
		TADPilha x = new TADPilha(10);
		TADPilha t = new TADPilha(5);
		
		// Pilha x
		System.out.println("Pilha x");
		x.empilha(10);
		x.empilha(20);
		x.desempilha();
        x.desempilha();
        x.desempilha();

		x.imprime();
		
		// Pilha t
		System.out.println("Pilha t");
		t.empilha(0);
		t.empilha(5);
		t.empilha(10);
		
		t.imprime();
	}
}
