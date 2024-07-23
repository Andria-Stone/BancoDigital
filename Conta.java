public class Conta {
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = 1; //Exemplo agência física
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$"+ valor + " realizado com sucesso!");
        }
        else{
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && saldo >= valor){
            saldo-= valor;
            System.out.println("Saque de R$"+valor+" realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente ou valor de saque inválido!");
        }
    }

    public void transferir(double valor, Conta contaDestino){
        if( valor >0 && saldo >= valor){
            this.sacar(valor);

            contaDestino.depositar(valor);

            System.out.println("Transferência realizada com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente ou valor de tranferência inválido!");
        }
    }

    public void exibirSaldo(){
        System.out.print("------------------------------------------------------");
        System.out.println("Cliente: "+cliente.getNome());
        System.out.println("Agêcia: "+ agencia + "Conta: " + numero);
        System.out.println("Saldo: R$"+ saldo);
        System.out.print("------------------------------------------------------");

    }

}
