package entities;

public class Funcionario {
	
	//Os códigos da linha 6-8 são os atributos da classe Funcionario.
	//Toda classe é composta de atributos. É onde alocamos as variáveis que serão manipuladas no programa principal.
	//Utiliza-se a palavra PUBLIC para que todo o programa tenha acesso e possa manipulá-la
	public String nome;
	public static double salarioBruto;
	public double imposto, salarioLiquido, porcentagem;

	//Os códigos da linha 11-12 são os metodos da minha classe.
	//Os metodos podem retornar valores, ou não. 
	//Metodos que não retornam nada possuem a palavra VOID no parametro
	//Metodos que retornam algum valor possuem a presença da palavra RETURN
	//No caso do código abaixo, esse método calcula o salário líquido, então ele deve me retornar um valor.
	public double calculoSalarioLiquido(){
		salarioLiquido = (salarioBruto - imposto);
		
		return salarioLiquido;
	}

	public double calculoAumentoSalario(){
		double aumentoSalario = (salarioBruto * (porcentagem / 100));
		
		return aumentoSalario;
}
	
}
