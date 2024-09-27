package exception;

public class NumeroInvalidoException extends Exception{
private int codigoErro;
public NumeroInvalidoException(String msg, int codigo) {
	super(msg);
	this.codigoErro = codigo;
}
public int getCodigoErro() {
	return codigoErro;
}
}
