package entities.enums;

public enum Status {

	PENDENTE("Funcionário Pendente"),
	CONTRATADO("Funcionário Contratado"),
	DEMITIDO("Funcionário Demitido");
	
	private String descricao;
	
	Status(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}