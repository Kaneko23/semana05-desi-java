/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana05;

import java.util.Random;

/**
 *
 * @author Kaneko
 */
public class Conta {

    public Conta(Pessoa titulo) {
        this.saldo = 0.0;
        this.titulo = titulo;
        this.numConta = gerarNumConta();
    }
    

    public int getNumConta() {
        return numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Pessoa getTitulo() {
        return titulo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf(this.titulo.getNome() + " " + "Saldo apos deposito: R$%.2f", this.saldo);
            System.out.println(" ");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo && valor > 0) {
            this.saldo -= valor;
            System.out.printf(this.titulo.getNome() + " " + "Saldo apos saque: R$%.2f", this.saldo);
            System.out.println(" ");
        }
    }

    public void transferir(Conta destinatario, double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destinatario.saldo += valor;
            System.out.println(this.titulo.getNome() + " está transferindo: " + valor + " para "+ destinatario.getTitulo().getNome());
            System.out.printf(this.titulo.getNome() + ": " + "Saldo apos transferencia: R$%.2f", this.saldo);
            System.out.println(" ");
            System.out.printf(destinatario.getTitulo().getNome() + ": " + "Saldo apos transferencia: R$%.2f", destinatario.getSaldo());
            System.out.println(" ");
        } else {
            System.out.println("error!!!! (saldo insuficiente)");
        }
    }

    private int gerarNumConta() {
        Random random = new Random();
        return random.nextInt(90000) + 10000;
    }
    private int numConta;
    private Double saldo;
    private Pessoa titulo;
}
