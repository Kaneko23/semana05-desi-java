package semana05;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {        
        
        ArrayList<Conta> bank = new ArrayList<>();
        Pessoa p = new Pessoa( "192.929.345-34", "Kaue", "rua das Laranjeiras", "48 - 9393933933");
        Pessoa p2 = new Pessoa( "145.934.325-34", "Lucas", "rua das casas pah", "48 - 8737495824");
        Pessoa p3 = new Pessoa( "145.234.565-22", "Erik", "Av sei lá", "48 - 7376495029");

        bank.add(new Conta(p));
        bank.add(new Conta(p2));
        bank.add(new Conta(p3));
        bank.get(0).depositar(5000.0);
        bank.get(0).sacar(500.0);
        
        for(Conta conta: bank){
            
            System.out.println(conta.getTitulo().getNome());
            System.out.println(" ");
        }












    }

}
