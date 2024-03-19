package tech.devinhouse.aula04.excecoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) throws IOException {
        
        try {
            Files.createFile(Paths.get("sapato.txt"));

            if (LocalDate.now().getDayOfMonth() ==  25)
                throw new CalculadoraException();

        } catch (IOException e) {  // este catch eh obrigatorio pq eh uma excecao checked
            e.printStackTrace();
        } catch (CalculadoraException e) {  // como eh unchecked, este catch nao eh obrigatorio
            System.out.println("hj eh dia 25 e eu nao quero que vc faça conta!");
        }
        
    }
}
