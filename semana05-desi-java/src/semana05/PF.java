/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana05;

/**
 *
 * @author Kaneko
 */
public class PF extends Pessoa {
    private String cpf;
    public PF(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }
    
    public boolean validaDocumento(String documento) {
        return true;
    }
}
