package entities.enums;

public enum TipoDeDocumento {

    RG("RG - Registro Geral"),
    CPF("CPF - Cadastro de Pessoas Físicas"),
    CNPJ("CNPJ - Cadastro Nacional da Pessoa Jurídica");

    private String descricao;

    private TipoDeDocumento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}