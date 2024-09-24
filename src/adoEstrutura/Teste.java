
package adoEstrutura;
import java.util.Scanner;
public class Teste {
 
public static void main(String[] args) {
 
Fila<Paciente> fila = new Fila<>();
 
Scanner scanner = new Scanner(System.in);
 
int opcao;
 
do {
 
System.out.println("Escolha uma opção");
System.out.println(" 1 Solicitar Nova Senha");
System.out.println("2 Excluir senha");
System.out.println("3 Listar todas as senhas");
System.out.println(" 4 Vizualizar proximo da fila");
System.out.println("5 Chamar proxima senha");
System.out.println(" 6 Encerrar programa");
 
opcao= scanner.nextInt();
 
switch(opcao) {
 
case 1: 
 
solicitarSenha(fila,scanner);
 
break;
 
case 2: 
 
excluirSenha(fila,scanner);
 
break;
 
case 3: 
 
fila.listarSenhas();
 
break;
 
case 4: 
 
fila.visualizarProximo();
 
break;
 
case 5: 
 
fila.chamarProximo();
 
break;
 
case 6: 
 
System.out.println("Sua fila encerrou dessa forma: ");
 
fila.listarSenhas();
 
break;
 
}
 
}while (opcao != 6);
 
}
private static void solicitarSenha(Fila<Paciente> fila, Scanner scanner) {
System.out.println(" 1 Paciente Preferencial || 2 Paciente comum");
int resposta = scanner.nextInt();
boolean prioridade = (resposta == 1);
fila.solicitarSenha(prioridade);
}
private static void excluirSenha(Fila<Paciente> fila, Scanner scanner) {
 
System.out.println("Excluir senha de qual fila? (1 Paciente Preferencial || 2 Paciente comum):");
 
int resposta = scanner.nextInt();
 
boolean prioridade = (resposta == 1);
 
fila.excluirSenha(prioridade);
}
}