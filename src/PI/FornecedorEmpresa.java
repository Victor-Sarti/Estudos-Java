package PI;

public class FornecedorEmpresa extends HerancaFornecedor{
	private String ie, cnpj;

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public FornecedorEmpresa(String nome, String fone, String ie, String cnpj) {
		super(nome, fone);
		setIe(ie);
		setCnpj(cnpj);
	}

	@Override
	public String toString() {
		return "FornecedorEmpresa [ "
				+ " Nome= " + super.getNome() 
				+ ", Fone= " + super.getFone() 
				+ "IE= " + ie + ", CNPJ= " + cnpj+ "]";
	}
}