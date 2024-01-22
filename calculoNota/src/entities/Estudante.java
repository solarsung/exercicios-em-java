package entities;

public class Estudante {
	
	public String nome;
	public double notaPrimeiroTrimestre;
	public double notaSegundoTrimestre;
	public double notaTerceiroTrimestre;
	public double somaNota;

	
	public double notaAnual() {
		somaNota = (notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre );
		return somaNota;
	}
	
	public void resultFinal(){

		if (notaAnual() >= 25) {
			System.out.println("Ola, " + nome + "! Voce passou! Parabens!");
		}else {
			System.out.println("Você fracassou, " + nome + ". Para obter a nota minima você necessita de " + (25 - notaAnual()) + " pontos.");
		
	}

}
}
