package pokemoncatcher;

import java.util.Scanner;

public class PokemonCatcher {

    public static void main(String[] args) {

        Ash ash = new Ash();

        Scanner scanner = new Scanner(System.in);
        String cardinalPath = scanner.nextLine();
        scanner.close();

        int pokemonCaught = ash.traversePath(cardinalPath);

        if (pokemonCaught == -1) {
            System.out.println("Error: Invalid Character");
        } else {
            System.out.println(pokemonCaught);
        }
        
    }
    
}
