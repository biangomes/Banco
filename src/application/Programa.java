package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner resp = new Scanner(System.in);

        double deposito;

        System.out.print("Entre com o número da conta: ");
        int numero = resp.nextInt();
        System.out.printf("Entre com o nome do titular: ");
        String nome = resp.next();

        Conta conta = new Conta(numero, nome, deposito=0.0);

        System.out.println("1 - depósito inicial\n2 - sem depósito inicial");
        int escolha = resp.nextInt();

        if (escolha == 1) {
            System.out.println("Entre com o depósito inicial: ");
            double depositoInicial = resp.nextDouble();
            conta.setDeposito(depositoInicial);
        }

        System.out.println("Dados da conta");
        System.out.printf("Conta %d, Titular: %s, Saldo: $ %.2f", conta.getNumConta(), conta.getNomeTitular(), conta.getSaldo());

        System.out.print("\nValor do depósito: ");
        conta.setDeposito(resp.nextDouble());
        System.out.println("\n");
        System.out.println(conta.toString());

        System.out.print("Valor do saque: ");
        conta.setSaque(resp.nextDouble());
        System.out.println("\n");
        System.out.println(conta.toString());
    }
}
