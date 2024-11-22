
package pokemonCatcher;

import java.util.Scanner;

public class PokemonCatcher {

    public static void main(String[] args) {

        Ash ash = new Ash();

        Scanner scanner = new Scanner(System.in);
        String cardinalPath = scanner.next();

        int totalSteps = cardinalPath.length();

        for (int i = 0; i < totalSteps; i++){
            char nextDirection = cardinalPath.charAt(i);
            switch (nextDirection) {
                case 'N':
                    ash.moveNorth();
                    break;
                case 'S':
                    ash.moveSouth();
                    break;
                case 'E':
                    ash.moveEast();
                    break;
                case 'O':
                    ash.moveWest();
                    break;
            
                default:
                    break;
            }
        }

        int pokemonCaught = ash.getPokemonCounter();

        System.out.println(pokemonCaught);
        scanner.close();
    }
    
}
