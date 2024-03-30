package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String CPF;


    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return this.CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }  

    String imprimirDadosDaPessoa(){
        return "O nome da pessoa é " + nome + " a idade é "
            + idade + " e o documento é " + CPF;
    }
}
