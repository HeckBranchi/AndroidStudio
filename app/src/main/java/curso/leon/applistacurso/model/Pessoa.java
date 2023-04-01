package curso.leon.applistacurso.model;

public class Pessoa {

    private String primeiroNome;
    private String sobrenomee;
    private String nomeCurso;
    private String telefoneContato;

    public Pessoa(){

    }


    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenomee() {
        return sobrenomee;
    }

    public void setSobrenomee(String sobrenomee) {
        this.sobrenomee = sobrenomee;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobrenomee='" + sobrenomee + '\'' +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}

