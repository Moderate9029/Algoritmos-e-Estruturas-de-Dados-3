/******************************************************************************
    @title Pilha
    @objetivo "Construindo uma PILHA"
    @author Felipe Pereira Sarmento         03/03/2022
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
		t.imprimeAoContrario();
		t.empilha(20);
		t.empilha(15);
		t.empilha(9);
		t.imprime();
		
		System.out.println("");
		int valor = 11;
		int resto;
		TADPilha b = new TADPilha(15);
        while(valor != 0){
            resto = valor % 2;
            b.empilha(resto);
            valor = valor / 2;
        }
        b.imprimeAoContrario();
	}
	
}
