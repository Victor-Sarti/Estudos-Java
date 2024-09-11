package adoPI;
//VICTOR GABRIEL SARTI MIRANDA 

import javax.swing.JOptionPane;

public class CalculoIMC {
	private double altura;
	private double peso;

	public CalculoIMC() {

	}

	public CalculoIMC(double altura, double peso, int sexo) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double CalcularIMC() {
		return peso / (altura * altura);
	}

	public void IMC() {
		double imc = CalcularIMC();
		if (getSexo().equals("Masculino")) {
			if (imc < 20) {
				JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
			} else if (imc >= 20 && imc <= 24.9) {
				JOptionPane.showMessageDialog(null, "Você está no peso ideal");
			} else if (imc >= 25 && imc <= 29.9) {
				JOptionPane.showMessageDialog(null, "Você está com obsesidade leve");
			} else if (imc >= 30 && imc <= 39.9) {
				JOptionPane.showMessageDialog(null, "Você está com obsesidade moderada");
			} else {
				JOptionPane.showMessageDialog(null, "Você está com obsesidade mórbida");
			}
		} else {
			if (imc < 19) {
				JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
			} else if (imc >= 19 && imc <= 23.9) {
				JOptionPane.showMessageDialog(null, "Você está no peso ideal");
			} else if (imc >= 24 && imc <= 28.9) {
				JOptionPane.showMessageDialog(null, "Você está com obsesidade leve");
			} else if (imc >= 29 && imc <= 38.9) {
				JOptionPane.showMessageDialog(null, "Você está com obsesidade moderada");
			} else {
				JOptionPane.showMessageDialog(null, "Você está com obsesidade mórbida");
			}
		}
	}

	private Object getSexo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "CalculoIMC [altura=" + altura + ", peso=" + peso + ", getAltura()=" + getAltura() + ", getPeso()="
				+ getPeso() + ", CalcularIMC()=" + CalcularIMC() + ", getSexo()=" + getSexo() + "]";
	}

	public void setSexo(int int1) {
		// TODO Auto-generated method stub
		
	}
}
