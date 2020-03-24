package sample;

import java.util.Random;

public class Tile {
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tile(){
        Random rnd = new Random();
        setId(rnd.nextInt(5)+5);
    }

}
