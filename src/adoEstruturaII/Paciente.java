package ado2PI;
public class Paciente {
 
 
public int senha;
 
public boolean preferencial;
 
public Paciente(int senha, boolean preferencial) {
 
this.senha = senha;
 
this.preferencial = preferencial;
 
}
 
public int getSenha() {
 
return senha;
 
}
 
public void setSenha(int senha) {
 
this.senha = senha;
 
}
 
public boolean isPreferencial() {
 
return preferencial;
 
}
 
public void setPreferencial(boolean preferencial) {
 
this.preferencial = preferencial;
 
}
 
public boolean preferencial(){
 
return preferencial;
 
}
 
@Override
 
public String toString() {
 
return "Paciente " + "senha=" + senha + ", preferencial=" + preferencial;
 
}
}