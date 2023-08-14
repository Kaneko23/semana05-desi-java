package semana05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        ArrayList<Cachorro> dogsList = new ArrayList<>();
        Pessoa donoUm =new Pessoa("Lucas", "rua do sei lá", "47-993840049");
        dogsList.add(new Cachorro("Princesa", 2, "PitBull", "Grande", donoUm));

        dogsList.add(new Cachorro("Destruidor", 10, "Pincher", "Pequeno", donoUm));
       
        
        for(Cachorro dog : dogsList){
            System.out.println(dog.getNome() + " - " +  dog.getDono().getNome());
        }
        //System.out.println(cachorroUm.getNome() + " e " + cachorroDois.getNome());
    }

}
