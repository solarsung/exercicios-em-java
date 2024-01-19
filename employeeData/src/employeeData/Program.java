package employeeData;
import java.util.Scanner;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Digite nome do funcionario: ");
		funcionario.nome = sc.next();
		
		System.out.print("Digite o salario bruto do funcionario: ");
		Funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Digite o valor total de impostos: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.print("Digite a porcentagem de aumento: ");
		funcionario.porcentagem = sc.nextDouble();

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Informações do funcionario:");
		System.out.println(funcionario.nome + ", R$" + funcionario.calculoSalarioLiquido());
		System.out.println("Salario atualizado com aumento " + funcionario.calculoAumentoSalario());
		

		sc.close();
	}

}
