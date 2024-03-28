package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    //construtor
    public ContaBancaria(){
        this.saldo = 0.0;
    }

    //depositar
    void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " Saldo altual R$ " + saldo);
        }else{
            System.out.println("Valor de depósito inválido");
        }
    }

    //sacar
    void sacar(double valor){
        if((valor > 0) && (saldo > valor)){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " Saldo altual R$ " + saldo);
        }else{
            System.out.println("Não foi possível realizar a operação");
        }
    }

    //getters e setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
