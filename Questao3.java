public class Questao3 {
    public static void main(String[] args){
        Produto carne = new Produto(123, "Carne", 67.89, 1500);
        carne.exibirInfo();

        ContaCorrente user1 = new ContaCorrente(123, "Eduardo Nobrega", 5000);

        user1.consultarSaldo();
        user1.depositar(1500);
        user1.sacar(500);
        user1.consultarSaldo();
        user1.sacar(7000);
        user1.sacar(700);
        user1.depositar(10500);
        user1.consultarSaldo();

    }
}
