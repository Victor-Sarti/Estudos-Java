package adoEstruraII;
 
public class Fila<T> {
 
private T[] filaPreferencial;
 
private T[] filaComum;
 
private int totalPreferencial;
 
private int totalComum;
 
private int contadorAtendimentosPreferencial;
 
private int senhaAtual;
 
public Fila() {
 
filaPreferencial = (T[]) new Object[10];
 
filaComum = (T[]) new Object[10];
 
totalPreferencial = 0;
 
totalComum = 0;
 
contadorAtendimentosPreferencial = 0;
 
senhaAtual = 1;
 
}
 
public void solicitarSenha(boolean prioridade) {
 
Paciente paciente = new Paciente(senhaAtual++, prioridade);
 
if (prioridade) {
 
if (totalPreferencial == filaPreferencial.length) {
 
expandirFila(filaPreferencial);
 
}
 
filaPreferencial[totalPreferencial++] = (T) paciente;
 
System.out.println("Paciente com senha " + paciente.getSenha() + " adicionado a fila de preferencial.");
 
} else {
 
if (totalComum == filaComum.length) {
 
expandirFila(filaComum);
 
}
 
filaComum[totalComum++] = (T) paciente;
 
System.out.println("Paciente com senha " + paciente.getSenha() + " adicionado a fila comum.");
 
}
 
}
 
public void excluirSenha(boolean prioridade) {
 
if (prioridade) {
 
if (totalPreferencial > 0) {
 
removerDaFila(filaPreferencial, totalPreferencial);
 
totalPreferencial--;
 
System.out.println("Senha removida da fila de preferencial.");
 
} else {
 
System.out.println("Nao há senhas na fila de preferencial.");
 
}
 
} else {
 
if (totalComum > 0) {
 
removerDaFila(filaComum, totalComum);
 
totalComum--;
 
System.out.println("Senha removida da fila comum.");
 
} else {
 
System.out.println("Nao há senhas na fila comum.");
 
} }
 
}
 
public void listarSenhas() {
 
System.out.println("Senhas na fila de preferencial:");
 
for (int i = 0; i < totalPreferencial; i++) {
 
System.out.println(filaPreferencial[i]);
 
}
 
System.out.println("Senhas na fila comum:");
 
for (int i = 0; i < totalComum; i++) {
 
System.out.println(filaComum[i]);
 
}
 
}
 
public void visualizarProximo() {
 
if (totalPreferencial > 0 && (contadorAtendimentosPreferencial < 3 || totalComum == 0)) {
 
System.out.println("Proximo a ser atendido: " + filaPreferencial[0]);
 
} else if (totalComum > 0) {
 
System.out.println("Proximo a ser atendido: " + filaComum[0]);
 
} else {
 
System.out.println("Nao ha pacientes na fila.");
 
}
 
}
 
public void chamarProximo() {
 
if (totalPreferencial > 0 && (contadorAtendimentosPreferencial < 3 || totalComum == 0)) {
 
System.out.println("Chamando paciente: " + filaPreferencial[0]);
 
removerDaFila(filaPreferencial, totalPreferencial);
 
totalPreferencial--;
 
contadorAtendimentosPreferencial++;
 
} else if (totalComum > 0) {
 
System.out.println("Chamando paciente: " + filaComum[0]);
 
removerDaFila(filaComum, totalComum);
 
totalComum--;
 
contadorAtendimentosPreferencial = 0;
 
} else {
 
System.out.println("Nao ha pacientes para serem atendidos.");
 
} }
 
private void removerDaFila(T[] fila, int total) {
    for (int i = 1; i < total; i++) {
 
fila[i - 1] = fila[i];
 
}
 
fila[total - 1] = null;
 
}
 
private void expandirFila(T[] fila) {
 
T[] novaFila = (T[]) new Object[fila.length * 2];
 
System.arraycopy(fila, 0, novaFila, 0, fila.length);
 
if (fila == filaPreferencial) {
 
filaPreferencial = novaFila;
 
} else {
 
filaComum = novaFila;
 
}
 
}
 
