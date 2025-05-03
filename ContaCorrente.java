public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    private int getNumero() {
        return numero;
    }

    private float getSaldo() {
        return saldo;
    }

    private String getTitular() {
        return titular;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    private void setTitular(String titular) {
        this.titular = titular;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float valor){
        if((valor <= saldo) && (valor <= 10000)){
            saldo -= valor;
        } else if (valor > 10000){
          System.out.println("Não é possivel sacar valores acima de 10000");
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void depositar(float valor){
        if((valor > 0) && (valor <= 10000)){
            saldo += valor;
        } else if (valor > 10000){
            System.out.println("Não é possivel depositar valores acima de 10000");
        } else {
            System.out.println("O valor epositado deve ser maior que 0");
        }
    }

    public void consultarSaldo(){
        System.out.println("O saldo de " + titular + " é " + saldo);
    }
}
