package application;

public class Conta {

    private int numConta;
    private String nomeTitular;
    private double depoInicial;
    private double saldo;
    private static final double taxa = 5.0;


    public Conta(int numConta, String nomeTitular, double depoInicial) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.depoInicial = depoInicial;
    }


    // Depósito inicial é OPCIONAL
//	public Cap9ex1(int numConta, String nomeTitular) {
//		this.numConta = numConta;
//		this.nomeTitular = nomeTitular;
//		this.saldo = 0.0;
//	}

    public int getNumConta() {
        return this.numConta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setDeposito(double valor) {
        saldo = saldo + valor;
    }

    public void setSaque(double valor) {
        saldo = saldo - valor - taxa;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta " + String.format("%d", getNumConta()) + ", Titular: " + String.format("%s", getNomeTitular()) + ", Saldo: $ " + String.format("%.2f", getSaldo());
    }
}