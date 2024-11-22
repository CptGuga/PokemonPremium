package pokemoncatcher;

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
        seenHouses.add(new Point(this.currentHouse));
    }

    public int getPokemonCounter(){
        return pokemonCounter;
    }

    public void moveNorth(){
        moveGeneric(0, 1);
    }

    public void moveSouth(){
        moveGeneric(0, -1);
    }

    public void moveEast(){
        moveGeneric(1, 0);
    }

    public void moveWest(){
        moveGeneric(-1, 0);
    }

    private void moveGeneric(int x, int y){
        Point newHouse = new Point(currentHouse);
        newHouse.translate(x, y);
        currentHouse = newHouse;
        catchPokemon();
        seenHouses.add(currentHouse);
    }

    private void catchPokemon(){
        boolean pokemonPresent = !seenHouses.contains(currentHouse);
        System.out.println(pokemonPresent);
        System.out.println(currentHouse);
        System.out.println(seenHouses);
        if (pokemonPresent){
            pokemonCounter++;

        }
    }
}