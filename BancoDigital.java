public class BancoDigital {
public static void main(String[] args) {

     Banco banco = new Banco("Banco Digital");
    
    Cliente cliente1 = new Cliente("João", "12345678900");
    Cliente cliente2 = new Cliente("Maria", "98765432100");
    
    Conta contaCorrente = new ContaCorrente(cliente1);
    Conta contaPoupanca = new ContaPoupanca(cliente2);
    
    banco.adicionarConta(contaCorrente);
    banco.adicionarConta(contaPoupanca);
    
    contaCorrente.depositar(500.0);
    contaCorrente.transferir(200.0, contaPoupanca);
    
    contaCorrente.exibirSaldo();
    contaPoupanca.exibirSaldo();
    }
}
