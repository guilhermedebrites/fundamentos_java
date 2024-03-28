package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();

        nomes.add("Guilherme");
        nomes.add("Anna Clara");
        nomes.add("Cristina");
        nomes.add("Mathias");

        System.out.println("Acessando possição específica:");
        System.out.println(nomes.get(1));
        System.out.println("Finalizado");

        for( String nome : nomes ){
            System.out.println("O nome é: " + nome);
        }

        nomes.forEach(nome -> System.out.println("O nome que apareceu foi: " + nome));

        nomes.forEach(System.out::println);

    }
}
