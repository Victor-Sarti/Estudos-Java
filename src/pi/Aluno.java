package pi;

public class Aluno {
String ra, nome, telefone, cep;
double nota1, nota2;
public String getRa() {
	return ra;
}
public void setRa(String ra) {
	this.ra = ra;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public double getNota1() {
	return nota1;
}
public void setNota1(double nota1) {
	this.nota1 = nota1;
}
public Aluno(String ra, String nome, String telefone, String cep, double nota1, double nota2) {
	super();
	this.ra = ra;
	this.nome = nome;
	this.telefone = telefone;
	this.cep = cep;
	this.nota1 = nota1;
	this.nota2 = nota2;
}
public double getNota2() {
	return nota2;
}
public void setNota2(double nota2) {
	this.nota2 = nota2;
}
@Override
public String toString() {
	return "Aluno [ra=" + ra + ", nome=" + nome + ", telefone=" + telefone + ", cep=" + cep + ", nota1=" + nota1
			+ ", nota2=" + nota2 + "]";
}

}
