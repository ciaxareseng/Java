package entities;

public class Aluno {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaDasNotasDoAluno() {
		
		double soma = (nota1 + nota2 + nota3);
		
		return soma;
	}

	
	public String quantosPontosFaltam() {
		
		if(somaDasNotasDoAluno() < 60.0) {
			double pontosQueFaltam = (60.00 - somaDasNotasDoAluno());
			return String.valueOf(String.format("%.2f", pontosQueFaltam));
		}else {
			
		}
		return String.valueOf(0.0);
		
	}
	public String verificaSeAlunoFoiAprovado() {
		
		if(somaDasNotasDoAluno() >= 60.0) {
			return "PASS";
		}
		else {
			return "FAILED" + "\n" + "MISSING " + quantosPontosFaltam() + " POINTS";
		}
	}
	
public String toString() {
		
		return  "FINAL GRADE = "
				+ String.format("%.2f",somaDasNotasDoAluno())
				+ "\n"
				+ verificaSeAlunoFoiAprovado();
	}
	
}

