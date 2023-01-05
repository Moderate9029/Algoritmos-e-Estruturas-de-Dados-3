/******************************************************************************************
    @title Lista
    @objetivo ""
    @author Felipe Pereira Sarmento         Criado 05/05/2022 - Última Atualização ...
*******************************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("");
		
		No n0 = new No("Spy x Family");
		No n1 = new No("One Piece");
		
		n0.imprime();
		n1.imprime();
		
		Lista l = new Lista();
		
		l.incluirNoInicio(n1);
		l.incluirNoFim(n0);
		l.imprime();
	}
}
