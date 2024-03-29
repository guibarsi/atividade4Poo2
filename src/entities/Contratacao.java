package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {

	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date data;
	private Cargo cargo;
	private Funcionario funcionario;
	private Projeto projeto;
	private Status status;

	public Contratacao(Date data, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.data = data;
		this.cargo = cargo;
		this.funcionario = funcionario;
		this.projeto = projeto;
		this.projeto.adicionarContratacao(this);
		this.pendente();
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Projeto getProjeto() {
		return projeto;
	}
	
	public Status getStatus() {
		return status;
	}

	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		if (this.status == Status.PENDENTE)	{
			this.status = Status.CONTRATADO;
		}		
	}
	
	public void demitir() {
		if (this.status == Status.CONTRATADO)	{
			this.status = Status.DEMITIDO;
			this.projeto.removerContratacao(this);
		}
	}

	public String toString() {
		return "Contratacao [data=" + df.format(data) + ", cargo=" + cargo + ", funcionario=" + funcionario 
				+ ", projeto=" + projeto + ", status=" + status + "]";
	}

}