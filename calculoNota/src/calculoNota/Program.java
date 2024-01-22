package calculoNota;
import java.util.Scanner;
import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("Digite o nome do estudante: ");
		estudante.nome = sc.next();

		System.out.print("Digite a nota do primeiro trimestre: ");
		estudante.notaPrimeiroTrimestre = sc.nextDouble();
		
		System.out.print("Digite a nota do segundo trimestre: ");
		estudante.notaSegundoTrimestre = sc.nextDouble();
		
		System.out.print("Digite a nota do terceiro trimestre: ");
		estudante.notaTerceiroTrimestre = sc.nextDouble();
		
		estudante.resultFinal();
		

	}

}
