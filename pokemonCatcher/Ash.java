package pokemonCatcher;

import java.awt.Point;
import java.util.HashSet;

public class Ash{
    private int pokemonCounter;
    private Point currentHouse;
    private HashSet<Point> seenHouses;

    public Ash(){
        this.pokemonCounter = 1;
        this.currentHouse = new Point(0,0);
        this.seenHouses = new HashSet<Point>();
        seenHouses.add(this.currentHouse);
    }

    public int getPokemonCounter(){
        return pokemonCounter;
    }

    public void moveNorth(){
        this.currentHouse.translate(0, 1);
        catchPokemon();
    }

    public void moveSouth(){
        this.currentHouse.translate(0, -1);
        catchPokemon();
    }

    public void moveEast(){
        this.currentHouse.translate(1, 0);
        catchPokemon();
    }

    public void moveWest(){
        this.currentHouse.translate(-1, 0);
        catchPokemon();
    }

    private void catchPokemon(){
        boolean pokemonPresent = !seenHouses.contains(currentHouse);
        if (pokemonPresent){
            pokemonCounter++;
        }
    }
}