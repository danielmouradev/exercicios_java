package entities;

public class ContaBancaria {
    private Integer numeroDaConta;
    protected Double saldo;
    private String banco;

    public ContaBancaria(Double saldo, Integer numeroDaConta, String banco) {
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
        this.banco = banco;
    }

    public ContaBancaria(){}

    public void depositar(Double valor){
        saldo += valor;
    }

    public void sacar (Double valor){
        saldo -= valor;
    }

    public void mostrarSaldo(){
        System.out.println("SALDO ATUALIZADO: " + getSaldo());
    }

    public Double getSaldo() {
        return saldo;
    }


    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}
