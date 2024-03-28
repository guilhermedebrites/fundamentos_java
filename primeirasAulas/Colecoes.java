package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Guilherme", 10);
        notas.put("Anna Clara", 5);
        notas.put("Cristina", 2);
        notas.put("Mathias", 7);

        Integer nota = notas.get("Anna Clara");
        System.out.println(nota);

        for(Map.Entry<String, Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println("A chave é: " + key + " e o valor é: " + value);
        }
    }
}
