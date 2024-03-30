package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCPF("333222211");
        pessoa1.setNome("Daniele");
        pessoa1.setIdade(33);

        Professor professor1 = new Professor();
        professor1.setNome("Emerson");
        professor1.setIdade(33);
        professor1.setCPF("444898933");
        professor1.setSalario(50000);

        System.out.println(professor1.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setNome("Jonathan");
        aluno.setIdade(23);
        aluno.setCPF("444898933");
        aluno.setMatricula("808721");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
