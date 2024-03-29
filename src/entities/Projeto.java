package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {
	
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private Date dtInicio;
	private Date dtTermino;
	private List<Contratacao> listaContratacao = new ArrayList<>();
	
	public Projeto(String nome, Date dtInicio, Date dtTermino) {
		this.nome = nome;
		this.dtInicio = dtInicio;
		this.dtTermino = dtTermino;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Date getDtTermino() {
		return dtTermino;
	}
	public void setDtTermino(Date dtTermino) {
		this.dtTermino = dtTermino;
	}

	public boolean adicionarContratacao(Contratacao contratacao) {
		
		if ( contratacao != null && !listaContratacao.contains(contratacao) ) {
			this.listaContratacao.add(contratacao);
			return true;
		}
		
		return false;
	}
	
	public boolean removerContratacao(Contratacao contratacao) {
		
		if ( contratacao != null && listaContratacao.size() > 0 && listaContratacao.contains(contratacao) ) {
			this.listaContratacao.remove(contratacao);
			return true;
		}
		
		return false;
	}	
	
	public void listarContratacoes() {
	
		System.out.println();
		System.out.println("***Contratações***");
		System.out.println("Projeto: \n\t" + this.nome);
		
		if (listaContratacao.isEmpty()) {
			System.out.println("Sem contratações!");
		}
		else {
			System.out.println("Funcionario(s): ");
			for (Contratacao c : this.listaContratacao ) {
				System.out.println("\t" + c.getFuncionario().getNome() + " [Status: "+ c.getStatus() + "]");
			}
		}
	}
	
	public String toString() {
		return "Projeto [nome=" + nome + ", dtInicio=" + df.format(dtInicio) + ", dtTermino=" + df.format(dtTermino) + "]";
	}
}