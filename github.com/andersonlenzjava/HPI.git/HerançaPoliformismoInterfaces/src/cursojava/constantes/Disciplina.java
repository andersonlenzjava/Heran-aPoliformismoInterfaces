package cursojava.constantes;

import java.util.Arrays;

public class Disciplina {
	
	// Cada disciplinas ter� 4 m�dias o ano inteiro 
	private double[] nota = new double[4];
	private String disciplina;

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}

	//calcula a m�dia das notas do bimestre que s�o 4, e retorna para fazer a m�dia das disciplinas
	public double getMediaNotas() {

		double somaTotal = 0;

		for (int pos = 0; pos < nota.length; pos++) {
			somaTotal += nota[pos];

		}
		return somaTotal / 4;
	}

	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
