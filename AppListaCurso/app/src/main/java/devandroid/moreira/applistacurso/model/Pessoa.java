package devandroid.moreira.applistacurso.model;

public class Pessoa {

     String primeiroNome;
     String sobreNome;
     String cursoDesejado;
     String telefoneContato;

    public Pessoa(){

    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public String getCursoDesejado() {
        return cursoDesejado;
    }
    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }
    public String getTelefoneContato() {
        return telefoneContato;
    }
    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return "" +
                "-" + primeiroNome +
                "-" + sobreNome +
                "-" + cursoDesejado +
                "-" + telefoneContato
                ;
    }
}
