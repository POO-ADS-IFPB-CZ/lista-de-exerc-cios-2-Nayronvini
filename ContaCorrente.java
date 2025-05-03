public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        setSaldo(saldo);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Não é possível definir um saldo negativo.");
        }
    }

    public void sacar(float valor) {
        if (valor < 0) {
            System.out.println("O valor do saque não pode ser negativo.");
        } else if (valor <= saldo && valor <= 10000) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else if (valor > 10000) {
            System.out.println("Não é possível sacar valores acima de 10000.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(float valor) {
        if (valor < 0) {
            System.out.println("O valor do depósito não pode ser negativo.");
        } else if (valor > 10000) {
            System.out.println("Não é possível depositar valores acima de 10000.");
        } else if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor depositado deve ser maior que 0.");
        }
    }

    public void consultarSaldo() {
        System.out.println("O saldo de " + titular + " é R$ " + saldo);
    }
}

