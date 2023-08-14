
package semana05;

/**
 *
 * @author Kaneko
 */
public class Cachorro {

    public Cachorro(String nome, int idade, String raca, String porte, Pessoa dono) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.dono = dono;
        
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getDono() {
        return dono;
    }
    

   
    
    private String nome;
    private String raca;
    private int idade;
    private String porte;
    private Pessoa dono;

    

}
