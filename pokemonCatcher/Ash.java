package pokemoncatcher;

import java.awt.Point;
import java.util.HashSet;

public class Ash {

    private int pokemonCounter;
    private Point currentHouse;
    private HashSet<Point> visitedHouses;

    public Ash() {
        this.pokemonCounter = 1;
        this.currentHouse = new Point(0,0);
        this.visitedHouses = new HashSet<Point>();
        visitedHouses.add(new Point(this.currentHouse));
    }

    public int traversePath(String path) {
        int totalSteps = path.length();
        for (int i = 0; i < totalSteps; i++){
            char nextDirection = path.charAt(i);
            switch (nextDirection) {
                case 'N':
                    move(0,1);
                    break;
                case 'S':
                    move(0,-1);
                    break;
                case 'E':
                    move(1,0);
                    break;
                case 'O':
                    move(-1,0);
                    break;
                default:
                    return -1;
            }
        }
        return pokemonCounter;
    }

    private void move(int x, int y) {
        Point newHouse = new Point(currentHouse);
        newHouse.translate(x, y);
        currentHouse = newHouse;
        visitHouse();
        visitedHouses.add(currentHouse);
    }

    private void visitHouse() {
        boolean pokemonPresent = !visitedHouses.contains(currentHouse);
        if (pokemonPresent){
            pokemonCounter++;
        }
    }
}