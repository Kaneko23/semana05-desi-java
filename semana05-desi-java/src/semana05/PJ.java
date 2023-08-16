/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana05;

/**
 *
 * @author Kaneko
 */
public class PJ extends Pessoa {
    
    private String cnpj;
    public PJ(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        
        this.cnpj = cnpj;
        
    }
    public boolean validaDocumento(String documento) {
        return true;
    }
}
