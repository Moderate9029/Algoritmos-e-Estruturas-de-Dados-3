/******************************************************************************************
    @title Main_Fila
    @objetivo "Utilizando a classe TADFila"
    @author Felipe Pereira Sarmento         Criado 24/03/2022 - Última Atualização ...
*******************************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("System start TADFila...");
		
		TPessoa p = new TPessoa (20, 'F', "Julia");
		TPessoa x = new TPessoa (22, 'M', "Caio");
		
		TADFila fila = new TADFila(10);
		
		fila.enfileira(p);
		fila.enfileira(x);
		
		fila.imprime();
		
		fila.desenfileira();
		
		fila.imprime();
		
	}
}
