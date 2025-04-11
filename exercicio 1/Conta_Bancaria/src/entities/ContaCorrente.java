package entities;

public class ContaCorrente extends ContaBancaria{

    private String titular;
    private String cpfTitular;

    public ContaCorrente(){}

    public ContaCorrente(Double saldo, Integer numeroDaConta, String banco) {
        super(saldo, numeroDaConta, banco);
        this.titular = titular;
        this.cpfTitular = cpfTitular;
    }

    @Override
    public void depositar(Double valor) {
        super.depositar(valor);
        saldo += 0.05;
    }

    @Override
    public void sacar(Double valor){
      saldo = saldo - valor - 0.01;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }
}
