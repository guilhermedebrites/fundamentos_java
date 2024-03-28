package primeirasAulas;
public class HelloWorld{
    public static void main(String[] args){
        int dadoDoTipoInt = 10;
        // double dadoDoTipoDouble = 10.5;
        // float dadoDoTipoFloat = 10.5f;
        // long dadoDoTipoLong = 10000000000L;
        // char dadoDoTipoChar = 'A';
        // boolean dadoDoTipoBoolean = true;
        // String dadoDoTipoString = "Hello World!";

        if(dadoDoTipoInt == 10){
            System.out.println("Entrou no if");
        }else if(dadoDoTipoInt < 12){
            System.out.println("Entrou no if do 12");
        }else{
            System.out.println("Entrou no else");
        }

        int valorInicial = 0;
        while(valorInicial < 3){
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial++;
        }
        System.out.println("Saiu do while");

        System.out.println("Iniciando o FOR");
        for(int i = 0; i < 4; i++){
            System.out.println("O valor do i é: " + i);
        }
        System.out.println("Finalizando o FOR");
    }
}