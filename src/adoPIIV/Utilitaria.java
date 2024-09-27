package adoPIIV;
//VICTOR GABRIEL SARTI MIRANDA 
import java.util.InputMismatchException;

public class Utilitaria {
	 // Validação de CNPJ
    public static boolean validarCNPJ(String cnpj) {

    	// Remove caracteres não numéricos
cnpj = cnpj.replaceAll("[^0-9]", ""); 
        if (cnpj.length() != 14) return false;

        char dig13, dig14;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
                num = (int) (cnpj.charAt(i) - 48);
                sm += (num * peso);
                peso = (peso == 9) ? 2 : peso + 1;
            }
            r = sm % 11;
            dig13 = (r < 2) ? '0' : (char) ((11 - r) + 48);

            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (cnpj.charAt(i) - 48);
                sm += (num * peso);
                peso = (peso == 9) ? 2 : peso + 1;
            }
            r = sm % 11;
            dig14 = (r < 2) ? '0' : (char) ((11 - r) + 48);

            return (dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13));
        } catch (InputMismatchException erro) {
            return false;
        }
    }

    // Validação de CPF
    public static boolean validarCPF(String cpf) {
       
    	// Remove caracteres não numéricos
    	cpf = cpf.replaceAll("[^0-9]", ""); 
        if (cpf.length() != 11) return false;

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm += (num * peso);
                peso--;
            }
            r = 11 - (sm % 11);
            dig10 = (r == 10 || r == 11) ? '0' : (char) (r + 48);

            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm += (num * peso);
                peso--;
            }
            r = 11 - (sm % 11);
            dig11 = (r == 10 || r == 11) ? '0' : (char) (r + 48);

            return (dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10));
        } catch (InputMismatchException erro) {
            return false;
        }
    }

    // Validação de Inscrição Estadual (IE) para São Paulo
    public static boolean validarIE(String ie) {
       
    	// Remove caracteres não numéricos
    	ie = ie.replaceAll("[^0-9]", ""); 
        if (ie.length() != 12) return false;

        try {
            int soma = 0;
            int peso[] = {1, 3, 4, 5, 6, 7, 8, 10};

            // Primeira parte (8 primeiros dígitos)
            for (int i = 0; i < 8; i++) {
                soma += (ie.charAt(i) - '0') * peso[i];
            }

            int digito1 = soma % 11;
            if (digito1 == 10) digito1 = 0;

            // Verifica o primeiro dígito
            if (digito1 != (ie.charAt(8) - '0')) return false;

            // Segunda parte (restante)
            soma = 0;
            peso = new int[]{3, 2, 10, 9, 8, 7, 6, 5, 4, 3, 2};
            for (int i = 0; i < 11; i++) {
                soma += (ie.charAt(i) - '0') * peso[i];
            }

            int digito2 = soma % 11;
            if (digito2 == 10) digito2 = 0;

            return digito2 == (ie.charAt(11) - '0');
        } catch (InputMismatchException erro) {
            return false;
        }
    }

    // Validação de RG de São Paulo (formato geral)
    
    
    public static boolean validarRGSaoPaulo(String rg) {
    	
         
    	return rg != null && rg.matches("\\d{2}\\.\\d{3}\\.\\d{3}-\\d");
    }}