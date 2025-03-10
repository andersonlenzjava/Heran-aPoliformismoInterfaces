package cursojava.constantes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
	this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
	return disciplinas;
	}

	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	/*
	 * /* M�todo get com retorno de um double com o c�lculo da m�dia do aluno
	 */
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		//la�o para fazer uma varedura de todos os atributos do atributo nota
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		}
		return somaNotas / disciplinas.size();
	}

	/* Chamo o m�todo dentro do proprio m�todo */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	/* Normalmente � usado boolean, string fica mais para telas */
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if(media >= 70) {
				if(media > 90) { 
					return StatusAluno.SUPERAPROVADO;
				}else {
					return StatusAluno.APROVADO;
				}
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}	

	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}
	
	@Override
	public boolean pessoaMaiorIdade() {

		return idade >= 21;
	}
	//um m�todo que aproveita o outro deste mesmo objeto, e faz alguma l�gica e retorna algo 
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Aluno � maior de idade " : "Aluno menor de idade";
	}

	@Override
	public double salario() {

		return 1500.90;
	}
}
