/************************************************************************************************
    @title TPessoa -  Tipo Abstrato de Dados Pessoa em JAVA
    @objetivo "Criar uma Pessoa"
    @author Felipe Pereira Sarmento         Criado 24/03/2022 - Última Atualização 24/03/2022
*************************************************************************************************/
public class TPessoa{
    
    // Atributos
    int idade;
    char sexo;
    String nome;
    
    
    // Construtor
    public TPessoa(int i, char s, String n){
        idade = i;
        nome = n;
        sexo = s;
    }
}